package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {

//Create a program that will randomly select two numbers from 1-6 (like rolling two dice).
// Show the dice rolls and end the program UNLESS the program rolls doubles.
// If the program rolls doubles, then it should roll again, show the new roll and stop UNLESS the program rolls doubles again and so on.
// But on the third time you roll doubles, you don't get to roll again, on the third time you roll doubles, you go to jail!
//
//The program should print the sum of the rolls and indicate if the user should stop or roll again or go to Jail.
// See the example output below.
//

//User rolls  2  &  6
//Move 8 Spaces and stop
//User rolls  3  &  3
//DOUBLES!
//Move 6 Spaces and roll again getting...
//User rolls 1 & 2
//Move 3 Spaces and stop
//User rolls  2  &  2
//DOUBLES!
//Move 4 Spaces and roll again getting...
//User rolls 1 & 1
//DOUBLES
//Move 2 Spaces and roll again getting...
//User rolls 6 & 6
//DOUBLES
//GO TO JAIL --->


    public static void main(String[] args) {
        System.out.println("User rolling dice ....");
        Random dice = new Random();
        int count = 0;
        while (true) {

            int diceOne = dice.nextInt(6) + 1;
            int diceTwo = dice.nextInt(6) + 1;
            int total = diceOne + diceTwo;

            if (diceOne == diceTwo) {
                System.out.println("User rolls " + diceOne +" & "+ diceTwo );
                System.out.println("Doubles!");
                System.out.println("Move " + total + " Spaces and roll again getting");
                count++;
            } else if (diceOne != diceTwo) {
                System.out.println("User rolls " + diceOne +" & "+ diceTwo );
                System.out.println("Move " + total + " Spaces and Stop");
                break;
            }

            }
        if (count >= 3) {
            System.out.println("Go to jail!");

        }
    }
}
