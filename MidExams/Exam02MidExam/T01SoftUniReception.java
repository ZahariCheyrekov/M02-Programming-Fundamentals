package M02_ProgrammingFundamentals.MidExams.Exam02MidExam;

import java.util.Scanner;

public class T01SoftUniReception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int employeeOne = Integer.parseInt(scanner.nextLine());
        int employeeTwo = Integer.parseInt(scanner.nextLine());
        int employeeThree = Integer.parseInt(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());

        int hours = 0;
        while (students > 0) {
            students -= (employeeOne + employeeTwo + employeeThree);
            hours++;
            if (hours % 4 == 0) {
                hours++;
            }
        }
        System.out.printf("Time needed: %dh.", hours);
    }
}