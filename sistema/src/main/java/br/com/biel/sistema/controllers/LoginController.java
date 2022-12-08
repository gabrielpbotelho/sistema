package br.com.biel.sistema.controllers;


import br.com.biel.sistema.dto.CustomerDTO;
import br.com.biel.sistema.models.Customer;
import br.com.biel.sistema.repositories.CustomerRepository;
import br.com.biel.sistema.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping(value = "/login")
public class LoginController {

    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping ("/{email}") //caminho ou path
    public ModelAndView search4Email (@PathVariable String email) { //metodo que acesso atraves do caminho ou path
        Customer customer = this.customerRepository.findByEmail(email);
        System.out.println(customer);
        ModelAndView mv = new ModelAndView("login"); //recebendo o caminho do templates no construtor
        mv.addObject("customer", customer); // inserindo valores
        //template + objeto = html
        return mv; //devolve para o spring produzir o html que será exibido no navegador
    }


}
