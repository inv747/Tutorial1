package TutorialEncapsulation;

import java.sql.SQLTransactionRollbackException;

//idea behind encapsulation - you encapsulate the inner working of that class within the class
// you stop people outside the class getting at the kind of guts(atak) of that class
//  you just expose a kind of public API just some certain m() for people to use outside the class
class Plant {
    private String name;

    public String getData() {
        String data = "some staff" + calculateGrowForecast();
        return data;
    }


    private int calculateGrowForecast() {
        return 9;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {

        return name;
    }
}

public class Main {
    public static void main(String[] args) {

    }
}
