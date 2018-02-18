package TutorialCasting;

public class Main {
    public static void main(String[] args) {
        byte byteValue = 20;
        short shortValu = 21;
        int intValue = 444;
        long longValue = 324345;

        float floatValue = 232423.5f; // ass -f at the end or (float)232423.5
        double doubleValue = 432423.4;

//        System.out.println(Double.MAX_VALUE);

        intValue = (int) longValue;
        doubleValue = intValue; // just add .0 to end of intValue

        //intValue = (int) floatValue; //it just chopped the end

        intValue = Math.round(floatValue); //will round the value
        System.out.println(intValue);



    }

}
