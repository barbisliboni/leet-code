package src.main.java;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a number: ");
        long number = scanner.nextLong();

        getEvenOrOddValue(number);

    }

    /**
     * Prints on the console if the given number is even or odd.
     * @param number
     */
    public static void getEvenOrOddValue(Long number) {
        if (number % 2 == 0) {
            System.out.println(number + " is an even number");
        } else {
            System.out.println(number + " is an odd number");
        }
    }
}
