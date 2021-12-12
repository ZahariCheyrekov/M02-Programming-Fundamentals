package M02_ProgrammingFundamentals.L06_ObjectsAndClasses.Exercises;

import java.util.*;

public class T05Students {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfStudents = Integer.parseInt(scanner.nextLine());

        List<Student> students = new ArrayList<>();
        for (int i = 0; i < numberOfStudents; i++) {
            String[] data = scanner.nextLine().split("\\s+");
            String firstName = data[0];
            String lastName = data[1];
            double grade = Double.parseDouble(data[2]);

            Student student = new Student(firstName, lastName, grade);
            students.add(student);
        }
        students.sort(Comparator.comparing(Student::getGrade).reversed());
        students.forEach(System.out::println);
    }

    static class Student {
        String firstName;
        String lastName;
        double grade;

        public Student(String firstName, String lastName, double grade) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.grade = grade;
        }

        public double getGrade() {
            return grade;
        }

        public String toString() {
            return String.format("%s %s: %.2f", this.firstName, this.lastName, this.grade);
        }
    }
}