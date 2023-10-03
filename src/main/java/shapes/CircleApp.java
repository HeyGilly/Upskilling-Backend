package shapes;

import util.Input;

import java.util.Scanner;

public class CircleApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        Circle shapes_01 = new Circle();
        Input userInputChoice = new Input();
        boolean results;
        int keepCount = 0;

        do{
            System.out.println("Insert the radius of the circle:");
            double userInput = sc.nextDouble();
            System.out.println("Area: "+shapes_01.getArea(userInput));
            System.out.println("Circumference: "+shapes_01.getCircumference(userInput));
            System.out.println("Would you like to create another Circle:");
            results = userInputChoice.getString();
            shapes_01.addKeepCount();
        }while(results);
        System.out.println("Thanks for playing!");
        System.out.println("Created "+shapes_01.showCount()+" Circles!");




    }
}
