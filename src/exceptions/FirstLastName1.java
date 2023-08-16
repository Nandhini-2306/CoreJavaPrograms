package exceptions;

import java.util.Scanner;

class NameException extends Exception {
    public NameException(String message) {
        super(message);
    }
}

class NameProcessor {
    public String checkName(String firstName, String lastName) throws NameException {
        if (firstName.isBlank() && lastName.isBlank()) {
            throw new NameException("Both first name and last name are blank");
        } else {
            return firstName + " " + lastName;
        }
    }
}

public class FirstLastName1 {
    public static void main(String[] args) {
        try {
            NameProcessor nameProcessor = new NameProcessor();
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the first name: ");
            String firstName = sc.nextLine();// Replace with user input
            System.out.println("Enter the last name: ");
            String lastName = sc.nextLine();// Replace with user input
            String fullName = nameProcessor.checkName(firstName, lastName);
            System.out.println("Full Name: " + fullName);
        } catch (NameException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
