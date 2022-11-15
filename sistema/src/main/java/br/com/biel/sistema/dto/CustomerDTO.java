package br.com.biel.sistema.dto;

import br.com.biel.sistema.models.Customer;
import br.com.biel.sistema.models.StatusGender;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.time.LocalDateTime;

public class CustomerDTO {
    private String name;
    private String birth;
    @Enumerated(EnumType.STRING)
    private StatusGender statusGender;
    private String email;
    private String cpf;
    private LocalDateTime creationDate;

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

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public Customer toCustomer() {
        Customer customer = new Customer();
        customer.setName(this.name);
        customer.setBirth(this.birth);
        customer.setStatusGender(this.statusGender);
        customer.setEmail(this.email);
        customer.setCpf(this.cpf);
        customer.setCreationDate(this.creationDate);

        return customer;
    }

}
