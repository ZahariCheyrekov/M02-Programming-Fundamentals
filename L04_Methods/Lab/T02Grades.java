package M02_ProgrammingFundamentals.L04_Methods.Lab;

import java.util.Scanner;

public class T02Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double grade = Double.parseDouble(scanner.nextLine());
        findGrade(grade);
    }

    private static void findGrade(double grade) {
        String message;
        if (grade >= 2.00 && grade < 3.00) {
            message = "Fail";
        } else if (grade < 3.50) {
            message = "Poor";
        } else if (grade < 4.50) {
            message = "Good";
        } else if (grade < 5.50) {
            message = "Very good";
        } else {
            message = "Excellent";
        }
        System.out.println(message);
    }
}