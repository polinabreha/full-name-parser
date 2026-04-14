package com.pluralsight;

import java.util.Scanner;
import java.util.regex.Pattern;

public class FullNamePasterApp {
    public static void main(String[] args) {

        // user can write the name
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your first last or first middle last name(exm.:Sarah Rose Smith): ");
        String fullName = scanner.nextLine();


        // separate/split  the string with space
        String[] parsedFullName = fullName.trim().split(Pattern.quote(" "));

       // if it's only first and last name
        // and also the input will convert in an appropriate look
        if (parsedFullName.length == 2) {
            String firstName = Character.toUpperCase(parsedFullName[0].charAt(0)) +
                    parsedFullName[0].substring(1).toLowerCase();
            String lastName = Character.toUpperCase(parsedFullName[1].charAt(0)) +
                    parsedFullName[1].substring(1).toLowerCase();
            System.out.println("First name: " + firstName);
            System.out.println("Last name: " + lastName);
         // for the full name with middle
            // and also will convert in an appropriate way
        } else if (parsedFullName.length == 3) {
            String firstName = Character.toUpperCase(parsedFullName[0].charAt(0)) +
                    parsedFullName[0].substring(1).toLowerCase();
            String lastName = Character.toUpperCase(parsedFullName[2].charAt(0)) +
                    parsedFullName[2].substring(1).toLowerCase();
            String middleName = Character.toUpperCase(parsedFullName[1].charAt(0)) +
                    parsedFullName[1].substring(1).toLowerCase();
            System.out.println("First name: " + firstName);
            System.out.println("Middle name: " + middleName);
            System.out.println("Last name: " + lastName);
        }else{
            System.out.println("Invalid input");
        }

    }
}
