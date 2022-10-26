package com.example.Company.Entities;

import javax.persistence.Id;
import java.io.Serializable;

public class Enroll_Id implements Serializable {
    private int product;

    private int company;

    public int getProduct(){
        return product;
    }
    public void setProduct(int id){
        product = id;
    }
    public int getCompany(){
        return company;
    }
    public void setCompany(int company){
        this.company = company;
    }

    public Enroll_Id(int p, int c){
        product = p;
        company = c;
    }
}
