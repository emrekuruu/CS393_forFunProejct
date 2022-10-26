package com.example.Company.Entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "t_company")
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    @Column(name = "name")
    String name;


    public Company(){

    }

    public Company(int id,String name){
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
