package com.example.Company;

import com.example.Company.Entities.Product;
import com.example.Company.Repositories.Produce;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

@SpringBootTest
class CompanyApplicationTests {

	@Autowired
	Produce produce ;

	@Test
	void contextLoads() {

		List<Product> products = produce.GetProducts();
		produce.CreateProduct(2,"IPhone");
		List<Product> products2 = produce.GetProducts();

		produce.enroll(2,10);
		produce.enroll(5,10);

		Optional<Product> product = produce.getProduct(2);

		List<Optional<Product>> products4 =  produce.getProducts(10);




	}

}
