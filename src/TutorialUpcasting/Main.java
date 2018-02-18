package TutorialUpcasting;

class Machine {
    public void start() {
        System.out.println("Machine started.");
    }

}

class Camera extends Machine {
    @Override
    public void start() {
        System.out.println("Camera started");
    }

    public void snap() {
        System.out.println("Photo taken.");
    }
}

public class Main {
    public static void main(String[] args) {

        Machine machine1 = new Machine();
        Camera camera1 = new Camera();

        machine1.start();
        camera1.start();
        camera1.snap();

        //Upcasting
        Machine machine2 = camera1; //Polymorphism
        machine2.start(); // override m() from Camera{ }, because the actual object referred to by machine2 is a camera object
        // can't machine.snap(); - it's actual variable that decides what m() you can call / Variables knows what m() are available for that variable type

        //Type of variable (Machine) determines what m() you can call, it's the type of the object that variable refers to that determines
        //  which actual m() like what, which actual implementations will actually be called when you call that m()

        //Downcasting
        Machine machine3 = new Camera();
        Camera camera2 = (Camera) machine3; //(Camera) confirmation because Downcasting is inherently unsafe
        camera2.snap();

        // Machine machine4 = new Machine(); // don't work!! in this point its a Machine type
        // Camera camera3 = (Camera) machine4; // runtime error
        // camera3.start(); - error
    }
}
