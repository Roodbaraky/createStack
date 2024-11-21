package MHR.practice;

import static MHR.practice.Stack.createStack;

import java.awt.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        int stackSize;
        Stack stack;
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
            System.out.println("Would you like to create a static or dynamic stack?");
            System.out.println("1. Static");
            System.out.println("2. Dynamic");
            System.out.print("Enter the number of your choice: ");
            while (true) {
                try {
                    choice = scanner.nextInt();
                    if (choice >= 1 && choice <= 2) {
                        break;
                    } else {
                        System.out.println("Invalid choice. Please choose a number between 1 and 2.");
                    }
                } catch (InputMismatchException exception) {
                    System.out.println("Invalid choice. Please try again.");

                    scanner.next();
                }
            }
            if (choice == 1) {

                while (true) {
                    System.out.println("You chose a static stack!");
                    System.out.println("Please enter a size for the stack:");
                    try {
                        stackSize = scanner.nextInt();
                        if(stackSize<1){
                            System.out.println("Invalid choice. Please try again.");
                            scanner.next();
                        }
                        break;
                    } catch (InputMismatchException exception) {
                        System.out.println("Invalid choice. Please try again.");
                        scanner.next();
                    }
                }
                stack = createStack(stackSize);
                while (true){
                    System.out.println("Your stack has been created: " + stack.toString());
                    break;
                }
            }
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