package com.example.Povt;

public class Dogs {

    private String bried;
    private String name;
    private int age;

    public Dogs (){
        this.bried = "-";
        this.name = "-";
        this.age = 0;
    }

    public Dogs (String bried, String name, int age){
        this.bried = bried;
        this.name = name;
        this.age = age;
    }

    public String getBried(){
        return bried;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void setBried(String bried){
        this.bried = bried;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

}
