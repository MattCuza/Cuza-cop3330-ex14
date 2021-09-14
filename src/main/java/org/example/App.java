/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Matthew Cuza
 */
package org.example;
import java.util.*;

public class App
{
    public static void main( String[] args )
    {
        double tax = 0;
        Scanner sc= new Scanner(System.in);
        System.out.println( "What is the order amount? " );
        double order = sc.nextDouble();
        sc.nextLine();
        System.out.println( "What is the state?" );
        String state = sc.nextLine();

        System.out.println("The subtotal is $" + (Math.round(order*100.0)/100.0) + ".\n");
        if(state.equalsIgnoreCase("WI")){
            tax = .055;
            System.out.println("The tax is $" + (Math.round((tax * order)*100.0)/100.0) + ".\n");
        }
        System.out.println("The total is $" + (Math.round(((tax * order) + order)*100.0)/100.0));
    }
}
