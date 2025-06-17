package org.example;
import java.util.Scanner;

public class CreditLimitCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter account number:");
        int accountNumber = scanner.nextInt();


        System.out.print("Enter balance at the beginning of the month:");
        int beginningBalance = scanner.nextInt();


        System.out.print("Enter total Charges this month:");
        int charges = scanner.nextInt();


        System.out.print("Enter total credits this month:");
        int credits = scanner.nextInt();


        System.out.print("Enter allowed credit limit:");
        int creditLimit = scanner.nextInt();


        // Calculate new balance

        int newBalance = beginningBalance + charges - credits;

        // Display results

        System.out.println("\nAccount Number: + accountNumber");
        System.out.println("New Balance:" + newBalance);


        // Check credit limit

        if (newBalance > creditLimit){
            System.out.println("Credit limit exceeded");

        }
        scanner.close();



    }
}