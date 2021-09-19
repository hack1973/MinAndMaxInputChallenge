package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minNumber = 0;
        int maxNumber = 0;
        boolean first = true;

        while (true) {

            System.out.println("Enter number:");
            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int number = scanner.nextInt();
                if (first) {
                    first = false;
                    minNumber = number;
                    maxNumber = number;
                }
                if (number < minNumber) {
                    minNumber = number;
                }
                if (number > maxNumber) {
                    maxNumber = number;
                }
            } else {
                break;
            }
            scanner.nextLine();
        }
        System.out.println("Minimum number = " + minNumber);
        System.out.println("Maximum number = " + maxNumber);
        scanner.close();
    }
}
