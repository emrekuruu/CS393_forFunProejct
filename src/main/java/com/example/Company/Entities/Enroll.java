package com.example.Company.Entities;

import javax.persistence.*;

@Entity
@Table(name = "t_enroll")
public class Enroll  {

    @Id
    Enroll_Id EnrollId;

    public Enroll(Enroll_Id id){
        this.EnrollId = id;
    }

    public Enroll(){

    }

    public Enroll_Id getId(){
        return this.EnrollId;
    }

    @Override
    public int hashCode(){
        final int prime = 31;
        int result = 1;
        result = prime * result + EnrollId.getProduct();
        result = prime * result + EnrollId.getCompany();
        return result;
    }

    @Override
    public boolean equals(Object object){
        if (this == object)
            return true;
        if (object == null)
            return false;
        if (getClass() != object.getClass())
            return false;
        Enroll other = (Enroll) object;
        if (EnrollId.getProduct() != other.EnrollId.getProduct())
            return false;
        if (EnrollId.getCompany() != other.EnrollId.getCompany())
            return false;
        return true;
    }


}
