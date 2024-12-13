package javaOOP.polymorphism;

public class TestOverload {
    public static void main(String[] args) {

        Overload obj = new Overload();
        double result ;
        obj.demo(10);
        obj.demo(20,30);
        result = obj.demo(6.9);
        System.out.println("Final result : " + result);
    }
}