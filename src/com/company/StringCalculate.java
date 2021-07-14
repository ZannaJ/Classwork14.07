package com.company;

import java.util.Scanner;

public class StringCalculate {
    public static void main(String[] args) {
        // 3rd Task: Strings.
        // Write a program that takes in 5 strings from the user
        // and concatenates those strings into one sentence.
        // Enter a string : Harry
        // Enter a string : is
        // ...
        // Harry is ...

        // Initialize the scanner class
        Scanner scanner = new Scanner(System.in);

        // prompt the user for how many strings they want to enter
        System.out.print("How many strings do you want to enter?: ");
        int numberOfStrings = scanner.nextInt();
        String[] strings = new String[numberOfStrings];

        // initialize an empty string value
        String joiner = "";

        for (int i = 0; i < strings.length; i++) {
            System.out.print("Add next string: ");
//            joiner += scanner.next() + " "; // adds the string to the joiner variable and adds a space at the end.
            strings[i] += scanner.next(); // adds the string to the array
        }

        for (int i = 0; i < strings.length; i++) {
            System.out.print("Add next string: ");
            joiner += strings[i] + " "; // adds the string to the joiner variable and adds a space at the end.
        }

        System.out.println(joiner);


    }
}