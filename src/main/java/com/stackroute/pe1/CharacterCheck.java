package com.stackroute.pe1;

import java.util.Scanner;

/**
 * Practice Exercise Question - 6
 * Class that takes a character from the user as input and determines whether the
 * character entered is a capital letter, a small case letter, a digit or a special symbol and display
 * appropriately.
 */
public class CharacterCheck {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a character: ");
        try {
            /*Take only one character as input*/
            char ch = s.next(".").charAt(0);
            int characterType = Character.getType(ch);
            switch (characterType) {
                case Character.UPPERCASE_LETTER:
                    System.out.println("Capital Letter");
                    break;
                case Character.LOWERCASE_LETTER:
                    System.out.println("Small Letter");
                    break;
                case Character.DECIMAL_DIGIT_NUMBER:
                    System.out.println("Digit");
                    break;
                case Character.MATH_SYMBOL:
                case Character.MODIFIER_SYMBOL:
                case Character.CURRENCY_SYMBOL:
                case Character.OTHER_SYMBOL:
                    System.out.println("Symbol");
                    break;
                default:
                    System.out.println("Other");
            }
        } catch (Exception e) {
            System.out.println("Please enter only one character");
        }
        /*Close the scanner*/
        s.close();
    }
}
