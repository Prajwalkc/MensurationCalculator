package edu.lfa.MSC;

import edu.lfa.factory.MensurationCalculator;
import edu.lfa.factory.MensurationCalculatorFactory;
import java.util.Scanner;

/**
 *
 * @author Prajwal
 */
public class Program {


    public static void main(String[] args) {
        System.out.println("================================");
        System.out.println("Mensuration Calculator");
        System.out.println("1.Area");
        System.out.println("2.Volume");
        System.out.println("3.Cube");
        System.out.println("4.Perimeter");
        System.out.println("5.Exit");
        Scanner input = new Scanner(System.in);
     MensurationCalculator cal = MensurationCalculatorFactory.get(input.nextInt());
        System.out.println("The required calculation is"+cal.calculate());
    }
    
}
