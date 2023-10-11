package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

        Student susie = new Student("susie");
        susie.addGrade(95);
        susie.addGrade(88);
        susie.addGrade(92);
        students.put("Susie_23", susie);

        Student bobby = new Student("bobby");
        bobby.addGrade(95);
        bobby.addGrade(88);
        bobby.addGrade(92);
        students.put("Bobby_23", bobby);

        Student lola = new Student("lola");
        lola.addGrade(95);
        lola.addGrade(88);
        lola.addGrade(92);
        students.put("Lola_23", lola);

        Student chris = new Student("chris");
        chris.addGrade(95);
        chris.addGrade(88);
        chris.addGrade(92);
        students.put("Chris_23", chris);

        Scanner scanner = new Scanner(System.in);
        String anotherStudent = null;


            System.out.println("Welcome!");
        do {
            System.out.println("If you would like to view all students tpye '1' or if you would like to view each student type '2'");
            int userOption = scanner.nextInt();


            if (userOption != 1 && userOption != 2){

            System.out.println("Please Insert the correct input");
            System.out.println("\n\n****************");


                anotherStudent = "y";
            
            }else if (userOption == 1){
            System.out.println("\n****************");
                for (String name : students.keySet()) {
                    System.out.println("Name: "+students.get(name).getName()+" Github: "+name+" Average grade: "+students.get(name).getGradeAverage() );
                }
                scanner.nextLine();

                System.out.println("****************\n");

            System.out.println("Would you like to restart? y/n");
                anotherStudent = scanner.nextLine();
                
            }else if (userOption == 2){

            System.out.println("\n****************");
                System.out.println("Here are the GitHub usernames of our students:");
                for (String name : students.keySet()) {
                    System.out.print(name + " | ");
                }

            System.out.println("\nWhat student would you like to see more information on?");
                scanner.nextLine();
                String userInput = scanner.nextLine();



                if (students.containsKey(userInput)) {
                    System.out.println("\n****************");

//            Name: Zach - GitHub Username: zgulde
//            Current Average: 87.4
                    //Find Student

                    System.out.println("Name: " + students.get(userInput).getName() + " - Github Username: " + userInput);
                    System.out.println("Current Average: " + students.get(userInput).getGradeAverage());
                    System.out.println();
                    System.out.println("Would you like to see another student? y/n");
                    anotherStudent = scanner.nextLine();
                    System.out.println("\n\n****************");

                } else {
                    System.out.println("****************");

                    System.out.println("Sorry, no student found with the GitHub username of " + userInput + ".");
                    System.out.println("Would you like to see another student? y/n");
                    anotherStudent = scanner.nextLine();
                    System.out.println("****************\n");

                }
                
            }


        }while (anotherStudent.equalsIgnoreCase("y"));

        System.out.println("Have a great day!");




    }
}
