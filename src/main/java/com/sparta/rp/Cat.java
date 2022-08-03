package com.sparta.rp;
// Encapsulation - keeping similar fields and methods together. Setting boundaries
//Abstraction - Hiding implementation and exposing what someone needs
//Inheritance - a parent class handing down functionality
//Polymorphism many forms of a method or class

public class Cat extends Animal{ //A class can only have one parent (on top of the Object superclass)
    // all classes have an Object superclass
//super is parent class
    public Cat(String name, int age, String breed) {
        super(name, age, breed);
    }
    @Override
    public void play(){ //overiding
        System.out.println("The cat is playing");
    }

    @Override
    void doSomething() {

    }
}
