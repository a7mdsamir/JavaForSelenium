package javaOOP.inheritance;

public class Calculation {

    int total ;
    public void addition(int firstNum, int secondNum){
        total = firstNum + secondNum ;
        System.out.println("the sum of the given numbers is = " + total);
    }

    public void subtraction(int firstNum, int secondNum){
        total = firstNum - secondNum ;
        System.out.println("the subtraction of the given numbers is = " + total);
    }
}
