package util;

import java.util.Scanner;

public class Input {
    private static final Scanner sc = new Scanner(System.in);

    public boolean getString(){
        System.out.println("Please insert: Yes or No");
        String answer = sc.nextLine();
        return yesNo(answer);
    }

    public boolean yesNo(String input){
        return input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("yeah") || input.equalsIgnoreCase("yup");
    }

    public int getInt(int min, int max){
        int userInput = 0;
        do{
            System.out.println("Please insert a number between "+min+" and "+max);
            userInput = sc.nextInt();
        }while( min < userInput && userInput > max);
        return userInput;
    }

    public int getInt(){
        return getInt(1, 10);
    }

    public double getDouble(double min, double max){
        double userInput = 0;
        do{
            System.out.println("Please insert a number between "+min+" and "+max);
            userInput = sc.nextDouble();
        }while( min < userInput && userInput > max);
        return userInput;
    }

    public double getDouble(){
        return getDouble(1.00, 10.00);
    }


}
