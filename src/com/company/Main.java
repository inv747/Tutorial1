package com.company;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
public class Main {
    public static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        Main m = new Main();
        m.ageCheck();
    }

    private void ageCheck() {

        System.out.println("Mist game ");
        System.out.println("Put your year of birth:");
        int y = s.nextInt();
        System.out.println("Put your month of birth:");
        int m = s.nextInt();
        System.out.println("Put your day of birth:");
        int d = s.nextInt();
        LocalDate birthDay = LocalDate.of(y, m, d);
        LocalDate currentDay = LocalDate.now();

        int age = ageCalculator(birthDay, currentDay);

        if (age > 0 && age <18) {
            System.out.println("You are too young");
        } else if (age >=18 && age<100){
            System.out.println("Welcome");
        } else if (age >= 100) {
            System.out.println("Really");
        } else {
            System.out.println("Put actual date");
        }


    }

    private int ageCalculator(LocalDate birthDay, LocalDate currentDay) { // year month day
        if ((birthDay != null) && (currentDay != null)) {
            return Period.between(birthDay, currentDay).getYears();
        } else {
            return 0;
        }
    }
}
