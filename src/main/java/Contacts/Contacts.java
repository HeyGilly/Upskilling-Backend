package Contacts;

import java.io.File;
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

        Scanner scanner = new Scanner(System.in);

/*
    The application should be able to:
         [ ] Show all your contacts
         [ ] Add a new contact
         [ ] Search a contact by her name
         [ ] Delete an existing contact

    * The application should keep its data in a file named contacts.txt

    Bonus Help:
        * When the application starts, the contact list should be read from the file.
        * Before the application exits, the contacts file should be rewritten.

 */

        //-- Create a directory for data
        Path dataDirectory = Paths.get("src/main/java/Contacts/data");
        //-- Create a File to place the contacts information
        Path contactFile = Paths.get("src/main/java/Contacts/data","contacts.txt");

        //-- If Directory does not exist, Creat one.
        if(Files.notExists(dataDirectory)){
            Files.createDirectories(dataDirectory);
            System.out.println("Data directory created successfully.");
        }

        //-- If contact File is not in dataDirectory, Create one.
        if (Files.notExists(contactFile)){
            //-- Creating File inside of Directory
            Files.createFile(contactFile);
            System.out.println("Contact file created successfully.");
            //-- Creating a tittle for the File so this will already be made
            List<String> contactsList = Arrays.asList("Name | Phone number", "---------------");
            Files.write(contactFile, contactsList);
            System.out.println("Tittle to contact list has been added. ");
        }

        System.out.println("Hello! Welcome to Contect Aplpication");
        int userInput;
        do{
            //-- Showing the users options
            System.out.println("1. View contacts.\n" +
                    "2. Add a new contact.\n" +
                    "3. Search a contact by name.\n" +
                    "4. Delete an existing contact.\n" +
                    "5. Exit.\n" +
                    "Enter an option (1, 2, 3, 4 or 5):");
            //-- Capturing the users option
            userInput = scanner.nextInt();


            //- Start of Condition
            if (userInput == 1){
                //-- Viewing All Contact
                List<String> contactList = Files.readAllLines(contactFile);
                for (String contact : contactList) {
                    System.out.println(contact);
                }
                System.out.println();
            }else if (userInput == 2){
                scanner.nextLine();
                //-- Add a new contact
                System.out.println("Adding a new Contact:");
                System.out.println("Please insert a new contact's name:");
                String newUserName = scanner.nextLine();
                System.out.println("Please insert a new contact's number: (Ex. 5556667777");
                String newUserNumber = scanner.nextLine();

                //-- Add a line to an existing File
                Files.write(
                        Paths.get("src/main/java/Contacts/data","contacts.txt"),
                        Arrays.asList(newUserName+" | "+newUserNumber),
                        StandardOpenOption.APPEND
                );

                //-- Update the new list so when you click on "1" it will show the new list
                List<String> lines = Files.readAllLines(Paths.get("src/main/java/Contacts/data","contacts.txt"));
                List<String> newList = new ArrayList<>();
                newList.addAll(lines);
                Files.write(Paths.get("src/main/java/Contacts/data","contacts.txt"), newList);


                System.out.println("You have added a new contact: " +newUserName+" | "+newUserNumber);
                System.out.println();
            } else if (userInput == 3) {
                scanner.nextLine();
                //-- Search for contact and give information
                System.out.println("Please insert the name of the contact you are looking for:");
                String searchUserName = scanner.nextLine();
                //-- Message that will get send if No user of that name is found
                String message = "Sorry we do not have a user of that name.";
                //-- Loop through name and if name contains name then sout
                List<String> lines = Files.readAllLines(Paths.get("src/main/java/Contacts/data","contacts.txt"));
                for (String name : lines){
                    if (name.contains(searchUserName)){
                        //--Title
                        message = "Name | Phone number\n";
                        message += "---------------\n";
                        message += name;
                    }
                }
                System.out.println(message);
                System.out.println();
            } else if (userInput == 4) {
                scanner.nextLine();
                //-- Removing a certain user
                //-- Search for contact and give information
                System.out.println("Please insert the name of the contact you want to remove:");
                String searchUserName = scanner.nextLine();

                //-- Loop through name and if name contains name then skip
                List<String> lines = Files.readAllLines(Paths.get("src/main/java/Contacts/data","contacts.txt"));
                List<String> newList = new ArrayList<>();
                for (String name : lines){
                    if (name.contains(searchUserName)){
                        System.out.println("Contact Removed: " + name);
                        System.out.println();
                        continue;
                    }
                    newList.add(name);
                }
                Files.write(Paths.get("src/main/java/Contacts/data","contacts.txt"), newList);
            }else {
                System.out.println("Please insert a correct option!");
                System.out.println();
            }

        }while(userInput != 5);










    }
}
