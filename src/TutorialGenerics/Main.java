package TutorialGenerics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
public class Main {
    public static void main(String[] args) {
     //array list like array but don't worry about size

        ArrayList<String> strings = new ArrayList<>(); //specify type of elements

        strings.add("cat");
        strings.add("dog");
        strings.add("alligator");
        String animal1 = strings.get(1);

        //There are can be more than one TYPE argument

        HashMap<Integer, String> map = new HashMap<>(); //two parameters

        ArrayList<Animal> animalsList = new ArrayList<>();




    }
}
