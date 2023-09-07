import java.util.Scanner;

public class ConsoleExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double pi = 3.14159;

        System.out.printf("The value of pi is approximately %.2f \n", pi);


    //--- Explore the Scanner Class

        //-- Exercise #1
        System.out.println("Insert a number:");
        int promptUserInt = sc.nextInt();

        System.out.println("user input: " +promptUserInt);

        System.out.println();

        //-- Exercise #2
        System.out.println("Insert the first word:");
        String promptUserString_1 = sc.next();
        System.out.println("Insert the second word:");
        String promptUserString_2 = sc.next();
        System.out.println("Insert the third word:");
        String promptUserString_3 = sc.next();

        System.out.printf("This is the sentence: %s %s %s \n", promptUserString_1, promptUserString_2, promptUserString_3);

        System.out.println();

        //-- Exercise #3
        System.out.println("Can the user enter a sentence: ");
        String promptUserSentence = sc.next();
        promptUserSentence += " ";
        promptUserSentence += sc.next();
        promptUserSentence += " ";
        promptUserSentence += sc.next();
        System.out.printf("user's Sentence: %s\n", promptUserSentence);

        sc.nextLine();

        System.out.println("Can the user enter a sentence: ");
        String promptUserSentenceNextLine = sc.nextLine();
        System.out.printf("user's Sentence: %s\n", promptUserSentenceNextLine);

    //-- Calculate the perimeter and area of Codeup classrooms.

    //-- Exercise #1
        System.out.println("What is the length of your office?");
        int length = sc.nextInt();
        sc.useDelimiter("\n");

        System.out.println("What is the width of your office?");
        int width = sc.nextInt();
        sc.useDelimiter("\n");


        int area =length * width;
        double perimeter = (length * 2) * (width * 2);

        System.out.printf("Area: %s \n", area);
        System.out.printf("Perimeter: %s \n", perimeter);



    }
}