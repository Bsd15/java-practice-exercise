package com.stackroute.pe1;

/**
 * Practice Exercise Question - 2
 * Class accepts an integer number as input from the user and perform the
 * following conditional checks:
 * a. Print Tom if number is odd and exists between 20 to 30
 * b. Print Jerry, if number is even and exists between 20 and 30
 */
public class TomOrJerry {
    public String checkTomOrJerry(int number) {
        if ((number % 2 != 0) && (number >= 20 && number <= 30)) {
            return "Tom";
        } else if ((number % 2 == 0) && (number >= 20 && number <= 30)) {
            return ("Jerry");
        }
        return null;
    }
}
