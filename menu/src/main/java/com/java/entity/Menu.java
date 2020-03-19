package com.java.entity;

import lombok.Data;

@Data
public class Menu {

    private long id;
    private String name;
    private double price;
    private String flavor;
    private Integer tid;

}
