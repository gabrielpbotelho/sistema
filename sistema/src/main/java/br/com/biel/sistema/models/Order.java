package br.com.biel.sistema.models;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity(name = "order2")
public class Order {
    @Id
    @Column(name = "id_order")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "quantity")
    private Integer quantity;

    @Column(name = "total_amount")
    private double totalAmount;

    @Column(name = "creation_date")
    private LocalDateTime creationDate;


    //@ManyToOne
    //@JoinColumn(name = "customer_id")
    //private Customer customer;


    public Order() {
    }

    public Order(Integer quantity, double totalAmount, LocalDateTime creationDate) {
        this.quantity = quantity;
        this.totalAmount = totalAmount;
        this.creationDate = creationDate;
        //this.customer = customer;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalValue(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

   // public Customer getCustomer() {
   //     return customer;
   // }

   // public void setCustomer(Customer customer) {
   //     this.customer = customer;
    //}

    /*public static OrderDTO toOrderDTO (Order order) {
        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setId(order.getId());
        orderDTO.setName(order.getName());
        String birthDate = DateUtils.localDate4String(customer.getBirth(), "dd/MM/yyyy" );
        customerDTO.setBirth(birthDate);
        customerDTO.setStatusGender(customer.getStatusGender());
        customerDTO.setEmail(customer.getEmail());
        customerDTO.setCpf(customer.getCpf());
        String creationDateTime = DateUtils.localDateTime4String(customer.getCreationDate(), "dd/MM/yyyy HH:mm:ss");
        customerDTO.setCreationDate(String.valueOf(creationDateTime));

        return customerDTO;
    }

    public static List<CustomerDTO> toCustomers(List<Customer> customerList) {

        List<CustomerDTO> customerDTOList = new ArrayList<>();

        for ( Customer customer : customerList) {
            customerDTOList.add(toCustomerDTO(customer));

        }

        return customerDTOList;
    }*/



}
