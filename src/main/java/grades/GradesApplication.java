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
        String anotherStudent;


        do {
            System.out.println("Welcome!");
            System.out.println("Here are the GitHub usernames of our students:");
            for (String name : students.keySet()) {
                System.out.print(name + " | ");
            }

            System.out.println("\nWhat student would you like to see more information on?");
            String userInput = scanner.nextLine();

            if (students.containsKey(userInput)) {
//            Name: Zach - GitHub Username: zgulde
//            Current Average: 87.4
                //Find Student

                System.out.println("Name: " + students.get(userInput).getName() + " - Github Username: " + userInput);
                System.out.println("Current Average: " + students.get(userInput).getGradeAverage());
                System.out.println();
                System.out.println("Would you like to see another student? y/n");
                anotherStudent = scanner.nextLine();
            } else {
                System.out.println("Sorry, no student found with the GitHub username of" + userInput + ".");
                System.out.println("Would you like to see another student? y/n");
                anotherStudent = scanner.nextLine();
            }
        }while (anotherStudent.equalsIgnoreCase("y"));

    }
}
