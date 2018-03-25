package com.bellinfo8.mx.springbootdemo.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


public class Customer {

    @Getter @Setter  private String name;

    @Getter @Setter  private String number;

    public Customer() {
    }

    public Customer(String name, String number) {
        this.name = name;
        this.number = number;
    }

}
