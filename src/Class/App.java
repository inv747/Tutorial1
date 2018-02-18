package Class;

import javax.jws.soap.SOAPBinding;

class Thing {
    public String name;
    public static String description; //class variables(associated with the class), can't access

    public static final int LUCKY_NUMBER = 7;
    public static int count = 0;
    public int id;

    public Thing() {
        count++;
        id = count;
    }

    public void showName() {
        System.out.println(name);
        System.out.println(description); //instance m() can access static data because there is class before object
    }

    public static void showStatic() {
        System.out.println(description);
        // this won't work: System.out.println(name); static m() exist before even you created Object(thing1) where name exists
    }


}

public class App {
    public static void main(String[] args) {

        Thing.description = "I am a thing";
        Thing.showStatic();
        System.out.println("******************");

        System.out.println("Before creating object, count is: " + Thing.count); // static access only by class name always the same

        Thing thing1 = new Thing();
        Thing thing2 = new Thing();
        System.out.println("Count after creating 2 objects: " + Thing.count);
        thing1.name = "Bob";
        thing2.name = "Sue";

        System.out.println(thing1.name + "'s lucky number is " + Thing.LUCKY_NUMBER);
    }
}
