package br.com.biel.sistema.controllers;

import br.com.biel.sistema.dto.CustomerDTO;
import br.com.biel.sistema.models.Customer;
import br.com.biel.sistema.models.StatusGender;
import br.com.biel.sistema.repositories.CustomerRepository;
import br.com.biel.sistema.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.websocket.server.PathParam;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping(value = "/customers")
public class CustomerController {
    @Autowired
    private CustomerRepository customerRepository;


    @GetMapping
    public ModelAndView index() {

        List<Customer> customers = this.customerRepository.findAll();
        List<CustomerDTO> customerDTOList = Customer.toCustomers(customers);
        ModelAndView mv = new ModelAndView("customers/index");
        mv.addObject("customerDTOList", customerDTOList);

        return mv;

    }

    @GetMapping ("/{id}")
    public ModelAndView details(@PathVariable Long id) {

        Optional<Customer> customer = this.customerRepository.findById(id);
        CustomerDTO customerDTO = Customer.toCustomerDTO(customer.get());
        System.out.println(customerDTO.getId());
        ModelAndView mv = new ModelAndView("customers/details");
        mv.addObject("customerDTO", customerDTO);

        return mv;
    }

    @GetMapping("/{id}/delete")
    public ModelAndView delete(@PathVariable Long id) {

        customerRepository.deleteById(id);
        return index();
    }

    @GetMapping("/new")
    public ModelAndView nnew() {

        ModelAndView mv = new ModelAndView("customers/new");
        mv.addObject("statusGender", StatusGender.values());

        return mv;
    }

    @PostMapping
    public String create(CustomerDTO customerDTO) {

        Customer customer = CustomerDTO.toCustomer(customerDTO);
        System.out.println("fgfgfgfg");
        customer.setCreationDate(LocalDateTime.now());
        customerRepository.save(customer);
        return "redirect:/customers";
    }

    @GetMapping("/{id}/edit")
    public ModelAndView search4Edit (@PathVariable Long id) {
        Optional<Customer> customerOptional = this.customerRepository.findById(id);
        CustomerDTO customerDTO = Customer.toCustomerDTO(customerOptional.get());
        ModelAndView mv = new ModelAndView("customers/edit");
        mv.addObject("statusGender", StatusGender.values());
        mv.addObject("customerDTO", customerDTO);

        return mv;
    }

    @PutMapping
    public String updateCustomer(CustomerDTO customerDTO) {
        System.out.println(customerDTO);
        //Customer customer = CustomerDTO.toCustomer(customerDTO);
        //customerRepository.save(customer);
        return "redirect:/customers";
    }

}
