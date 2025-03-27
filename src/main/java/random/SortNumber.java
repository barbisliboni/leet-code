package src.main.java.random;

import java.util.ArrayList;
import java.util.Scanner;

public class SortNumber {
    public static void main (String[] args) {
        ArrayList<String> numberList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the numbers you want to add to the list separated by a comma: ");
        String numberListAsString = scanner.nextLine();

        numberListAsString.split(",");
        numberList.add(numberListAsString);

        System.out.println(numberList);



    }

}
