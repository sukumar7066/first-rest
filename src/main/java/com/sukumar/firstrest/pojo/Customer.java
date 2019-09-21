package com.sukumar.firstrest.pojo;

public class Customer {
    private String name;
    private int age;
    private String sex;
    private String phoneNumber;

    public Customer(String aName, int aAge, String aSex, String aPhoneNumber ) {
        name = aName;
        age = aAge;
        sex = aSex;
        phoneNumber = aPhoneNumber;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }



}
