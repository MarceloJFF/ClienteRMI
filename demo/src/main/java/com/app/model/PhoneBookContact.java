package com.app.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class PhoneBookContact implements Serializable {
    private Integer id;
    private List<Contact> contacts = new ArrayList<>() ;
}
