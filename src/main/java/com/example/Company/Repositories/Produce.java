package com.example.Company.Repositories;
import com.example.Company.Data.CompanyDAO;
import com.example.Company.Data.EnrollDAO;
import com.example.Company.Data.ProductDAO;
import com.example.Company.Entities.Enroll;
import com.example.Company.Entities.Enroll_Id;
import com.example.Company.Entities.Product;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class Produce {

    @Autowired
    CompanyDAO companyDAO;

    @Autowired
    ProductDAO productDAO;

    @Autowired
    EnrollDAO enrollDAO;


    public void CreateProduct(int id, String name){
        Product newP = new Product(id,name);
        productDAO.save(newP);
    }

    public Optional<Product> getProduct(int id){
        return productDAO.findById(id);
    }



    public List<Product> GetProducts(){
        List<Product> products = productDAO.findAll();
        return products;
    }

    public void enroll(int product, int company){
        Enroll_Id id = new Enroll_Id(product,company);
        Enroll enroll = new Enroll(id);
        enrollDAO.save(enroll);
    }

    public List<Enroll> AllEnrollment(){
        return enrollDAO.findAll();
    }

    public List<Optional<Product>> getProducts(int company){

        List<Enroll> qualified = new ArrayList<Enroll>();
        List<Optional<Product>> result = new ArrayList<>();

        List<Enroll> ids = enrollDAO.findAll();
        for(Enroll id : ids){
            if(id.getId().getCompany() == company){
                qualified.add(id);
            }
        }

        for(Enroll e : qualified){
            result.add(getProduct(e.getId().getProduct()));
        }
        return result;
    }
}
