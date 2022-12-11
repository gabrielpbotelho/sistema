package br.com.biel.sistema.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping
    public String home() {
        System.out.println("Passou no lugar rrr");
        return "login"; //renderiza o arquivo templates/home.html
    }
}

