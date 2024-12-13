package javaOOP.arrayList;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListDemo {
    public static void main(String[] args) {
        // LinkedList Declaration
        ArrayList<String> arrayListList = new ArrayList<String>();

        // Add string elements in list
        arrayListList.add("Ahmed") ;
        arrayListList.add("Mohamed") ;
        arrayListList.add("Ali") ;
        arrayListList.add("Maged") ;
        arrayListList.add("Mona") ;

        System.out.println("ArrayList contains " + arrayListList);

        // Add to a position and remove from the position
        arrayListList.add(0,"Ibrahim");
        arrayListList.add(1,"Sally");
        System.out.println("ArrayList contains after adding new items " +  arrayListList);
        arrayListList.remove(3);
        arrayListList.remove("Mona");
        System.out.println("ArrayList contains after deleting  items " + arrayListList);



    }
}

