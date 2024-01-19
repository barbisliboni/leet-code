package src.main.java.ifs;

import java.util.Scanner;

public class FizzBuzz {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a number: ");
        int number = scanner.nextInt();

        printFizzOrBuzz(number);
    }

    private static void printFizzOrBuzz(int number) {
        for(int i = 1; i <= number; i++) {
            if(i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }
    }
}