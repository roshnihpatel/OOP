package com.sparta.rp;

public interface Driveable {
    void drive();
    void steer();
    void getGear(int gearboxValue);

    default void doSomething(){ //default allows interface methods to have implementaion
        System.out.println("I am doing something");
    }
}
