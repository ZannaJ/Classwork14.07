package com.company;

import java.util.Scanner;

public class Maxnumber {
    public static void main(String[] args) {
        // 4th Task:
        // Write a program that allows or takes in 10 numbers as an array
        // finds the largest number.

        // Initialize scanner
        Scanner scanner = new Scanner(System.in);

        // Enter how many numbers you want to enter
        System.out.print("How many numbers do you want to enter?: ");
        int[] numbers = new int[scanner.nextInt()];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter a number: ");
            numbers[i] = scanner.nextInt();
        } // populated numbers array

        int max = numbers[0]; // set the max to the first number in the array
        // to avoid getting zero as your max, in case there are only negative values.
        for (int i = 0; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }

        System.out.println("Max number is: " + max);
    }
}