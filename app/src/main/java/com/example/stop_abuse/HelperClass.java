package com.example.stop_abuse;

public class HelperClass {

    String name,email,address,username,password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public HelperClass(String name, String email, String address, String username, String password) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.username = username;
        this.password = password;
    }

    public HelperClass(){

    }
}
