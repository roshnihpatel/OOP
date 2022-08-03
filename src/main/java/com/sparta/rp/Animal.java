package com.sparta.rp;

public abstract class Animal {
    private String name;
    private int age;
    private String breed;

    public Animal(String name, int age, String breed) { // contructor
        this.name = name; //this refers to the object which is calling this method
        this.age = age;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//
//        this.name = name;
//    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age >0) {
            this.age = age;
        }
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
    public void play(){
        System.out.println("The animal is playing");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", breed='" + breed + '\'' +
                '}';
    }
    abstract void doSomething();

}
