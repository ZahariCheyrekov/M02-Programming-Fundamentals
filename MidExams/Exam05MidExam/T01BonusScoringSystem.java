package M02_ProgrammingFundamentals.MidExams.Exam05MidExam;

import java.util.Scanner;

public class T01BonusScoringSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int students = Integer.parseInt(scanner.nextLine());
        int lectures = Integer.parseInt(scanner.nextLine());
        int bonus = Integer.parseInt(scanner.nextLine());

        int maxAttendance = 0;
        double maxBonus = 0;
        for (int i = 1; i <= students; i++) {
            int attendance = Integer.parseInt(scanner.nextLine());
            double totalBonus = Math.round((1.0 * attendance / lectures) * (5 + bonus));
            if (maxAttendance < attendance) {
                maxAttendance = attendance;
                maxBonus = totalBonus;
            }
        }
        System.out.printf("Max Bonus: %.0f.%n", maxBonus);
        System.out.printf("The student has attended %d lectures.", maxAttendance);
    }
}