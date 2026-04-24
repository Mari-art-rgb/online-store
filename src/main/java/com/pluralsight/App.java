package com.pluralsight;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the online store! ");

        homeScreen(scanner);

    }
    //Passing in the scanner so it's not red
    public static void homeScreen(Scanner scanner) {
        while (true) {

            System.out.println("Select from the following options: ");
            System.out.println("\t1) Display Products");
            System.out.println("\t2)Display Cart");
            System.out.println("\t0)Exit");
            System.out.println("Enter your selection: ");
            int userOption = scanner.nextInt();

            switch (userOption) {
                case 1:
                    //  displayProducts(scanner);
                    break;

                case 2:
                    //   displayCart(scanner);
                case 0:
                    //exit?
                    System.out.println("Thanks for visting my online store. ");
                    scanner.close();
                    System.exit(0);

                    break;

                default:
                    System.out.println("Incorrect option entered");
                    scanner.nextLine();
            }


        }
    }


}
