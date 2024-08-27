package src.main.java.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {

        Employee employeeOne = new Employee(
                "Barbara",
                "Software Engineer",
                "Female",
                4500.00);

        Employee employeeTwo = new Employee(
                "Thiago",
                "Software Engineer",
                "Male",
                2000.00);

        Employee employeeThree = new Employee(
                "John",
                "Designer",
                "Male",
                1000.00);

        Employee employeeFour = new Employee(
                "Max",
                "QA",
                "Male",
                3200.00);

        Employee employeeFive = new Employee(
                "Catarina",
                "Software Engineer",
                "Female",
                4000.00);

        Employee employeeSix = new Employee(
                "Gabrielle",
                "Designer",
                "Female",
                1500.00);

        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(employeeOne);
        employees.add(employeeTwo);
        employees.add(employeeThree);
        employees.add(employeeFour);
        employees.add(employeeFive);
        employees.add(employeeSix);

        List<Employee> salaryAboveThreeThousand = employees.stream()
                .filter(employee -> employee.getSalary() >= 3000.00)
                .toList();

        List<Employee> femaleGroup = employees.stream()
                        .filter(employee -> employee.getGender().equals("Female"))
                        .toList();

        Optional<Employee> findEmployee = employees.stream()
                        .findAny();

        salaryAboveThreeThousand.forEach(employee -> System.out.println(employee.name));
        System.out.println("------");
        femaleGroup.forEach(employee -> System.out.println(employee.name));
        System.out.println("------");
        System.out.println(findEmployee.get().getName()); //returns first element but with no assurance

        // now changing the array list order to check

        Employee employeeSeven = new Employee(
                "Thiago",
                "Software Engineer",
                "Male",
                2000.00);

        Employee employeeEight = new Employee(
                "Barbara",
                "Software Engineer",
                "Female",
                4500.00);


        ArrayList<Employee> employees2 = new ArrayList<>();
        employees2.add(employeeSeven);
        employees2.add(employeeEight);

        Optional<Employee> findEmployee2 = employees2.stream()
                .findAny();

        System.out.println("------");
        System.out.println(findEmployee2.get().getName());

        Boolean hasT = employees.stream()
                .anyMatch(employee -> employee.getName().startsWith("T"));

        System.out.println("------");
        System.out.println(hasT);

        Boolean hasZ = employees.stream()
                .anyMatch(employee -> employee.getName().startsWith("Z"));

        System.out.println("------");
        System.out.println(hasZ);
        System.out.println("------");

        List<Employee> skipFirstTwoElements = employees.stream()
                .skip(2) //skips the two first elements of the list
                .toList();

        skipFirstTwoElements.forEach(employee -> System.out.println(employee.name));
        System.out.println("------");

        Stream<Employee> nameToLowerCase = employees.stream()
                .peek(employee -> employee.setName(employee.getName().toLowerCase())); //changes the state of the elements


        nameToLowerCase.forEach(employee -> System.out.println(employee.name));
        System.out.println("------");

        // exercises taken from https://www.w3resource.com/java-exercises/stream/index.php

        // calculate the average of a list of integers

        getAverageNumber();
        System.out.println("------");

        // convert a list of strings to lowercase
        toLowerCase();
        System.out.println("------");

        // convert a list of strings to uppercase
        toUpperCase();
        System.out.println("------");

        // sum of all even, odd numbers in a list
        evenOddSum();
        System.out.println("------");

        // remove all duplicate elements from a list
        removeDuplicates();
        System.out.println("------");

        // count the number of strings in a list that start with a specific letter
        countStringNumber();
        System.out.println("------");

        // sort a list of strings in alphabetical order, ascending and descending
        sortStringsAlphabetically();
        System.out.println("------");

        // find the maximum and minimum values in a list of integers
        getMinMaxValue();
        System.out.println("------");

        // find the second smallest and largest elements in a list of integers
        getSecondMinAndMaxValue();
        System.out.println("------");
    }

    private static void getAverageNumber() {
        //ArrayList<Integer> numbers = new ArrayList<>();
        List<Integer> numbers = Arrays.asList(1, 32, 128, 2, 64, 4, 16);

//        numbers.add(1);
//        numbers.add(32);
//        numbers.add(128);
//        numbers.add(2);
//        numbers.add(64);
//        numbers.add(4);
//        numbers.add(16);

       Integer averageNumber =  numbers.stream().max(Integer::compare).get();

       System.out.println("The average number is " + averageNumber);
    }

    private static void toLowerCase() {
        List<String> names = Arrays.asList("Barbara", "Thiago", "John", "Max", "Catarina", "Gabrielle");

        List<String> lowerCaseNames = names.stream().map(name -> name.toLowerCase()).toList();

        System.out.println(lowerCaseNames);
    }

    private static void toUpperCase() {
        List<String> names = Arrays.asList("Barbara", "Thiago", "John", "Max", "Catarina", "Gabrielle");

        List<String> upperCaseNames = names.stream().map(name -> name.toUpperCase()).toList();

        System.out.println(upperCaseNames);
    }

    private static void evenOddSum() {
        List<Integer> numbers = Arrays.asList(2, 3, 6, 7, 10, 11);

        List<Integer> evenNumbers = numbers.stream().filter(number -> number % 2 == 0).toList();
        Integer evenNumbersSum = evenNumbers.stream().reduce(0, (evenNumber, sum) -> evenNumber + sum);

        List<Integer> oddNumbers = numbers.stream().filter(number -> number % 2 != 0).toList();
        Integer oddNumbersSum = oddNumbers.stream().reduce(0, (oddNumber, sum) -> oddNumber + sum);

        System.out.println("Even numbers sum is " + evenNumbersSum);
        System.out.println("Odd numbers sum is " + oddNumbersSum);
    }

    private static void removeDuplicates() {
        List<String> names  = Arrays.asList("Barbara", "Barbara", "Thiago", "John", "John", "Max");

        List<String> removedDuplicatedNames = names.stream().distinct().toList();

        System.out.println(removedDuplicatedNames);
    }

    private static void countStringNumber() {
        List<String> names = Arrays.asList("Barbara", "Bianca", "Thiago", "Bruna", "Tania", "Tatiane");

        Long stringCountB = names.stream().filter(name -> name.startsWith("B")).count();
        Long stringCountT = names.stream().filter(name -> name.startsWith("T")).count();

        System.out.println(stringCountB + " strings starts with B, and " + stringCountT + " starts with T" );
    }

    private static void sortStringsAlphabetically() {
        List<String> names = Arrays.asList("Barbara", "Thiago", "John", "Max", "Catarina", "Gabrielle");

        List<String> sortedNamesAscending = names.stream().sorted().toList();
        List<String> sortedNamesDescending = names.stream().sorted(Comparator.reverseOrder()).toList();

        System.out.println(sortedNamesAscending);
        System.out.println(sortedNamesDescending);
    }

    private static void getMinMaxValue() {
        List<Integer> numbers = Arrays.asList(1, 32, 128, 2, 64, 4, 16);

        Integer maxNumber = numbers.stream().max(Comparator.naturalOrder()).get();
        Integer minNumber = numbers.stream().min(Comparator.naturalOrder()).get();

        System.out.println(maxNumber);
        System.out.println(minNumber);
    }

    private static void getSecondMinAndMaxValue() {
        List<Integer> numbers = Arrays.asList(1, 32, 128, 2, 64, 4, 16);

        List<Integer> orderedNumbers = numbers.stream().sorted().toList();
        int listSize = orderedNumbers.size();
        Integer secondBiggestValue = orderedNumbers.get(listSize - 2);
        System.out.println("The as-is list is " + numbers +
                ". It ordered is " + orderedNumbers + ". The list`s size is " +
                listSize + ", and the second biggest value is " + secondBiggestValue);
    }
}