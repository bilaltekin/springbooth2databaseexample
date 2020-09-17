package com.example.springbooth2test.springbooth2test.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Adress {

    @Id
    @GeneratedValue
    private Long id;

    private String adress;


}
