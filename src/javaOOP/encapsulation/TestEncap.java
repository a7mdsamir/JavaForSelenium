package javaOOP.encapsulation;

public class TestEncap {
    private String name;
    private String idNum;
    private int age;

    public String getName(){
        return name;
    }
    public String getIdNum(){
        return idNum;
    }
    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setIdNum(String idNum){
        this.idNum = idNum;
    }
    public void setAge(int age){
        this.age = age;
    }
}
