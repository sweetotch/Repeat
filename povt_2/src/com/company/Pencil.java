package com.company;

public class Pencil extends Hexagon{
    float height;

    boolean density;

    public Pencil (){
        lenght = 0;
        height = 0;
        density = false;
    }
    public Pencil (float lenght, float height, boolean density){
        this.lenght = lenght;
        this.height = height;
        this.density = density;
    }

    double getHexagonVolume(){
        return(getHexagonArea()*height);
    }

    double getEraseTime(){
        if(density) {
            return(height * 10 / 2);
        } else {
            return (height * 10 / 3);
        }
    }

    void setHeight(float height){
        this.height = height;
    }
    void setDensity(boolean density){
        this.density = density;
    }

    float getHeight(){
        return height;
    }

    boolean getDensity(){
        return density;
    }

}
