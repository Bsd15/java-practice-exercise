package com.stackroute.practiceexercise1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Practice Exercise Question - 7
 * Class accepts a number as input from user and perform the following:
 * a. sort the number in non-increasing order
 * b. after sorting sum all the even numbers, the sum should be greater than 15 .
 * c. if sum is more than 15,then print output as true or false.
 */
public class SortAndAddDigits {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = s.nextInt();
        int tempNumber = number;
        int sum = 0;
        ArrayList<Integer> digitsArray = new ArrayList<>();
        while (tempNumber > 0) {
            digitsArray.add(tempNumber % 10);
            tempNumber /= 10;
        }
        Collections.sort(digitsArray, Collections.reverseOrder());
        for (Integer digit : digitsArray) {
            tempNumber = (tempNumber * 10) + digit;
            if ((digit % 2) == 0) {
                sum += digit;
            }
        }
        System.out.println("Sorted number: " + tempNumber);
        System.out.println("Sum of even number: " + sum);
        System.out.println((sum > 15)?"True":"False");
        /*Close the scanner*/
        s.close();
    }
}
