package com.example.Company.Entities;

import javax.persistence.*;

@Entity
@Table(name = "t_product")
public class Product {

    @Id
    int id;

    @Column(name = "name")
    String name;

    public Product(){

    }

    public Product(int id,String name){
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
