package com.app.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class Address implements Serializable{
    @Id
    @GeneratedValue
    private Integer id;
    private String street;
    private String numberOfHouse;
    private String neighborhood;    
    @OneToMany(mappedBy = "address")
    private List<Contact> contacts = new ArrayList<>();
    
}
