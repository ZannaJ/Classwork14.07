package com.company;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        // 2nd Task: Average
        // Write a program that takes input from the user for 10 numbers and
        // find the average of those numbers.

        // First way
        // Initialize scanner
//        Scanner scanner = new Scanner(System.in);
//
//        // sum the numbers as the user enters them.
//        int sum = 0; // initialize sum variable to add numbers up
//
//        for (int i = 0; i < 10; i++) {
//            // Ask the user to enter a number and add it to the
//            // sum variable
//            System.out.print("Enter a number: ");
//            sum += scanner.nextInt();
//        }
//
//        // Log the output to the console.
//        System.out.println("The average of the ten numbers is: " + sum / 10);

        // Second Way
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to ask how many numbers they want to enter?:
        System.out.print("How many numbers do you want to enter?: ");
        int[] numbers = new int[scanner.nextInt()];

        for (int i = 0; i < numbers.length; i++) {
            // Ask the user to enter a number and add it to the
            // the array.
            System.out.print("Enter a number: ");
            numbers[i] = scanner.nextInt();
        }

        // initialize the sum variable
        int sum = 0;

        // sum up the values in the array.
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        // Log the output to the console.
        System.out.println("The average of the " + numbers.length + "  numbers is: " + sum / numbers.length);



    }
}