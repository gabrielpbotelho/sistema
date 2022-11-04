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

    @NonNull
    private String name;
    private LocalDate birth;

    @Enumerated(EnumType.STRING)
    private StatusGender gender;

    private String email;

    @NonNull
    private int cpf;

    private LocalDateTime creationDate;

    public Customer() {
    }

    public Customer(@NonNull String name, LocalDate birth, StatusGender gender, String email, int cpf,
                    LocalDateTime creationDate) {
        this.name = name;
        this.birth = birth;
        this.gender = gender;
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

    public String getBirthDate() {
        DateTimeFormatter formatadorBarra = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return birth.format(formatadorBarra);
    }


    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }



    public StatusGender getGender() {
        return gender;
    }

    public void setGender(StatusGender gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
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
