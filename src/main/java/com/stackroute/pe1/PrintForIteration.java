package com.stackroute.pe1;

import java.util.Scanner;

/**
 * Practice Exercise Question - 4
 * Class uses a loop to print the following output. 1 2 2 3 3 3 4 4 4 4 5 5 5 5 5 6 6 6 6
 * 6 6 . . . nth iteration.
 */
public class PrintForIteration {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = s.nextInt();
        for (int i = 0; i <= number; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i);
            }
        }
        /*Close the scanner*/
        s.close();
    }
}
