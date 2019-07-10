package com.stackroute.practiceexercise1;

import java.util.Scanner;

/**
 * Practice Exercise Question - 2
 * Class accepts an integer number as input from the user and perform the
 * following conditional checks:
 * a. Print Tom if number is odd and exists between 20 to 30
 * b. Print Jerry, if number is even and exists between 20 and 30
 */
public class TomOrJerry {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = s.nextInt();
        if ((number % 2 != 0) && (number >= 20 && number <= 30)) {
            System.out.println("Tom");
        } else if ((number % 2 == 0) && (number >= 20 && number <= 30)) {
            System.out.println("Jerry");
        }
    }
}
