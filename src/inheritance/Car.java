package inheritance;

public class Car extends Machine{ //Car has all m() that Machine


    @Override
    public void start() {
        System.out.println("Car started");
    }

    public void wipeWindShield() {
        System.out.println("Wiping windshield");

    }

    public void showInfo() {
        System.out.println(name);
    }
}
