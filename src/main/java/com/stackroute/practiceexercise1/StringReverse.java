package com.stackroute.practiceexercise1;

import java.util.Scanner;

/**
 * Practice Exercise Question - 9
 * A program to reverse any string without using String Buffer.
 */
public class StringReverse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter tex: ");
        String input = s.next();
        char[] inputArray = input.toCharArray();
        int arrayLength = inputArray.length;
        char[] reverseArray = new char[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            reverseArray[arrayLength - i - 1] = inputArray[i];
        }
        String reversedString = new String(reverseArray);
        System.out.println(reversedString);
    }
}
