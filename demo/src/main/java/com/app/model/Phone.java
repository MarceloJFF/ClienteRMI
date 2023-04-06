package com.app.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class Phone implements Serializable {
    @Id
    @GeneratedValue
    private Integer id;
    private String number;
    private String DDD;  
    @ManyToOne
    @JoinColumn(name = "contact_id")
    private Contact contact;
}
