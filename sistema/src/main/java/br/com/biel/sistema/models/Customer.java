package br.com.biel.sistema.models;

import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //@NonNull
    private String name;
    private String birth;

    @Enumerated(EnumType.STRING)
    private StatusGender statusGender;

    private String email;

    //@NonNull
    private String cpf;

    private LocalDateTime creationDate;

    public Customer() {
    }

    public Customer(@NonNull String name, String birth, StatusGender statusGender, String email, String cpf,
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

    public String getBirth() {
        return birth;
    }

    //public String getBirthDate() {
    //    DateTimeFormatter formatadorBarra = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    //    return birth.format(formatadorBarra);
    //}


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
    public String getCreationDateTime() {
        DateTimeFormatter formatoBr = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        return creationDate.format(formatoBr) ;
    }

    //DateTimeFormatter formatoBr = DateTimeFormatter.ofPattern(mascara);
    //LocalDateTime dataAgora = localDateTime;
    //String dataFormatada = dataAgora.format(formatoBr);
    //return dataFormatada;

    //"dd/MM/yyyy HH:mm:ss";

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }


}
