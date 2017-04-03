/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.lfa.factory;

import java.util.Scanner;

/**
 *
 * @author Prajwal
 */
public abstract class MensurationCalculator {
    private double length,breadth,height,radius;
    protected Scanner input = new Scanner(System.in);

   public  abstract double calculate();
  

//public Scanner getInput(){
//    return input;
//}
public void setInput(Scanner input){
    this.input=input;
}
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


}
