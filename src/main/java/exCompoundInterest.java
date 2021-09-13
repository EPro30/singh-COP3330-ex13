/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Riya Singh
 */

import java.util.Scanner;
import java.lang.Math;
public class exCompoundInterest {

    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal: ");
        int p = sc.nextInt(); //principal
        System.out.println("Enter the rate of Interest: ");
        double r = sc.nextDouble(); //rate in percent
        System.out.println("Enter the number of years: ");
        int t = sc.nextInt(); //time in years
        System.out.println("What is the number of times the interest is compounded per year?");
        int n = sc.nextInt(); //number of times interest is compounded per year

        double amount = p*(Math.pow(1 + ((r/100)/n), n*t)); //Calculation of the final amount

        System.out.print("$" + p + " invested at " + r + "% rate for " + t + " years compounded " + n);
        System.out.printf(" times per year is $%.2f.", amount);
    }
}
