package br.com.biel.sistema.controllers;

import br.com.biel.sistema.dto.CustomerDTO;
import br.com.biel.sistema.models.Customer;
import br.com.biel.sistema.models.Order;
import br.com.biel.sistema.models.StatusGender;
import br.com.biel.sistema.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping(value = "/orders")
public class OrderController {

    @Autowired
    private OrderRepository orderRepository;

    @GetMapping("")
    public ModelAndView index() {

        //List<Order> orderTeste = this.orderRepository.findAll();
        Optional<Order> order = this.orderRepository.findById(1);
        Order orderTeste = order.get();
        //List<OrderDTO> orderDTOList = Customer.toCustomers(customers);
        //System.out.println(orderTeste);
        ModelAndView mv = new ModelAndView("orders/index");
        mv.addObject("orderTeste", orderTeste);

        return mv;
    }

    @GetMapping("/new")
    public void nnew() {

        Order order = new Order(22,2.22, LocalDateTime.now() );
        //order.setCreationDate(LocalDateTime.now());
        orderRepository.save(order);
        System.out.println(order);
        //ModelAndView mv = new ModelAndView("orders/new");
        //mv.addObject("statusGender", StatusGender.values());

        //return mv;
    }

    /*@PostMapping
    public void create() {

        Order order = new Order(2,22,2.22,LocalDateTime.now());
        //order.setCreationDate(LocalDateTime.now());
        orderRepository.save(order);

    }*/

}
