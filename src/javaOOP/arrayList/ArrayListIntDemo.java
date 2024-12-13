package javaOOP.arrayList;

import java.util.ArrayList;

public class ArrayListIntDemo {
    public static void main(String[] args) {
        // LinkedList Declaration
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        // Add string elements in list
        numbers.add(10) ;
        numbers.add(100) ;
        numbers.add(40) ;
        numbers.add(20) ;
        numbers.add(200) ;

        System.out.println("ArrayList contains " + numbers);

        // Set and get values
        Object firstVar = numbers.get(0);
        System.out.println("First Element : " + firstVar);
        numbers.set(0,90);
        Object getIndex = numbers.get(1);
        System.out.println(" Element by get method : " + getIndex );
        // OR System.out.println(" Element by get method : " + numbers.get(1) );
        System.out.println("ArrayList after set the value of first items " + numbers);

        for (int i = 0; i < numbers.size() ; i++){
            System.out.println("number in index " + (i+1) + " is : "+ numbers.get(i));
        }

        numbers.remove(0);
        numbers.remove(numbers.size()-1);
        System.out.println("ArrayList contains after deleting  items " + numbers);

//        // Add to a position and remove from the position
        numbers.add(0,50);
        numbers.add(1,35);
        System.out.println("ArrayList contains after adding new items " +  numbers);


    }
}

