package ExtendTutorial;

public class Plant {
    private String name; // encapsulation private

    //Acceptable practice ---- it's final
    public final static int ID = 8; //final can't be change

    private String type; // private access only in this class (EVEN IN SUBCLASS/CHILDCLASS)

    protected String size; //protected -access: in class, in package and all subclasses! of Plant

    int height; // default - package only level visibility


    public Plant() {
        this.name = "Fred";
        this.type = "plant";
        this.size = "medium";
        this.height = 8;
    }
}
