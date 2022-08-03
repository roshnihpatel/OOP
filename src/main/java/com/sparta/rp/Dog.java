package com.sparta.rp;

public class Dog extends Animal implements Speakable {


    public Dog(String name, int age, String breed) {
        super(name, age, breed);
    }

    @Override
    void doSomething() {

    }


    public void play(String name) {// Overloading - changing the parameters or the order of processes
        // gives different version of play
        System.out.println(this.getName() + " is playing with " + name);
    }

    @Override
    public void getAnimalName() {

    }

    @Override
    public int length() {
        return 0;
    }

    @Override
    public char charAt(int index) {
        return 0;
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }
}
