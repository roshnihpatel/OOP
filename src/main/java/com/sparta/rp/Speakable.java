package com.sparta.rp;
//interface have no implementation
public interface Speakable extends CharSequence {
    // final
    // field - can't change during runtime (constant)
    // methods - can't be overridden
    // class - can't be extended
    String NAME = "Roshni"; //is final and public

    void getAnimalName();
}
