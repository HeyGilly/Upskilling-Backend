import java.util.Scanner;

public class MethodExercises {

    public static int addition(int num1, int num2){
        return num1 + num2;
    }

    public static int subtraction(int num1, int num2){
        return num1 - num2;
    }

    public static int multiplication(int num1, int num2){
        return num1 * num2;
    }

    static int result = 0;

    public static int multiplication_02(int a, int b) {
        if ( b > 0){
            result += a;
            multiplication_02(a,b-1);
        }
        return result;
    }

    public static int division(int num1, int num2){
        return num1 / num2;
    }

    public static int modulus(int num1, int num2){
        return num2 % num1;
    }


    public static void rollingDice() {
        Scanner sc = new Scanner(System.in);

        String rollAgain;
        do {
            System.out.println("Enter the number of sides of the pair of dice");
            int diceSides = sc.nextInt();

            int diceOne = (int) Math.floor(Math.random() * (diceSides - 1 + 1) + 1);
            int diceTwo = (int) Math.floor(Math.random() * (diceSides - 1 + 1) + 1);

            System.out.println("Dice One: " + diceOne + "\nDice Two: " + diceTwo);

            sc.nextLine();
            System.out.println("Would you like to roll Again? y/n");
            rollAgain = sc.nextLine();
        } while (rollAgain.equalsIgnoreCase("y"));
        System.out.println("Thank for playing");
    }

    public static void main(String[] args) {

//        //Exercise #1
//        System.out.println("Addition: "+addition(1,2));
//
//        // Exercise #2
//        System.out.println("Subtraction: "+subtraction(2,1));
//
//        // Multiplication
//        System.out.println("Multiplication "+multiplication(2,3));
//
//        //Division
//        System.out.println("Division: "+ division(6,2));
//
//        //Modulus
//        System.out.println("Modulus: "+ modulus(6,2));

        //Multiplication Without *
        System.out.println(multiplication_02(3,5));

        // Rolling Dice
        rollingDice();

        //-- Game Development 101



    }
}
