package Contacts;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Contacts {
    public static void main(String[] args) throws IOException {


        /*
            Contact Application:

                applciation should:
                    [X] Show all contacts
                    [ ] Add new Contacts
                    [ ] Search a contact by their name
                    [ ] Delete an existing contact

                    [ ]  keep its data in a file named contacts.txt

                Keep in Mind:
                    [ ] The text file should contain one contact per line.
                    [ ] When the application starts, the contact list should be read from the file
                    [ ] Before the application exits, the contacts file should be rewritten.
                    [X] The user interface for your application should include a main menu like the following, where the user will need to enter a number between 1 and 5:
                            1. View contacts.
                            2. Add a new contact.
                            3. Search a contact by name.
                            4. Delete an existing contact.
                            5. Exit.
                            Enter an option (1, 2, 3, 4 or 5):

                    [ ] The contacts information should be shown using the following format
                            Name | Phone number
                            ---------------
                            Jack Blank | 1231231234
                            Jane Doe | 2342342345
                            Sam Space | 3453453456

                Here is what the code for your application might look like:

                    [ ] Load all of the contacts by calling a method that returns a List of Contact objects.
                    [ ] Call a method that shows the user the main menu and returns their choice of action.
                    [ ] Using the user's choice from the previous step, call a method that performs that action (modifying the contents of the List of Contact objects if applicable).
                    [ ] Keep calling the method from step two until the user chooses to exit.
                    [ ] Once the user chooses to exit, re-write the contents of the contacts.txt file using the List of Contact objects.
         */

        Scanner sc = new Scanner(System.in);


        //-- Create a directory 'data'
        //-- Create a file named 'contacts.txt'
        Path filePath = Paths.get("contacts.txt");
        Path directoryPath = Paths.get("src/main/java/data");
        // Place File inside of Folder
        Path fileInFolder = directoryPath.resolve(filePath);
        //- Creates Directory if not exists
        if(!Files.exists(directoryPath)){
            Files.createDirectories(directoryPath);
        }

        // If there is not a file in directory then create file
            Path contactPath = Paths.get("src/main/java/data", "contacts.txt");
            List<String> readingContactList = Files.readAllLines(contactPath);




        if(!Files.exists(fileInFolder)){
            Files.createFile(fileInFolder);
            // When application starts, The title of the file should be there.
            List<String> contactsList = Arrays.asList("Name | Phone number", "---------------");
            Files.write(contactPath, contactsList);
            // When the application starts, the contact list should be read from the file

        }







        //-- Introducing the application
        System.out.println("Hello! Welcome to contact application");
        int userInput = 0;
        do {
            System.out.println();
            System.out.println();

            //-- Showing the users options
            System.out.println("1. View contacts.\n" +
                    "2. Add a new contact.\n" +
                    "3. Search a contact by name.\n" +
                    "4. Delete an existing contact.\n" +
                    "5. Exit.\n" +
                    "Enter an option (1, 2, 3, 4 or 5):");
            //-- Capturing the users option
            userInput = sc.nextInt();

            //-- Condition on which the user inputs
            if (userInput == 1) {
                // View Contacts
                for (String line : readingContactList) {
                    System.out.println(line);
                }
            } else if (userInput == 2) {
                sc.nextLine();
                // Get users name,
                System.out.println("Please Insert the new contact's name:");
                String newContactName = sc.nextLine();
                // Get users Number
                System.out.println("Please Insert the new contact's number:");
                String newContactNumber = sc.nextLine();
                // Add to the existing file
                Files.write(
                        Paths.get("src/main/java/data", "contacts.txt"),
                        Arrays.asList(newContactName + " | " + newContactNumber),
                        StandardOpenOption.APPEND
                );
            } else if (userInput == 3) {
                sc.nextLine();
                System.out.println("What contact are you looking for?");
                String searchedName = sc.nextLine();
                System.out.println("Name | Phone number");
                System.out.println("---------------");
                for (String name : readingContactList) {
                    if (name.contains(searchedName)) {
                        System.out.println(name);
                    }
                }
            } else if (userInput == 4) {
                sc.nextLine();
                System.out.println("What contact are you wanting to delete?");
                String searchedName = sc.nextLine();


                List<String> lines = Files.readAllLines(Paths.get("src/main/java/data", "contacts.txt"));
                // Create an empty arraylist
                List<String> updatedList = new ArrayList<>();

                for(String line :lines){
                    // If milk, then replace with cream
                    if (!line.contains(searchedName)){
                        updatedList.add(line);
                        continue;
                    }
                }

                Files.write(Paths.get("src/main/java/data", "contacts.txt"), updatedList);






            }



    } while (userInput != 5);





    }
}
