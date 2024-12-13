package javaOOP.abstraction;

public class Dog extends Animal{

    public static void main(String[] args) {

        Animal obj = new Dog();
        obj.sound();
        obj.move();
    }
    public void sound(){
        System.out.println(" Dog sound is woof");
    };
    public void move(){
        System.out.println(" Dog is fast");
    };

}
