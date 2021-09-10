/**
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Michael Doyon
 */
package org.example;
import java.util.Scanner;


public class App {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        char choice;

        System.out.print("Is the car silent when you turn the key? ");

        choice = inp.next().charAt(0);

        if (choice == 'y') {

            System.out.print("Are the Battery terminals corroded? ");

            choice = inp.next().charAt(0);

            if (choice == 'y')

                System.out.print("Clean the terminals and try starting again.");

            else

                System.out.print("Replace cables and try again.");

        } else {

            System.out.print("Does the car make a slicking noise? ");

            choice = inp.next().charAt(0);

            if (choice == 'y')

                System.out.print("Replace the Battery.");

            else {

                System.out.print("Does the car crank up but fail to start? ");

                choice = inp.next().charAt(0);

                if (choice == 'y')

                    System.out.print("Check spark plug connections.");

                else {

                    System.out.print("Does the engine start and then die? ");

                    choice = inp.next().charAt(0);

                    if (choice == 'y') {

                        System.out.print("Does your car have fuel injection? ");

                        choice = inp.next().charAt(0);

                        if (choice == 'y')

                            System.out.print("Get in it for service.");

                        else

                            System.out.print("Check to ensure the choke is opening and closing.");

                    } else {

                        System.out.print("This should not be possible.");

                    }

                }

            }

        }

        inp.close();

    }

}


