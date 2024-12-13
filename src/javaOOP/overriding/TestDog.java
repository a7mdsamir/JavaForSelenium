package javaOOP.overriding;

import javaOOP.overriding.Animal;
import javaOOP.overriding.Dog;

public class TestDog {



    public static void main(String[] args) {
        Animal a = new Animal();
        Dog d = new Dog();
        a.move();
        d.move(1);

    }
}
