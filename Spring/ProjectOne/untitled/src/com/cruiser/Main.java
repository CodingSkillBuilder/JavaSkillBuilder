package com.cruiser;

import java.util.Objects;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        DBSave.addUser(new User("123")); // id = 0
        DBSave.addUser(new User("456")); // id = 1
        Scanner scanner = new Scanner(System.in);
        System.out.print("""
                Enter your choice:
                l - for login
                r - for register
                Your choice here: 
                """);
        String choice = scanner.nextLine();
        if (Objects.equals(choice, "l")){
            System.out.print("enter id: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            int index = DBSave.idFinder(id);
            if (index == -1){
                System.out.println("Id not found");
            } else {
                System.out.print("Enter password: ");
                String password = scanner.nextLine();
                if (Objects.equals(password, DBSave.getPassword(id))){
                    System.out.println("login successful");

                } else {
                    System.out.println("wrong password");
                }
            }
        } else if (Objects.equals(choice, "r")) {
            System.out.print("Type a suitable password: ");
            String password = scanner.nextLine();
            DBSave.addUser(new User(password));
            System.out.println("You are now registered");
            System.out.println("Your user ID is: " + DBSave.last());
        } else {
            System.out.println("Invalid entry");
        }


    }
}
