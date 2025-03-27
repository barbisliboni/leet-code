package src.main.java.ifs;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main (String[] args) {

        // Doing the easy way, which is converting the number to a String and using an in-built method to reverse it
        // Its runtime is 11ms without the if`s inside the main function

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any two-digit integer number: ");
        int number = scanner.nextInt();

        if(number <= 0) {
            System.out.println("It must be an integer number");
            return;
        } else if (number <= 9) {
            System.out.println("It must be a two-digit number to be validated.");
            return;
        }

        if (isPalindrome(number)) {
            System.out.println("The number " + number + " is a palindrome, which means that it can be read the same forward and backward.");
        } else {
            System.out.println("The number " + number + " is not a palindrome, which means that it can`t be read the same forward and backward.");
        }

    }

    public static boolean isPalindrome(int x) {
        String numberAsString = String.valueOf(x);
        StringBuilder numberAsStringBuilder = new StringBuilder(numberAsString); // converting the int number to a modified string
        StringBuilder reversedNumberAsStringBuilder = new StringBuilder(numberAsStringBuilder).reverse();

        return numberAsStringBuilder.toString().contentEquals(reversedNumberAsStringBuilder);
    }
}
