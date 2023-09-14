import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String userResponse = "";
        String userContinue = "";


         System.out.println("Hello I'm Bob! What is happening?");

         do {
             System.out.println("Whats Sup?");
             userResponse = sc.nextLine();

             if(userResponse.endsWith("?")){
                 System.out.println("Sure.");
             }else if(userResponse.endsWith("!")){
                 System.out.println("Whoa, chill out!");
             }else if (userResponse.isEmpty()){
                 System.out.println("Fine. Be that way!");
             }

             System.out.println("Wanna continue this Convo?");
             userContinue = sc.nextLine();

         } while (userContinue.equals("y")|| userContinue.equals("Y"));
        System.out.println("Peace Out!");
    }
}
