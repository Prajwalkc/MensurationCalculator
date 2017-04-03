/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.lfa.factory;

/**
 *
 * @author Prajwal
 */
public class Cube extends MensurationCalculator{

    @Override
    public double calculate() {
        System.out.println("Enter the length");
        setLength(input.nextDouble());
        System.out.println("Enter the height");
        setHeight(input.nextDouble());
        System.out.println("Enter the breadth");
        setBreadth(input.nextDouble());
  return getLength()*getBreadth()*getHeight();
    }
  
}
