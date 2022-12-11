package br.com.biel.sistema.controllers;


import br.com.biel.sistema.dto.LoginDTO;
import br.com.biel.sistema.models.Customer;
import br.com.biel.sistema.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/login")
public class LoginController {

    @Autowired
    private CustomerRepository customerRepository;

    @PostMapping //caminho ou path
    public String search4Email(LoginDTO loginDTO) { //metodo que acesso atraves do caminho ou path
        Customer customer = this.customerRepository.findByEmail(loginDTO.getEmail());
        System.out.println(loginDTO.getEmail());
        if (customer != null) {
            return "home";
        } else {
            return "login";
        }


    }

    @GetMapping //caminho ou path
    public String search4Email() { //metodo que acesso atraves do caminho ou path
        return "login";
    }
}
