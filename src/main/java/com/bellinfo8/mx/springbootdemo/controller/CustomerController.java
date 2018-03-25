package com.bellinfo8.mx.springbootdemo.controller;


import com.bellinfo8.mx.springbootdemo.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value="/customer")
public class CustomerController {

    @Autowired
    List<Customer> customerList;

    @RequestMapping(value="/list", method = RequestMethod.GET,
        produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getCustList(){
            return new ResponseEntity(customerList, HttpStatus.OK);

    }

    @RequestMapping(value = "/{name}/phone-number")
    public ResponseEntity getCustNumber(@PathVariable String name){

        for(Customer c1:customerList){
            if(c1.getName().equals(name)){
                return new ResponseEntity(c1,HttpStatus.OK);
            }
        }

        return new ResponseEntity("Customer Not found", HttpStatus.BAD_REQUEST);

    }

    @RequestMapping(value="/add", method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity AddCustomer(@RequestBody Customer customer){

        customerList.add(customer);
        return new ResponseEntity(HttpStatus.CREATED);

    }




}
