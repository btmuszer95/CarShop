package com.example.classes;

import javax.persistence.*;

/**
 * Created by Bartixon on 2017-05-08.
 */

@Entity
public class Owner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String name;

    @Column
    private String surname;

    @Column
    private String address;


    @Column
    private String city;

    @Column
    private String phoneNumber;

    @Column
    private String emailAddress;


    public Owner() {
    }

    public Owner(String name, String surname, String address, String street, String city, String phoneNumber, String emailAddress) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.city = city;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
