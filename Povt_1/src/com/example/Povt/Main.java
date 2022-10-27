package com.example.Povt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input_q = new Scanner(System.in);
        Scanner input_br = new Scanner(System.in);
        Scanner input_name = new Scanner(System.in);
        Scanner input_age = new Scanner(System.in);

        System.out.println("Enter Dog\'s quantity");
        int quant = input_q.nextInt();

        Dogs [] dog = new Dogs[quant];


        for(int i=0; i<quant ; i++){
            dog[i] = new Dogs();
            System.out.println("Enter dog\'s Bried: ");
            String bried = input_br.nextLine();
            dog[i].setBried(bried);

            System.out.println("Enter dog\'s name: ");
            String name = input_name.nextLine();
            dog[i].setName(name);

            System.out.println("Enter dog\'s age: ");
            int age = input_age.nextInt();
            dog[i].setAge(age);
        }


        for (int i=0; i<quant; i++){
            System.out.println("\nDog: " + dog[i].getName());
            System.out.println("bried - " + dog[i].getBried());
            System.out.println("age - "+ dog[i].getAge());
        }



    }


}
