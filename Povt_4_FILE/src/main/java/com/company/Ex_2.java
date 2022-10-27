package com.company;

import java.io.File;
import java.io.BufferedReader;
import java.io.*;

public class Ex_2 {
    void exer_2(){

        int arr_1[][] = new int[3][4];

        for (int i=0;i<3;i++){
            for (int j=0;j<4;j++){
                arr_1[i][j] = (i + j + 1) * 3;
            }
            System.out.println(arr_1[i][0] + " " + arr_1[i][1] + " " + arr_1[i][2] + " " + arr_1[i][3]);
        }


        try{
            String path = new String("D:\\JAVA\\FILES\\file_1.txt");
            File file_1 = new File(path);
            FileReader fr = new FileReader(file_1);
            BufferedReader reader = new BufferedReader(fr);

            FileWriter fw = new FileWriter(path, true);
            BufferedWriter writer = new BufferedWriter(fw);



            for (int i = 0; i < 3; i++){
                for (int j = 0; j < 4; j++){
                    String str = Integer.toString(arr_1[i][j]);
                    writer.write(str + " ");
                }
                writer.write("\n");

            }
            writer.close();


            String line = reader.readLine();

            while (line != null){
                System.out.println(line);
                line = reader.readLine();
            }

            File file_2 = new File("D:\\JAVA\\FILES\\file_11.txt");
            file_1.renameTo(file_2);
            //System.out.println("\n\n" + file_1.getTotalSpace() + "\n\n");

        } catch (FileNotFoundException ex_nf) {
            ex_nf.getMessage();
        } catch (IOException ex_io){
            ex_io.getMessage();
        }
    }

}
