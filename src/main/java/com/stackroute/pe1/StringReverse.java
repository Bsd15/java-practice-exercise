package com.stackroute.pe1;

import java.util.Scanner;

/**
 * Practice Exercise Question - 9
 * A program to reverse any string without using String Buffer.
 */
public class StringReverse {
    public String stringReverse(String input) {
        Scanner s = new Scanner(System.in);
        /*Convert the given string into Char array*/
        char[] inputArray = input.toCharArray();
        /*Get the length of the array*/
        int arrayLength = inputArray.length;
        /*Initialize a empty array to store the reversed array*/
        char[] reverseArray = new char[arrayLength];
        /*Loop through for arrayLength iterations*/
        for (int i = 0; i < arrayLength; i++) {
            /*Store the element in inputArray in reverseArray from back.*/
            reverseArray[arrayLength - i - 1] = inputArray[i];
        }
        /*Convert the character array into string by passing into String constructor*/
        String reversedString = new String(reverseArray);
        return (reversedString);
    }
}
