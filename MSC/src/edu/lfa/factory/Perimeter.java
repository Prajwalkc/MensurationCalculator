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
public class Perimeter extends MensurationCalculator {

    @Override
    public double calculate() {
        System.out.println("Enter the first length ");
        setLength(input.nextDouble());
        System.out.println("Enter the seconf length");
        setBreadth(input.nextDouble());
            System.out.println("Enter the third length ");
            setHeight(input.nextDouble());
        System.out.println("Enter the fourth length ");
        setRadius(input.nextDouble());
    return getBreadth()+getHeight()+getLength()+getRadius();
    }
    
}
