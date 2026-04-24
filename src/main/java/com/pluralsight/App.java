package com.pluralsight;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the online store! ");

        System.out.println("Select from the following options: ");
        System.out.println("\t1) Display Products");
        System.out.println("\t2Display Cart");
        System.out.println("\t0 Exit") ;
        System.out.println("Enter your selection: ");
        int UserOption = scanner.nextInt();

        switch (userOption) {
            case 1:
                displayProducts();
                break;

            case 2:
                displayCart();
            case 0:
                //exit?
                System.out.println("Thanks for visting my online store. ");
                System.exit(0);
                break;

            default:
                System.out.println("Incorrect option entered");
        }




    }
}
