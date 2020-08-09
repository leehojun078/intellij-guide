package com.wmp.hojun;


public class Email {
    int age;
    String name;
    public Email (int age, String name){
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

    public void send(String msg){
        System.out.println(msg);
    }
}
