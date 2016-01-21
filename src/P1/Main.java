package P1;

/*
* Demo Program for an ordering system
* CSC 164
* Renee Bolling
* January 21 2016
* Version 0.1
* */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Jimmy Johns: ");
        char option;

        do{
            System.out.println("(H)am");
            System.out.println("(T)urkey");
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

            System.out.println("choice = " + choice + "option = " + option);

        }while(option != 'D' );
        System.out.println("Thank you for ordering at Jimmy Johns ");
    }
}
