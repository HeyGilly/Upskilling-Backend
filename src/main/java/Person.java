
//-- Creating a class named Person,
//   Creating a blueprint for our object

public class Person {

    //-- Three Fields (Instance Variable & Instance Method)
    //-- 2 Instance Variable
    public String firstName;
    public String lastName;

    //-- 1 Instance Method
    public String sayHello(){
        return String.format("Hello from %s %s!", firstName, lastName);
    }

    //-- Main Method
    public static void main(String[] args) {
        //-- Creating an Instance of our Person class
        //-- Defining a variable (human1) with the type of person
        Person human1 = new Person();

        //-- Assigning values to the object's fields
        human1.firstName = "Rick";
        human1.lastName = "Sanchez";
        //-- Calling the methods and printing it's return
        System.out.println(human1.sayHello());
    }


}
