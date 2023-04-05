package com.app.model;

import java.io.Serializable;

import lombok.Data;
@Data
public class Phone implements Serializable {
    private Integer id;
    private String number;
    private String DDD;
    private Contact contact;
}
