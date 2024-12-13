package javaOOP.fileReader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileReader {
    public static void main(String[] args) {
//        File file = new File("C:\\Users\\ahmed.samir\\Downloads\\Ahmed\\Testing\\Selenium\\Selenium WebDriver From Foundation to Framework [In Arabic]\\Selenium WebDriver From Foundation to Framework [In Arabic]\\6-Java and OOP for Testers\\Hello.txt");
        File file = new File("Hello.txt");
        try {
            file.createNewFile();
            FileWriter write = new FileWriter(file);

            write.write("hello from created file");
            write.flush();
            write.close();

            BufferedReader reader = new BufferedReader(new java.io.FileReader(file));
            String line;
            while ( (line = reader.readLine()) != null){
                System.out.println(line);
            }
            reader.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
