package com.app.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class User implements Serializable {
    @Id
    @GeneratedValue
    private Integer id;
    private String login;
    private String senha;
    private String name;
    @OneToOne
    @JoinColumn(name="contact_book_id")
    private PhoneBookContact contactBook;
}

