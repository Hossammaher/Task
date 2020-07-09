package com.example.task.pojo;

public class User {
    String Name;
    String Password;
    String EmailAddress;
    String PhoneNumber;
    String VerificationCode;
    String Address;

    public User() {
    }

    public User( String emailAddress , String password) {
        Password = password;
        EmailAddress = emailAddress;
    }

    public User(String name, String password, String emailAddress, String phoneNumber, String verificationCode, String address) {
        Name = name;
        Password = password;
        EmailAddress = emailAddress;
        PhoneNumber = phoneNumber;
        VerificationCode = verificationCode;
        Address = address;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmailAddress() {
        return EmailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        EmailAddress = emailAddress;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getVerificationCode() {
        return VerificationCode;
    }

    public void setVerificationCode(String verificationCode) {
        VerificationCode = verificationCode;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }
}
