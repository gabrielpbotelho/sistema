package br.com.biel.sistema.controllers;

import br.com.biel.sistema.dto.CustomerDTO;
import br.com.biel.sistema.models.Customer;
import br.com.biel.sistema.models.StatusGender;
import br.com.biel.sistema.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;
import java.util.List;

@Controller
public class CustomerController {
    @Autowired
    private CustomerRepository customerRepository;


    @GetMapping("/customers")
    public ModelAndView index() {

        List<Customer> customers = this.customerRepository.findAll();
        ModelAndView mv = new ModelAndView("customers/index");
        mv.addObject("customers", customers);

        return mv;

    }
    @GetMapping("/customer/new")
    public ModelAndView nnew() {

        ModelAndView mv = new ModelAndView("customers/new");
        mv.addObject("statusGender", StatusGender.values());

        return mv;
    }

    @PostMapping("/customers")
    public String create(CustomerDTO customerDTO) {
        Customer customer = customerDTO.toCustomer();
        System.out.println(customerDTO);
        System.out.println(customer);
        System.out.println("fgfgfgfg");
        customer.setCreationDate(LocalDateTime.now());
        customerRepository.save(customer);
        return "redirect:/customers";
    }
}
