package com.sparta.rp;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        Cat tim = new Cat("Tim", 1 , "Siamese");
        Cat bob = new Cat("Bob", 5, "Tabby");
        Dog jumbo = new Dog("Jumbo", 7, "Maltese");
        bob.setAge(6);
        bob.play();
        jumbo.play("Roshni");
        System.out.println(bob);
        System.out.println(bob.getName() + " is a " + bob.getBreed());
        Animal[] animals = {tim, bob, jumbo};
        doPlay(animals);
    }

    private static void doPlay(Animal[] animals){
        for (Animal animal: animals){
            animal.play();
        }
    }


}
