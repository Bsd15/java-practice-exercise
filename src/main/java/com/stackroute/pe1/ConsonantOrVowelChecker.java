package com.stackroute.pe1;

import java.util.Scanner;

/**
 * Practice Exercise Question - 3
 * Class that accepts a word as input and checks for each single character letter in
 * the word whether it is a consonant or vowel.
 * Condition:
 * a. Print an error message if the input is not a letter
 * b. If the input having more than one letter, print the required output
 * (Vowel or Consonant) for each letter
 */
public class ConsonantOrVowelChecker {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String input = s.next();
        if ((input != null) && (!input.isEmpty()) && (!input.matches(".*\\d.*"))) {
            char[] inputArray = input.toCharArray();
            for (char c : inputArray) {
                if (Character.toLowerCase(c) == 'a' || Character.toLowerCase(c) == 'e' || Character.toLowerCase(c) == 'i' || Character.toLowerCase(c) == 'o' || Character.toLowerCase(c) == 'u') {
                    System.out.println(c + " - Vowel");
                } else {
                    System.out.println(c + " - Consonant");
                }
            }
        } else {
            System.out.println("Please give a valid string");
        }
        /*Close the scanner*/
        s.close();
    }
}