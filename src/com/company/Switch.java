package com.company;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
    nuclearWeapon();
    }

    static void nuclearWeapon() {
        Scanner s = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("Enter command:");
            String command = s.nextLine();
            switch (command) {
                case "start":
                    System.out.println("Program open");
                    break;
                case "stop":
                    System.out.println("Program closed");
                    flag = false;
                    break;
                case "arm":
                    System.out.println("The bomb was armed");
                    break;
                case "fire":
                    System.out.println("The bomb was fired");
                    break;
                default:
                    System.out.println("Command not recognized");
                    break;
            }
        }
    }
}
