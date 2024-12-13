package javaOOP.inheritance;

import javaOOP.inheritance.Calculation;

public class MyCalculation extends Calculation {

    public void multiplication(int firstNum, int secondNum){
        total = firstNum * secondNum ;
        System.out.println("the multiplication of the given numbers is = " + total);
    }
    public static void main(String[] args) {
        MyCalculation myCalculation = new MyCalculation();
        myCalculation.addition(5,10);
        myCalculation.subtraction(20,6);
        myCalculation.multiplication(6,8);
    }
}
