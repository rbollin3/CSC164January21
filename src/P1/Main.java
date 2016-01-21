package P1;

/*
* Demo Program for an ordering system
* CSC 164
* Renee Bolling
* January 21 2016
* Version 1.0
* */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Jimmy Johns: ");
        char option;
        double price = 0.0;
        String sandwich = " ";

        do{
            System.out.println("(H)am");
            System.out.println("(R)oast Beef");
            System.out.println("(S)alami");
            System.out.println("(T)una");
            System.out.println("(D)one");
            System.out.print("Enter your choice: ");

            //get user input
            String choice = input.next();
            //convert the string to an upercase
            choice = choice.toUpperCase();
            //get the first character of the users input
            option = choice.charAt(0);
                switch(option){
                    //ham
                    case 'H':
                        price = 5.50;
                        sandwich = "Ham";
                        break;

                    //turkey
                    case 'R':
                        price = 6.00;
                        break;
                    case 'S':
                        price = 6.00;
                        break;
                    case 'T':
                        price = 6.00;
                        break;
                    case 'D':
                        price = 0.0;
                        break;

                    default:
                        price = 0.0;
                        System.out.println("option " + option + " not available");

                }

            //Give the user the order information
            if(price != 0)
            System.out.printf(" %s sandwich cost $%.2f\n ",sandwich, price);


        }while(option != 'D' );
        System.out.println("Thank you for ordering at Jimmy Johns ");
    }
}
