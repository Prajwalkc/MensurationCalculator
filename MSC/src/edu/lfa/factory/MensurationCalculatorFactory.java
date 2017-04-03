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
public class MensurationCalculatorFactory  {

    public static MensurationCalculator get(int param){
        switch (param) {
            case 1:
                return new Area();
            case 2:
                return new Volume();
            case 3:
                return new Cube();
            
            case 4:
                return new Perimeter();
            case 5:
                System.exit(0);
                
        }
        return null;
    }
    }    
    
    

