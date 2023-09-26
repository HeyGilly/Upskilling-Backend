import java.util.Scanner;

public class HighLow {






    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int random_int = (int)Math.floor(Math.random() * (100 - 1 + 1) + 1);
        System.out.println("Random: "+random_int);

        int userInput = 0;
        int userTries = 0;
        int limitTries = 5;
        Boolean winnerWinner = true;

        do {
            userTries+=1;

            if (limitTries > 0){
                System.out.println("Guess a number between 1 - 100!");
                System.out.println("You have "+limitTries+" attempt(s), Good Luck!");
                userInput = sc.nextInt();

                if(userInput > random_int){
                    System.out.println("You're Higher");
                }else if (userInput < random_int) {
                    System.out.println("You're Lower");
                }
            }

           if(userInput == random_int){
               winnerWinner = false;
               System.out.println("Congrats you won!");
               System.out.println("Total Guesses: "+userTries);
           }else if (limitTries == 0) {
               winnerWinner = false;
               System.out.println("GameOver!");
               System.out.println("Ran out of guesses!");
               System.out.println("Total Guesses: "+userTries);
           }
            limitTries-=1;
        }while (winnerWinner);


    }


}
