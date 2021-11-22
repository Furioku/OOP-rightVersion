package com.philippsalata;

public class User {
    private int age;
    private String name;
    private int ageForAlco;


    public User(int age, String name) {
        this.age = age;
        this.name = name;
    }
    /*public User(int ageForAlco) {
        this.ageForAlco = ageForAlco;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            throw new RuntimeException("Please enter correct value");
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAgeForAlco() {
        return ageForAlco;
    }*/
    public boolean canUserByeAlco(){
        if(age >= 18){
            return true;
        } else {
            return false;
        }
    }
}
