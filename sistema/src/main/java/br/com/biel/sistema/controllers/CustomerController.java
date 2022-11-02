package br.com.biel.sistema.controllers;

import br.com.biel.sistema.models.Customer;
import br.com.biel.sistema.models.StatusGender;
import br.com.biel.sistema.repositories.CustomerRepository;
import org.hibernate.type.LocalDateType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
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
}
