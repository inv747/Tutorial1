package stringBuilderAndFormatting;

class Frog{
    private int id;
    private String name;

    public Frog(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
//        StringBuilder stringBuilder = new StringBuilder();
//        stringBuilder.append(id).append(": ").append(name); // more efficient then String base + String something
//        return stringBuilder.toString();
        return String.format("%d: %s", id, name);
    }
}
public class App {
    public static void main(String[] args) {

        Frog frog1 = new Frog(7, "Freddy");
        Frog frog2 = new Frog(8, "Tod");

        System.out.println(frog1);
        System.out.println(frog2);









        String info = "";
        info += "My name is Bob.";
        info += " ";
        info += "I'm a builder";

        StringBuilder sb = new StringBuilder();
        sb.append("My");
        sb.append(" ");
        sb.append("is");
        sb.append(" ");
        sb.append("Jack");

//        System.out.printf("Total cost: %.3f\n", 54.7892);

        for (int i = 1; i<=120;i++) {
            double d = Math.random()*10;
//            System.out.printf("%3d %s %.2f\n", i, d,info+ ": cost is:");
        }

    }

    static void setDepartmentNumber() {
        for(int p = 1; p<=7; p++) {
            for (int f = 1; f<=7; f++) {
                for (int s = 1; s<=7;s++) {
                    if (p % 2 == 0 && (p + f + s) == 12 && p!= f && f!=s && p!=s) {
                        System.out.printf("Police: %d; Fire %d; Sanitation %d\n", p, f, s);
                    }
                }
            }
        }
    }
}
