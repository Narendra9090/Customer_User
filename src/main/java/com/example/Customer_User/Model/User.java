package com.example.Customer_User.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Customer_user")
public class User {

    @Id               ////////// it make this column as primary key
    @GeneratedValue   // STEP 2 Automatically database will increase this value and use it
    Long id;

    ////// DATA MEMBER //////

    String First_name;
    String Last_name;
    String Email;
    int Age;

    //////CREATE THE DEFAULT CONSTRUCTOR/////


    public User() {
    }

    ////// CREATE THE PATAMERIZED CONSTRUCTOR//////


    public User( String first_name, String last_name, String email, int age) {
        First_name = first_name;
        Last_name = last_name;
        Email = email;
        Age = age;
    }

    ///////CREATE THE GETTER AND SETTER /////




    public String getFirst_name() {
        return First_name;
    }

    public void setFirst_name(String first_name) {
        First_name = first_name;
    }

    public String getLast_name() {
        return Last_name;
    }

    public void setLast_name(String last_name) {
        Last_name = last_name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }
}
