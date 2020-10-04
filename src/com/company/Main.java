package com.company;

import java.util.Scanner;

public class Main {

    // This function convert fahrenheit to celsius
    public static void fahrenheit1() {
        System.out.println("Press C to continue");
        System.out.println("Press R to return to the main menu");
        Scanner myObj = new Scanner(System.in);
        while(true) {
            System.out.print("Enter your command(C/R): ");
            String choice = myObj.next();
            if(choice.equals("C")){
                System.out.print("Enter temperature in fahrenheit: ");
                float fahrenheit = myObj.nextFloat();
                float x = fahrenheit - 32;
                int a = 5;
                int y = 9;
                float z = (float)a / (float)y;
                System.out.println("Celsius: " + x*z); // Fahrenheit to celsius formula
            }

            if(choice.equals("R")) {
                main(null);
                break;
            }

        }

    }
    // This function converts celsius to fahrenheit
    public static void celsius1() {
        System.out.println("Press C to continue");
        System.out.println("Press R to return to the main menu");
        Scanner myO = new Scanner(System.in);
        while(true) {
            System.out.print("Enter your command(C/R): ");
            String choice = myO.next();
            if(choice.equals("C")){
                System.out.print("Enter temperature in Celsius: ");
                float celsius = myO.nextFloat();
                int a = 5;
                int y = 9;
                float z = (float)y / (float)a;
                float x = celsius * z;
                System.out.println("Fahrenheit: " + (x+32)); // Celsius to fahrenheit formula
            }

            if(choice.equals("R")) {
                main(null);
                break;
            }

        }
    }

    // This is the main function that navigate to the conversion function using loop and conditionals
    public static void main(String[] args) {
        System.out.println("**************************************");
        System.out.println("*      Temperature Calculator        *");
        System.out.println("**************************************");
        System.out.println("This program converts Temperature");
        System.out.println("Press F to covert from fahrenheit to celsius");
        System.out.println("Press C to convert from celsius to fahrenheit");
        System.out.println("Press Q to quit");
        Scanner myOb = new Scanner(System.in);

        label:
        while(true) {
            System.out.print("Enter your command: ");
            String command = myOb.next();
            switch (command) {
                case "F":
                    fahrenheit1();
                    break label;
                case "C":
                    celsius1();
                    break label;
                case "Q":
                    System.out.println("Thank you for using this calculator");
                    break label;
            }
        }


    }

}