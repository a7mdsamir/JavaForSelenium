package javaOOP.interfaceDemo;

public class MammalInt implements IAnimal {

    @Override
    public void eat() {
        System.out.println("Mammal eat");
    }

    @Override
    public void travel() {
        System.out.println("Mammal travel");
    }
    public static void main(String[] args) {

        MammalInt m = new MammalInt();
        m.eat();
        m.travel();

    }


}