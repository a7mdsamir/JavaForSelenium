package javaOOP.polymorphism;

public class Horse extends Animal {

    public static void main(String[] args) {

        Animal obj = new Horse();
        obj.sound();

    }
    @Override
    public void sound (){

        System.out.println("Horse sound ");
    }
}