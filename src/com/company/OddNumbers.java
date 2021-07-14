package com.company;

import java.util.Scanner;

public class OddNumbers {
    public static void main(String[] args) {
        // 5th Task:
        // Using an array, output the number of odd numbers
        // out of the numbers a user has entered. i.e. allow the
        // user to enter a number of numbers and return or output the number of odd
        // numbers.

        // Enter how many numbers you want: 6
        // Enter a number
        // enter a number
        //...
        // the number of odd numbers is ...


        // Initialize the scanner
        Scanner scanner = new Scanner(System.in);

        // initialize an array to hold the values.
        System.out.print("How many numbers do you want to enter?: ");
        int[] numbers = new int[scanner.nextInt()];

        // populate the array with user input
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter a number: ");
            numbers[i] = scanner.nextInt();
        }

        // initialize a counter for the odd numbers.
        int oddCount = 0;

        // scan through the array and search for odd numbers.
        for (int i = 0; i < numbers.length; i++) {
            // if number is odd, then increase oddCount by 1.
            if (numbers[i] % 2 != 0) {
                oddCount++;
            }
        }

        // Log the output to the console.
        System.out.println("The number of odd numbers is: " + oddCount);
    }


    // 40 mins.

    // 1st Task:
    // Simple interest calculator
    // The formula for simple interest is (P*R*T)/100. The time is in years.
    // - Allow the user to enter the principal, rate and time
    // - interactively print out the simple interest.

    // 2nd Task:
    // String Reversal
    // - Allow the user to enter a string,
    // - Interactively Print out the string in reverse.
    // e.g egg - gge, jade is a boy - yob a si edaj

    // 3rd Task:
    // Write 2 methods.
    // - They both return boolean.
    // - one checks for odd numbers.
    // - another checks for even numbers.
    // Then use these methods in your main method to check if a value
    // entered by the user is even or odd.





}