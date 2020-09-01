package com.stackroute;
/*
 *This class is used to dispaly author details
 */
public class Author {
    private String name;
    private String country;

    public Author(String name, String country) {
        System.out.println("This is a parameterized constructor");
        this.name = name;
        this.country = country;

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public Author() {
        System.out.println("This is a default constructor");

    }

    public void getAuthorDetails() {
        System.out.println("Author{name='" + this.name + "',country='" + this.country + "'}");

        // System.out.println(this.country);
    }


}
