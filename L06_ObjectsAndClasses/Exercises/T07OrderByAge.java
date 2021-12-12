package M02_ProgrammingFundamentals.L06_ObjectsAndClasses.Exercises;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class T07OrderByAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Person> people = new ArrayList<>();

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] data = input.split("\\s+");
            String name = data[0];
            String ID = data[1];
            int age = Integer.parseInt(data[2]);

            Person person = new Person(name, ID, age);
            people.add(person);

            input = scanner.nextLine();
        }
        people.sort(Comparator.comparing(Person::getAge));
        people.forEach(System.out::println);
    }

    static class Person {
        String name;
        String ID;
        int age;

        public Person(String name, String ID, int age) {
            this.name = name;
            this.ID = ID;
            this.age = age;
        }

        public int getAge() {
            return age;
        }

        public String toString() {
            return String.format("%s with ID: %s is %d years old.",
                    this.name, this.ID, this.age);
        }
    }
}