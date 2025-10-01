package com.simple.test;

public class BasicClass {
    private String username;
    private int age;
    private String phone;

    public BasicClass() {

    }

    public BasicClass(String name) {
        username = name;
    }

    public BasicClass(String name, int age) {
        this(name);
        this.age = age;
    }

    public BasicClass(String name, int age, String phone) {
//        this.username = name;
//        this.age = age;
        this(name,age);
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
