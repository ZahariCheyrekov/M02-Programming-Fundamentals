package M02_ProgrammingFundamentals.L06_ObjectsAndClasses.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class T06Students2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student2> students = new ArrayList<>();

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] currentStudent = input.split("\\s+");
            String firstName = currentStudent[0];
            String lastName = currentStudent[1];
            String age = currentStudent[2];
            String town = currentStudent[3];

            if (!isAlreadyExist(firstName, lastName, students, age, town)) {
                Student2 student = new Student2(firstName, lastName, age, town);
                students.add(student);
            }
            input = scanner.nextLine();
        }
        String town = scanner.nextLine();

        for (Student2 student : students) {
            if (student.getTown().equals(town)) {
                System.out.printf("%s %s is %s years old\n", student.getFirstName(), student.getLastName(),
                        student.getAge());
            }
        }
    }

    private static boolean isAlreadyExist(String firstName, String lastName, List<Student2> students, String age, String city) {
        for (Student2 student : students) {
            boolean isFirstName = student.getFirstName().equals(firstName);
            boolean isLastName = student.getLastName().equals(lastName);
            if (isFirstName && isLastName) {
                student.setAge(age);
                student.setTown(city);
                return true;
            }
        }
        return false;
    }

    static class Student2 {
        String firstName;
        String lastName;
        String age;
        String town;

        public Student2(String firstName, String lastName, String age, String town) {
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

        public void setAge(String age) {
            this.age = age;
        }

        public void setTown(String town) {
            this.town = town;
        }
    }
}