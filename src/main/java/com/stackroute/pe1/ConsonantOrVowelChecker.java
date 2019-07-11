package com.stackroute.pe1;

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
    public String checkCharacter(String input) {
        if ((input != null) && (!input.isEmpty()) && (!input.matches(".*\\d.*"))) {
            char[] inputArray = input.toCharArray();
            for (char c : inputArray) {
                if (Character.toLowerCase(c) == 'a' || Character.toLowerCase(c) == 'e' || Character.toLowerCase(c) == 'i' || Character.toLowerCase(c) == 'o' || Character.toLowerCase(c) == 'u') {
                    return (c + " - Vowel");
                } else {
                    System.out.println(c + " - Consonant");
                }
            }
        } else {
            return ("Please give a valid string");
        }
        return input;
    }
}