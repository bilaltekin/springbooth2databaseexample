package com.example.springbooth2test.springbooth2test.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Data
public class Student {

    @Id
    @GeneratedValue
    private Long id;

    @NotEmpty(message = "name must not be empty")
    private String name;

    private String passportNumber;

    @OneToOne
    private Adress adress;






}
