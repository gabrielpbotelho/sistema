package br.com.biel.sistema.dto;

import br.com.biel.sistema.models.Customer;
import br.com.biel.sistema.models.StatusGender;
import br.com.biel.sistema.utils.DateUtils;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CustomerDTO {

    private Integer id;
    private String name;

    //@DateTimeFormat(pattern="dd/MM/yyyy")
    private String birth;

    @Enumerated(EnumType.STRING)
    private StatusGender statusGender;
    private String email;
    private String cpf;
    private String creationDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public StatusGender getStatusGender() {
        return statusGender;
    }

    public void setStatusGender(StatusGender statusGender) {
        this.statusGender = statusGender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public static Customer toCustomer (CustomerDTO customerDTO) {
        Customer customer = new Customer();
        customer.setId(customerDTO.getId());
        customer.setName(customerDTO.getName());
        LocalDate birthDate = DateUtils.string4LocalDate(customerDTO.getBirth(), "dd/MM/yyyy" );
        customer.setBirth(birthDate);
        customer.setStatusGender(customerDTO.getStatusGender());
        customer.setEmail(customerDTO.getEmail());
        customer.setCpf(customerDTO.getCpf());
        LocalDateTime creationDate = DateUtils.string4LocalDateTime(customerDTO.getCreationDate(), "dd/MM/yyyy HH:mm:ss");
        customer.setCreationDate(creationDate);

        return customer;
    }

    /*public Customer toCustomer() {
        Customer customer = new Customer();
        customer.setName(this.name);
        LocalDate birthDate = DateUtils.string4LocalDate(birth, "dd/MM/yyyy" );
        customer.setBirth(birthDate);
        customer.setStatusGender(this.statusGender);
        customer.setEmail(this.email);
        customer.setCpf(this.cpf);
        customer.setCreationDate(this.creationDate);

        return customer;
    }*/

}
