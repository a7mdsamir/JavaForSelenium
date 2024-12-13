package javaOOP.polymorphism;

public class Overload extends Animal{

    public void demo(int a){
        System.out.println("A is " + a);
    }
    public void demo(int a, int b){
        System.out.println("A is " + a + " & B is "+b);
    }
    public double demo(double a){
        System.out.println("A is " + a);
        return a*a;
    }

}
