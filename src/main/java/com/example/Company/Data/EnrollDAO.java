package com.example.Company.Data;

import com.example.Company.Entities.Enroll;
import com.example.Company.Entities.Enroll_Id;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;
import java.util.List;

public interface EnrollDAO  extends JpaRepository<Enroll, Enroll_Id>{

}
