package javaOOP.linkedList;

import java.util.LinkedList;
import java.util.Objects;

public class DemoLinkedList {
    public static void main(String[] args) {
        // LinkedList Declaration
        LinkedList<String> linkedList = new LinkedList<String>();

        // Add string elements in list
        linkedList.add("Item 1") ;
        linkedList.add("Item 5") ;
        linkedList.add("Item 3") ;
        linkedList.add("Item 6") ;
        linkedList.add("Item 2") ;

        System.out.println("LinkedList contains " + linkedList);

        // Add first and last element
        linkedList.addFirst("First item");
        linkedList.addLast("Last item");
        System.out.println("LinkedList contains after adding new items " + linkedList);

        // Set and get values
        Object firstVar = linkedList.get(0);
        System.out.println("First Element : " + firstVar);
        linkedList.set(0,"Changed first item");
        Object secondVar = linkedList.get(0);
        System.out.println("First Element after updating by set method : " + secondVar);
        System.out.println("LinkedList after set the value of first items " + linkedList);

        // Remove first and last element
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println("LinkedList after deleting the first and last items " + linkedList);

        // Add to a position and remove from the position
        linkedList.add(0,"Newly added item");
        linkedList.remove(2);
        System.out.println("Final content of LinkedList " + linkedList);

    }
}
