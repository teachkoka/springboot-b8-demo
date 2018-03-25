package com.bellinfo8.mx.springbootdemo;

import com.bellinfo8.mx.springbootdemo.model.Customer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class SpringbootDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDemoApplication.class, args);
	}

	@Bean
	public List<Customer> customerList(){

		 ArrayList<Customer> list = new ArrayList<>();
		 list.add(new Customer("Siva","7039096448"));
		 list.add(new Customer("Koka","3039996000"));
		 list.add(new Customer("Rutvik","90390898098"));
		 list.add(new Customer("Venkat","678987564"));

		 return list;

	}




}
