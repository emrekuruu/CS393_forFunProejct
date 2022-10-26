package com.example.Company.Data;

import com.example.Company.Entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductDAO extends JpaRepository<Product,Integer> {

}
