package MHR.practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice =-1;
        System.out.println("Welcome to the factory!");
        while (true) {
            System.out.println("What would you like to make?");
            System.out.println("1. Stack");
            System.out.println("2. Queue");
            System.out.println("3. Exit");
            System.out.print("Enter the number of your choice: ");

            try {
                choice = scanner.nextInt();
                if (choice >= 1 && choice <= 3) {
                    break;
                } else {
                    System.out.println("Invalid choice. Please choose a number between 1 and 3.");
                }
            } catch (InputMismatchException exception) {
                System.out.println("Invalid choice. Please try again.");
                scanner.next();
            }
        }

        switch (choice) {
        case 1:
            System.out.println("You chose to create a Stack!");
            break;
        case 2:
            System.out.println("You chose to create a Queue!");
            break;
        case 3:
            System.out.println("Exiting the factory. Goodbye!");
            break;
        default:
            System.out.println("Invalid choice. Please try again.");
            break;
        }

        scanner.close();
    }
}