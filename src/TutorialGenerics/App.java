package TutorialGenerics;

import java.util.ArrayList;

class Machine {
    @Override
    public String toString() { // alt + Insert toString Override
        return "I am a machine";
    }
}

class Camera extends Machine {
    @Override
    public String toString() {
        return "I am a camera";
    }
}

public class App {
    public static void main(String[] args) {
        ArrayList<Machine> list1 = new ArrayList<>();

        list1.add(new Machine());
        list1.add(new Machine());

        ArrayList<Camera> list2 = new ArrayList<>();

        list2.add(new Camera());
        list2.add(new Camera());

        showList(list2); // can't pass list2 because ArrayList<Camera> not extends ArrayList<Machine>
    }

//    public static void showList(ArrayList<Machine> list) {
//        for (Machine value : list) {
//            System.out.println(value);
//        }
//    }
public static void showList(ArrayList<?> list) { //?-wildcard read (ArrayList<UNKNOW_TYPE> you can pass any type
        for (Object value : list) { //Object is ultimate parent of all
            System.out.println(value);
        }
    }

}
