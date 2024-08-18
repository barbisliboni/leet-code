package src.main.java.stream;

public class Employee {
    String name;
    String function;
    String gender;
    Double salary;

    public Employee(String name, String function, String gender, Double salary) {
        this.name = name;
        this.function = function;
        this.gender = gender;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getFunction() {
        return function;
    }

    public String getGender() {
        return gender;
    }

    public Double getSalary() {
        return salary;
    }
}
