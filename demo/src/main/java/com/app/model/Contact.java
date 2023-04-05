package com.app.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import lombok.Data;
@Data
public class Contact implements Serializable{   
    private Integer id;
    private String name;
    private Address address;
    private List<Phone> phones = new ArrayList<>();
    //Relacao nxm com agenda 0
}
