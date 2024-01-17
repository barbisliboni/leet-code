package src.main.java;

import java.util.Scanner;

public class PrimeNumberOrNot {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write an integer number: ");
        long number = scanner.nextLong();

        getPrimeNumber(number);
    }

    public static boolean getPrimeNumber(long number) {
        if(number <= 1) {
            System.out.println(number + " is not a prime number.");
            return false;
        }

        for(int i = 2; i <= Math.sqrt(number); i++) {
            boolean isNotAPrimeNumber = number % i == 0;
            if(isNotAPrimeNumber) {
                System.out.println(number + " is not a prime number.");
                return false;
            }
        }

        System.out.println(number + " is a prime number.");
        return true;
    }
}
