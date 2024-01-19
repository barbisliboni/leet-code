package src.main.java.fors;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a number: ");
        int number = scanner.nextInt();

        int result = calculateFactorial(number);
        System.out.println(result);

    }

    private static int calculateFactorial(int number) {
        int factorial = 1;
        for (int i = number; i >= 1; i--) {
            factorial *= i;
        }
        return factorial;
    }
}