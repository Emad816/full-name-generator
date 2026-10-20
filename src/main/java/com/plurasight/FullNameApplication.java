package com.plurasight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);

        System.out.printf("Enter first name: ");
        String firstName = scanner.next();

        System.out.printf("Enter middle name: ");
        String middleName = scanner.next();

        System.out.printf("Enter last name: ");
        String lastName = scanner.next();

        System.out.printf("Enter suffix: ");
        String suffix = scanner.next();


    }
}
