
//-- Creating a class named Person,
//   Creating a blueprint for our object

public class Person {

    //-- Static Property
    public static long worldPopulation = 7_500_000_000L;
    //-- Instance Property
    public String name;



    public static void main(String[] args) {

    Person theBestDrummerAlive = new Person();
    theBestDrummerAlive.name = "Neil Peart";

    Person.worldPopulation += 1;

        System.out.println(Person.worldPopulation);

        // Technically will work, however it's better to reference
        // static properties through the class, not instances
        System.out.println(theBestDrummerAlive.worldPopulation);

        //-- Error will occur
        System.out.println(Person.name);

    }


}
