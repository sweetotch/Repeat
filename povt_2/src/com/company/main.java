package com.company;

public class main {
    public static void main(String[] args) {
        Pencil pencil_1 = new Pencil(0.3f, 11, true);
        Pencil pencil_2 = new Pencil(0.3f, 19, false);
        Pencil pencil_3 = new Pencil(0.3f, 16,false);


        System.out.println("Pencil 1 will end in " + pencil_1.getEraseTime() + " days");
        System.out.println("Pencil 2 will end in " + pencil_2.getEraseTime() + " days");
        System.out.println("Pencil 3 will end in " + pencil_3.getEraseTime() + " days");

        double min = 0;
        int count = 0;

        if (pencil_1.getEraseTime() < pencil_2.getEraseTime()){
            min = pencil_1.getEraseTime(); count = 1;

            if(pencil_1.getEraseTime() > pencil_3.getEraseTime()) {
                min = pencil_3.getEraseTime();
                count = 3;
            }
        } else if (pencil_2.getEraseTime() < pencil_3.getEraseTime()){
            min = pencil_2.getEraseTime(); count = 2;
        } else {
            min = pencil_3.getEraseTime(); count = 3;
        }

        System.out.println("\nFastest pencil to errase will be Pencil - " + count);
        System.out.println("Pencil " + count + " will errase in " + min + "days");

    }
}
