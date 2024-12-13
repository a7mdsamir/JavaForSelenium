package javaOOP.encapsulation;

import javaOOP.encapsulation.TestEncap;

public class RunEncap {
    public static void main(String[] args) {
        TestEncap encap = new TestEncap();

        encap.setName("Ahmed");
        encap.setIdNum("1234");
        encap.setAge(30);

        System.out.println("name is "+ encap.getName() + " id is "+ encap.getIdNum() + " Age is "+ encap.getAge());
    }
}
