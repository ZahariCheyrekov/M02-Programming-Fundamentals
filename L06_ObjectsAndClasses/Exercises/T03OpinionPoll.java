package M02_ProgrammingFundamentals.L06_ObjectsAndClasses.Exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class T03OpinionPoll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int linesInformation = Integer.parseInt(scanner.nextLine());

        List<Person> people = new ArrayList<>();
        for (int i = 0; i < linesInformation; i++) {
            String[] information = scanner.nextLine().split("\\s+");
            String name = information[0];
            int age = Integer.parseInt(information[1]);

            Person person = new Person(name, age);
            if (person.age > 30) {
                people.add(person);
            }
        }
        Collections.sort(people);
        people.forEach(p -> System.out.printf("%s - %d%n", p.name, p.age));

    }

    static class Person implements Comparable<Person> {
        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        @Override
        public int compareTo(Person p) {
            return this.getName().compareTo(p.getName());
        }
    }
}