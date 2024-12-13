package javaOOP;

public class TestIfBranch {
    public static void main(String[] args) {
        int extraCustomer = 2;

        if (extraCustomer >= 3){
            System.out.println("Customer recieves a discount");
        } else if (extraCustomer <= 2) {
            System.out.println("No discount");
        }else {
            System.out.println("Not a valid customer count");
        }

    }
}
