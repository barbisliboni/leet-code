package src.main.java.fors;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a number: ");
        int number = scanner.nextInt();

        multiplicationTable(number);
    }

    private static void multiplicationTable(int number) {
        for(int i = number; i <= number; i++) {
            for(int x = 1; x <= 10; x++) {
                int calculate = x * i;
                System.out.println(x + " x " + i + " = " + calculate );
            }
        }
    }
}
