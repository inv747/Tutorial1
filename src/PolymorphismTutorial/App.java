package PolymorphismTutorial;
//Polymorphism (many shapes)
public class App {
    public static void main(String[] args) {
        Plant plant1 = new Plant();
        Tree tree = new Tree();

        // Plant plant2 = plant1; // because plant1 reference is referring to an object of type Plant
        // make reference plant2 refer to the same object that plant1 refers to

        //Polymorphism
        Plant plant2 = tree; // Tree is subclass of Plant, Tree is a Plant

        plant2.grow(); // will print override m() from the Tree

        tree.shedLeaves();
        //plant2.shedLeaves();

        doGrow(tree); //tree because polymorphism guarantees me that whenever a parent class is expected, I can use a child class of
        // that parent class (like tree witch extends plants
    }

    public static void doGrow(Plant plant) {
        plant.grow();
    }
}
