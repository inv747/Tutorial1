package ExtendTutorial;

public class Field {
    private Plant plant = new Plant();

    public Field() {
        System.out.println(plant.size); // size is protected Field{} is in the same package like Plant{}
    }
}
