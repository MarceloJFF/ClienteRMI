package com.app.model;

import java.io.Serializable;

import lombok.Data;
@Data
public class User implements Serializable{
    private Integer id;
    private String login;
    private String senha;
    private String name;
    private PhoneBookContact contactBook;
}
