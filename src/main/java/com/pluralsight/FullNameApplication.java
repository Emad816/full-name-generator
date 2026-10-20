package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        // prompting the user to enter first name
        System.out.printf("Enter first name: ");
        String firstName = scanner.nextLine();
        firstName = firstName.trim();
        firstName = firstName.substring(0,1).toUpperCase()+
                firstName.substring(1);

        // prompting the user to enter middle name
        System.out.printf("Enter middle name: ");
        String middleName = scanner.nextLine();
        middleName = middleName.trim();
        char middleInittal = ' ';
        if(!middleName.isEmpty()) {
            middleInittal = middleName.toUpperCase().charAt(0);
        }

        // prompting the user to enter last name
        System.out.printf("Enter last name: ");
        String lastName = scanner.nextLine();
        lastName = lastName.trim();
        lastName = lastName.substring(0,1).toUpperCase()+
                lastName.substring(1);

        // prompting the user to enter suffix
        System.out.printf("Enter suffix: ");
        String suffix = scanner.nextLine();
        suffix = suffix.trim();
        if(!suffix.isEmpty()) {
            suffix = suffix.substring(0, 1).toUpperCase() +
                    suffix.substring(1);
        }

        String fullName = firstName;

        if (!middleName.isEmpty()){
            fullName = fullName + " " + middleInittal + ".";
        }

        fullName = fullName + " " + lastName;

        if (!suffix.isEmpty()){
            fullName = fullName + " " + suffix;
        }

        System.out.println("Full name is : " + fullName);

    }
}
