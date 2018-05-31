package com.company;

import java.util.Scanner;

public class iochangeassmt {

    public static void main(String[] args) {
	// write your code here
        Scanner keyboard = new Scanner(System.in);

        //int num1, num2, num3;
        double num1, num2;

        System.out.print( "First temperature? " );
        num1 = keyboard.nextInt();

        System.out.print( "Second temperature? " );
        num2 = keyboard.nextInt();

        //System.out.println("The max value is : " + Math.max(num1, num2));

        //int
        double avg = ( num1 + num2 ) / 2;
        System.out.print( "average is " + avg);

        //gotcha! 5, 10 , 7.5  15, 10, 12.5
    }
}
