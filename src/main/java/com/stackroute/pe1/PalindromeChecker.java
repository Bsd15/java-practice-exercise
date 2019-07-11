package com.stackroute.pe1;

/**
 * Practice Exercise Question - 1
 * Class to check if given number is palindrome or not.
 * If the number is palindrome then the even digits in the number are added to check
 * if they are greater than 25.
 */
public class PalindromeChecker {
    public String palindromeAndSumOfEvensCheck(long number) {
        if (checkPalindrome(number)) {
            if (checkSumOfEvenNumbers(number)) {
                return (number + "is a palindrome and the sum of even numbers is greater than 25");
            } else {
                return (number + "is a palindrome and the sum of even numbers is less than 25");
            }
        } else {
            return (number + "is not a palindrome");
        }
    }

    /**
     * Function to check if the sum of digits in the given number is greater than 25 or not.
     *
     * @param number Number to check if sum of even digits is above 25
     * @return True or false based on the sum of digits
     */
    private boolean checkSumOfEvenNumbers(long number) {
        long n = number;
        int sum = 0;
        long tempNumber;
        while (n != 0) {
            tempNumber = n % 10;
            if (tempNumber % 2 == 0) {
                sum += tempNumber;
            }
            n = n / 10;
        }
        return sum >= 25;
    }

    /**
     * Function to check if the number is palindrome or not.
     *
     * @param number Number, to check if it's palindrome or not.
     * @return Return true if the given number is palindrome or not.
     */
    private boolean checkPalindrome(long number) {
        long n = number;
        long reverseOfNumber = 0;
        while (n != 0) {
            reverseOfNumber = (reverseOfNumber * 10) + n % 10;
            n = n / 10;
        }
        return (reverseOfNumber == number);
    }
}
