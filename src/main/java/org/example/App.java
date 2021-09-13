package org.example;

import java.util.Scanner;
import java.math.RoundingMode;
import java.text.DecimalFormat;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Christina Persaud
 */
public class App 
{
    private static DecimalFormat df2 = new DecimalFormat("#.##");

    public static double subTotal (double item1,  int quantity1, double item2, int quantity2, double item3, int quantity3)
    {
        double d;
        d= (item1*quantity1) + (item2 * quantity2) + (item3 *quantity3);
        return d;
    }
    public static double Tax (double sub)
    {
        return sub*.055;
    }

    public static double withTaxes (double sub, double tax)
    {
        return tax+sub;
    }

    public static void main( String[] args )
    {
        Scanner scan1 = new Scanner(System.in);
        System.out.print("Enter the price of item 1: ");
        double item1 = scan1.nextDouble();
        Scanner scan2 = new Scanner(System.in);
        System.out.print("Enter the quantity of item 1: ");
        int quantity1 = scan2.nextInt();

        Scanner scan3 = new Scanner(System.in);
        System.out.print("Enter the price of item 2: ");
        double item2 = scan3.nextDouble();
        Scanner scan4 = new Scanner(System.in);
        System.out.print("Enter the quantity of item 2: ");
        int quantity2 = scan4.nextInt();

        Scanner scan5 = new Scanner(System.in);
        System.out.print("Enter the price of item 3: ");
        double item3 = scan5.nextDouble();
        Scanner scan6 = new Scanner(System.in);
        System.out.print("Enter the quantity of item 3: ");
        int quantity3 = scan6.nextInt();

        double sub;
        sub= subTotal(item1, quantity1, item2, quantity2, item3, quantity3);

        df2.setRoundingMode(RoundingMode.UP);
        System.out.print("Subtotal: $" + df2.format(sub)+ "\n");

        double tax;
        tax= Tax(sub);

        System.out.print("Tax: $" + df2.format(tax)+ "\n");

        double total;
        total = withTaxes(sub, tax);
        System.out.print("Total: $" + df2.format(total));

    }
}
