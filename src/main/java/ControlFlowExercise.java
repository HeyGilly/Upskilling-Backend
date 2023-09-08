import java.util.Scanner;

import static java.lang.Float.NaN;
import static java.lang.Float.isNaN;

public class ControlFlowExercise {
    public static void main(String[] args) {

        //-- Loop Basics


        //- While Loop

//        int i = 5;
//
//        while (i <= 15){
//            System.out.println(i);
//            i++;
//        }

        System.out.println();

        //- Do While
//        int x = 100;
//
//        do {
//            System.out.println(x);
//            x-=5;
//        }while( x >= -10);
//
//        int num = 2;
//        do {
//            System.out.println(num);
//            num = (int) Math.pow(num,2);
//        }while(num <= 1000000);

        //-- Change to a for loop
        for (int x = 100; x >= -10; x -= 5) {
            System.out.println(x);
        }

        for (int num = 2; num <= 1000000; num = (int) Math.pow(num, 2)) {
            System.out.println(num);
        }


        //-- FuzzBuzz
        int z = 1;
        do {
            final Boolean FIZZ = z % 3 == 0;
            final Boolean BUZZ = z % 5 == 0;


            if (FIZZ && BUZZ) {
                System.out.println("FizzBuzz");
            } else if (FIZZ) {
                System.out.println("Fizz");
            } else if (BUZZ) {
                System.out.println("Buzz");
            } else {
                System.out.println(z);
            }

            ++z;
        } while (z <= 100);


        //--- Display a table of powers

        Scanner scan = new Scanner(System.in);

        System.out.println("What number would you like to go up to?");
        int number = scan.nextInt();

        System.out.println("\nHere is your table!\n");

        System.out.print("number | ");
        System.out.print("squared | ");
        System.out.print("cubed \n");

        System.out.print("______ | ");
        System.out.print("_______ | ");
        System.out.print("_____ \n");

        for (int start = 1; start <= number; start++) {
            System.out.println(start + "      | " + (int) Math.pow(start, 2) + "       | " + (int) Math.pow(start, 3));
        }


        //---- Convert given number grades into letter grades

        String userContinue = "";
        do {
            System.out.println("What is the Students Grade:");
            final int STUDENT_GRADE = scan.nextInt();

            if (STUDENT_GRADE >= 88) {

                if(STUDENT_GRADE >= 95){
                    System.out.println("A+");
                }else {
                    System.out.println("A-");
                }

            } else if (80 <= STUDENT_GRADE) {

                if(STUDENT_GRADE >= 85){
                    System.out.println("B+");
                }else {
                    System.out.println("B-");
                }

            } else if (67 < STUDENT_GRADE) {
                if(STUDENT_GRADE >= 75){
                    System.out.println("C+");
                }else {
                    System.out.println("C-");
                }
            } else if (60 <= STUDENT_GRADE) {
                if(STUDENT_GRADE >= 65){
                    System.out.println("D+");
                }else {
                    System.out.println("D-");
                }
            } else{
                System.out.println("F");
            }

            do {
                System.out.println("Would you like to continue grading? y/n");
                userContinue = scan.next();
                System.out.println(userContinue);
            }while (!userContinue.equals("y") && !userContinue.equals("n"));

        } while (userContinue.equals("y"));

        System.out.println("Thank you for grading!");

    }
}
