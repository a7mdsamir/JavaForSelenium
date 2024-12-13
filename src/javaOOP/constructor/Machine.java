package javaOOP.constructor;

public class Machine {
    private String name;
    private int code;

    public Machine(){
        System.out.println("Constructor running");
    }
    public Machine(String name){
        System.out.println(name);
    }
    public Machine(String name,  int code){
        System.out.println("The 3rd constructor is running  "+ name + "  " + code);
        this.name = name;
        this.code = code;
    }
}
