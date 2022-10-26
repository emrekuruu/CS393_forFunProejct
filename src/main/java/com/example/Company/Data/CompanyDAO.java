package com.example.Company.Data;

import com.example.Company.Entities.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyDAO extends JpaRepository<Company,Integer> {

}
