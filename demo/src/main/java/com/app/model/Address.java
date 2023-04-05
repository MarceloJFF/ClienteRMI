package com.app.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import lombok.Data;
@Data
public class Address implements Serializable{
    private Integer id;
    private String street;
    private String numberOfHouse;
    private String neighborhood;
    private List<Contact> contacts = new ArrayList<>();
}
