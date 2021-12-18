package M02_ProgrammingFundamentals.MidExams.ExamPrep;

import java.util.Scanner;

public class T01BonusScoringSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int students = Integer.parseInt(scanner.nextLine());
        int lectures = Integer.parseInt(scanner.nextLine());
        int bonus = Integer.parseInt(scanner.nextLine());

        int maxAttendances = 0;
        double maxBonus = 0;
        for (int i = 1; i <= students; i++) {
            int attendance = Integer.parseInt(scanner.nextLine());
            double currentBonus = Math.round((1.0 * attendance / lectures) * (5 + bonus));
            if (maxAttendances < attendance) {
                maxAttendances = attendance;
                maxBonus = currentBonus;
            }
        }
        System.out.printf("Max Bonus: %.0f.%n", maxBonus);
        System.out.printf("The student has attended %d lectures.", maxAttendances);
    }
}
