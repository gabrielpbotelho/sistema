package br.com.biel.sistema.models;

import br.com.biel.sistema.dto.CustomerDTO;
import br.com.biel.sistema.utils.DateUtils;
import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //@NonNull
    private String name;

    //@DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate birth;

    @Enumerated(EnumType.STRING)
    private StatusGender statusGender;

    private String email;

    //@NonNull
    private String cpf;

    private LocalDateTime creationDate;

    public Customer() {
    }

    public Customer(@NonNull String name, LocalDate birth, StatusGender statusGender, String email, String cpf,
                    LocalDateTime creationDate) {
        this.name = name;
        this.birth = birth;
        this.statusGender = statusGender;
        this.email = email;
        this.cpf = cpf;
        this.creationDate = creationDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @NonNull
    public String getName() {
        return name;
    }

    public void setName(@NonNull String name) {
        this.name = name;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth(LocalDate birth) {
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

    public static CustomerDTO toCustomerDTO (Customer customer) {
        CustomerDTO customerDTO = new CustomerDTO();
        customerDTO.setId(customer.getId());
        customerDTO.setName(customer.getName());
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
    }

}

//public String getBirthDate() {
//    DateTimeFormatter formatadorBarra = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//    return birth.format(formatadorBarra);
//}


/*public String getCreationDateTime() {
        DateTimeFormatter formatoBr = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        return creationDate.format(formatoBr) ;
    }*/