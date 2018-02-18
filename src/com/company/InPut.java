package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class InPut {

    public static void main(String[] args) {

        InPut m = new InPut();
        m.whoIsTheBestTest();

    }
    void chooseNumber() {
        int randomNumber = ThreadLocalRandom.current().nextInt(1, 10);
        Scanner input = new Scanner(System.in);
        int myNumber;
        do {
            System.out.println("Guess number from 1 to 10:");
            myNumber = input.nextInt();
            if (myNumber == randomNumber) {
                System.out.println("Congratulation you win");
            }
        } while (myNumber != randomNumber);
    }

    void whoIsTheBestTest() {
        String[] theBest = {"Wojtek", "Dominika"};
        List<String> names = Arrays.asList(theBest);
        Scanner input = new Scanner(System.in);
        String s;
        String bestName = null;
        do {
            System.out.println("Put name of the best guy in the world:");
            s = input.nextLine();

            for (String lowerCase : names) {
                if (lowerCase.equalsIgnoreCase(s)) {
                    bestName = lowerCase;
                }
            }
        }while (bestName == null);
        System.out.println("Yes, "+ bestName + " is the best");

    }
}
