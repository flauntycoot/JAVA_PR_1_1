package com.company;

public class TestDog {
    public static void main(String[] args) {
        Dog d1 = new Dog("Mike", 3);
        Dog d2 = new Dog("Helen", 8);
        Dog d3 = new Dog("Bob");
        d3.setAge(1);
        System.out.println(d1);
        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();
    }
}