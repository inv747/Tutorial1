package com.company;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Arrays {
    public static void main(String[] args) {

        String[] strings = new String[3];
        strings[0] = "Hello";
        strings[1] = "to";
        strings[2] = "you";
        String[] fruits = {"apple", "banana", "peer"};
        for (String fruit : fruits) {
            //System.out.println(fruit);
        }

        String text; // default value is null - because there is only a references null show path to nowhere

        String[] texts = new String[2]; // by default java will initialize each of those to null
        //thia code is only allocate space only for 2 references / not for the actual Strings

        //Multi Dimensional Arrays - Array of array

        int[][] grid = new int[3][3];
        int counter = 1;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {

                grid[i][j] = counter;
                counter++;
            }
        }

//        for (int row = 0; row < grid.length; row++) {
//            for (int col = 0; col < grid[row].length; col++) {
//                System.out.print(grid[row][col] + "\t");
//            }
//            System.out.println();
//        }

        Scanner input = new Scanner(System.in);
        System.out.println("Enter room length");

        int num1 = input.nextInt();
        int length = num1 * num1;
        System.out.println("room " + num1 + "x" + num1 + "=" + length);

        int[][] grid1 = new int[num1][num1];
        int start = 1;
        for (int row = 0; row < grid1.length; row++) {
            for (int col = 0; col < grid1[row].length; col++) {
                grid1[row][col] = start;
                start++;
                System.out.print(grid1[row][col] + "\t");
            }
            System.out.println();
        }

    }
}















