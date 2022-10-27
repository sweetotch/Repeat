package com.company;

import java.io.File;
import java.io.IOException;

public class Ex_1 {
    void exer_1(){

        File file_1 = new File("D:\\JAVA\\FILES", "file_1.txt");

        System.out.println("File name: " + file_1.getName());
        System.out.println("File pattern: " + file_1.getParent());

        if(file_1.exists()){
            System.out.println("File Exists");
        }


        if(file_1.isHidden()){
            System.out.println("File is hidden");
        } else {
            System.out.println("File isn't hidden");
        }

        File file_2 = new File("D:\\JAVA\\FILES");

        File newFile = new File("C://SomeDir//MyFile");
        try
        {
            boolean created = newFile.createNewFile();
            if(created)
                System.out.println("File has been created");
        }
        catch(IOException ex){

            System.out.println("File hasn't been created");
        }

    }
}
