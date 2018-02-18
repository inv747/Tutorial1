package Class;

class Robot {
    //Classes contain:
    // Data
    // Subroutines (methods)
    private String name;
    int seriesNumber;

    public Robot() {
        this("Tom", 2342);
        System.out.println("First constructor running");
    }

    public Robot(String name) {
        this.name = name;
        System.out.println("Second parameter running");
    }

    public Robot(String name, int seriesNumber) {
        this.name = name;
        this.seriesNumber =seriesNumber;
        System.out.println("Third constructor running");
    }


}
public class Class {
    public static void main(String[] args) {
        //use Person class to create particular Person object

        Robot r1 = new Robot();
//        Robot r2 = new Robot("Terminator");
//        Robot r3 = new Robot("Tom", 23421);
    }
}
