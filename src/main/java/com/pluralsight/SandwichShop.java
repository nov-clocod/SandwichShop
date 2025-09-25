package com.pluralsight;
import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("What size sandwich do you want? (1 or 2)");
        int sizeSandwich = myScanner.nextInt();
        myScanner.nextLine();

        System.out.println("What is your age?");
        int age = myScanner.nextInt();
        myScanner.nextLine();

        float basePrice = 0.0f;

        if (sizeSandwich == 1) {
            basePrice = 5.45f;
        } else if (sizeSandwich == 2) {
            basePrice = 8.95f;
        } else {
            System.out.println(sizeSandwich + " <-- Invalid input!");
        }

        System.out.println("Do you want your sandwich to be loaded? (yes or no)");
        String sandwichLoaded = myScanner.nextLine();

        if (sandwichLoaded.equalsIgnoreCase("yes")) {
            if (sizeSandwich == 1) {
                basePrice++;
            } else {
                basePrice += 1.75f;
            }
        } else {
            System.out.println("No extra cost!");
        }

        float discount = 0.0f;

        if (age < 18) {
            discount = .10f;
        } else if (age >= 65) {
            discount = .20f;
        } else {
            System.out.println("Sorry you don't get any discount");
        }

        float discountAmount = basePrice * discount;
        float sandwichPrice = basePrice - discountAmount;

        System.out.printf("Your sandwich costs: $%.2f", sandwichPrice);
    }
}