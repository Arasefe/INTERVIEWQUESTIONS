package lambdaPackage.basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Challenge1 {
    static class Person{
        public final String name;
        public final Integer age;

        public Person(String name, Integer age) {
            this.name=name;
            this.age=age;
        }
    }
    static class Car{
        public final String make;
        public final String color;
        public final Float price;

        public Car(String make,String color,Float price){
            this.make=make;
            this.color=color;
            this.price=price;
        }
    }
    static class Employee{
        public final String name;
        public final Integer age;
        public final String jobTitle;
        public final Float salary;

        public Employee(String name, Integer age, String jobTitle,Float salary){
            this.name=name;
            this.age=age;
            this.jobTitle=jobTitle;
            this.salary=salary;
        }
    }

    public static void main(String[] args) {
        Person[]peopleArr={
                new Person("Brandon",23),
                new Person("Hank",43),
                new Person("Jenna",33),
                new Person("Veronica",56),
                new Person("Jack",27),
        };

        List<Person>people=new ArrayList<>(Arrays.asList(peopleArr));
        // Get a list that contains all the people's names
        List<String>peopleNames=people
                .stream()
                .map(Person->Person.name)
                .collect(Collectors.toList());
        System.out.println(peopleNames);
        Car[]carsArr={
                new Car("Chevvy","red",45000f),
                new Car("Ford","blue",23000f),
                new Car("Toyota","grey",14000f),
                new Car("Lamborghini","blue",150000f),
                new Car("Renault","blue",150000f),
        };

        List<Car>cars=new ArrayList<>(Arrays.asList(carsArr));
        // Get a list of all the blue cars
        List<Car>blueCars=cars
                .stream()
                .filter(Car->Car.color.equals("blue"))
                .collect(Collectors.toList());
        System.out.println(blueCars);
        Employee[]employeesArr={
                new Employee("John",34,"developer",100000f),
                new Employee("Hannah",24,"developer",75000f),
                new Employee("Bart",50,"Sales Executive",102000f),
                new Employee("Sophie",34,"writer",60000f),
                new Employee("Darren",38,"developer",100000f),
                new Employee("Nancy",29,"developer",90000f),
        };
        List<Employee>employees=new ArrayList<>(Arrays.asList(employeesArr));
        // Find the sum of all of the employee's salaries

        Float sumOfSalaries=employees
                .stream()
                .map(employee -> employee.salary)
                .reduce(0f,(acc,x)->acc+x);
        System.out.println(sumOfSalaries);
    }
}
