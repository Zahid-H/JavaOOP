package input.oop.Abstraction;

import input.oop.Abstraction.Animal.Horse;
import input.oop.Polymorphism.main;

abstract class Animal {
    abstract void walk();

    Animal() {
        System.out.println("You are creating a new Animal");
    }

    // its just a concept only can be immagine
    public void eat() {
        System.out.print("Animals Eats");
    }
}

class Horse extends Animal {
    public void walk() {
        System.out.println("Walks on four legs");
    }
}

class Chiken extends Animal {
    public void walk() {
        System.out.println("Walks on two legs");
    }
}

public class OOP {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
        horse.eat();
    }
}