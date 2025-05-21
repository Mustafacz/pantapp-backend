package com.pantapp.pant_backend.model;

public class PantRequestDTO {

    private String name;
    private String email;
    private String phoneNumber;
    private String address;
    private String availability;
    private String amount;
    private RequestType requestType;

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability){
        this.availability = availability;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount){
        this.amount = amount;
    }


}
