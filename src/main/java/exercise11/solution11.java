/*
 *  UCF COP3330 Fall 2021 Assignment 11 Solution
 *  Copyright 2021 Joao Pedro Oliveira
 */
package exercise11;

import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class solution11 {

   /* Print "How many euros are you exchanging?"
            'euros' = input from user

    Print "What is the exchange rate?"
            'exchangeRate' = input from user

    convert from Euros to dollars

    'rate' = 'euros'*'exchangeRate'

    round rate to the nearest penny amount

    convert rate to a BigDecimal to be able to round to 2 decimal places

    Print ("%f euros at and exchange rate of %f is %f U.S. dollars", euros, exchangeRate, finalRate);

    */

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many euros are you exchanging?");
        double euros = scanner.nextInt();

        System.out.println("What is the exchange rate?");
        float exchangeRate = scanner.nextFloat();

        double rate = euros*exchangeRate;

        BigDecimal roundingRate = new BigDecimal(rate).setScale(2, RoundingMode.CEILING);
        double finalRate = roundingRate.doubleValue();



        System.out.printf("%.02f Euros at an exchange rate of %.04f is %.02f U.S. dollars.", euros, exchangeRate, finalRate);

    }
}
