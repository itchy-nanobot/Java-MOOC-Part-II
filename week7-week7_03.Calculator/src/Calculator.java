/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pranav
 */
public class Calculator {
    private Reader reader;
    private int calculations;
    
    public Calculator() {
        this.reader = new Reader();
        this.calculations = 0;
    }
    
    public void start() {
        while (true) {
            System.out.print("command: ");
            String command = this.reader.readString();
            if (command.equals("end")) {
                break;
            }
            if (command.equals("sum")) {
                sum();
            } else if (command.equals("difference")) {
                difference();
            } else if (command.equals("product")) {
                product();
            }
        }
        statistics();
    }
    
    private void sum() {
        this.calculations++;
        System.out.print("value1: ");
        int value1 = reader.readInteger();
        
        System.out.print("value2: ");
        int value2 = reader.readInteger();
        
        int sum = value1 + value2;
        
        System.out.println("Sum of the values " + sum);
        System.out.println("");
    }
    
    private void difference() {
        this.calculations++;
        System.out.print("value1: ");
        int value1 = reader.readInteger();
        
        System.out.print("value2: ");
        int value2 = reader.readInteger();
        
        int difference = value1 - value2;
        
        System.out.println("Difference of the values " + difference);
        System.out.println("");
    }
    
    private void product() {
        this.calculations++;
        System.out.print("value1: ");
        int value1 = reader.readInteger();
        
        System.out.print("value2: ");
        int value2 = reader.readInteger();
        
        int product = value1 * value2;
        
        System.out.println("Product of the values " + product);
        System.out.println("");
    }
    
    private void statistics() {
        System.out.println("Calculations done " + this.calculations);
    }
    
}
