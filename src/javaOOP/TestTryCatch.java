package javaOOP;

public class TestTryCatch {
    public static void main(String[] args) {

        TestTryCatch testTryCatchtry = new TestTryCatch();
        testTryCatchtry.Test();
    }

    public void Test(){
        try {
            int num[] = {1,2,3};
            System.out.println(num[4]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception is " + e);
        } catch (Exception e){
            System.out.println("Exception is " + e);
        }
        System.out.println("Out of the block");
    }
}