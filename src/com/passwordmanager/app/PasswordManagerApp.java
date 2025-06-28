 package com.passwordmanager.app;

import java.util.Scanner;
import com.passwordmanager.core.Vault;
import com.passwordmanager.models.Credential;

 /**
  * This is the main CLI application for the password manager.
  * Provides a menu option to add, view, delete credentials and (later) to generate passwords as well.
  */
 public class PasswordManagerApp {
     /**
      * Starts the CLI app.
      * Accepts user input from the menu to interact with the vault.
      * @param args command line arguments
      */
    public static void main(String[] args) {
        Vault vault = new Vault();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n<--- Password Manager --->");
            System.out.println("1. Add Credential");
            System.out.println("2. View Credential");
            System.out.println("3. Delete Credential");
            System.out.println("4. Generate Password"); // Yet to implement this
            System.out.println("5. List All");
            System.out.println("6. Exit");
            System.out.println("Enter your choice: ");
            String choice = sc.nextLine();

            try {
                switch (choice) {
                    case "1":
                        System.out.println("Service: ");
                        String service = sc.nextLine();
                        System.out.println("Username: ");
                        String username = sc.nextLine();
                        System.out.println("Password: ");
                        String password = sc.nextLine();

                        vault.addCredential(new Credential(service, username, password));
                        break;
                    case "2":
                        System.out.println("Service name: ");
                        String s = sc.nextLine();
                        Credential found = vault.findByService(s);
                        System.out.println(found != null ? found : "Not found.");
                        break;
                    case "3":
                        System.out.println("Service name: ");
                        String del = sc.nextLine();
                        boolean deleted = vault.deleteByService(del);
                        System.out.println(deleted ? "Deleted" : "Not found.");
                        break;
                    case "5":
                        vault.listAll();
                        break;
                    case "6":
                        System.out.println("Bye!");
                        return;
                    default:
                        System.out.println("Invalid choice.");
                }
            }
            catch (Exception e) {
                System.out.println("Exception: " + e.getMessage());
            }
        }
    }
}