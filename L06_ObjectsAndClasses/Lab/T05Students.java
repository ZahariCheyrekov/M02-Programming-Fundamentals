package M02_ProgrammingFundamentals.L06_ObjectsAndClasses.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class T05Students {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> students = new ArrayList<>();

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] currentStudent = input.split("\\s+");
            String firstName = currentStudent[0];
            String lastName = currentStudent[1];
            String age = currentStudent[2];
            String town = currentStudent[3];

            Student student = new Student(firstName, lastName, age, town);
            students.add(student);

            input = scanner.nextLine();
        }
        String town = scanner.nextLine();

        for (Student student : students) {
            if (student.getTown().equals(town)) {
                System.out.printf("%s %s is %s years old%n", student.getFirstName(),
                        student.getLastName(), student.getAge());
            }
        }
    }

    static class Student {
        String firstName;
        String lastName;
        String age;
        String town;

        public Student(String firstName, String lastName, String age, String town) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.town = town;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public String getAge() {
            return age;
        }

        public String getTown() {
            return town;
        }
    }
}