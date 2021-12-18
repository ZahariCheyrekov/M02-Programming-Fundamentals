package M02_ProgrammingFundamentals.MidExams.Exam06MidExamRetake;

import java.util.Scanner;

public class T01BlackFlag {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int dailyPlunder = Integer.parseInt(scanner.nextLine());
        double expectedPlunder = Integer.parseInt(scanner.nextLine());

        double gathered = 0;
        int counter = 0;
        for (int i = 1; i <= days; i++) {
            counter++;
            gathered += dailyPlunder;
            if (counter % 3 == 0) {
                gathered += dailyPlunder * 0.5;
            }
            if (counter % 5 == 0) {
                gathered *= 0.70;
            }
        }
        if (gathered >= expectedPlunder) {
            System.out.printf("Ahoy! %.2f plunder gained.", gathered);
        } else {
            System.out.printf("Collected only %.2f%% of the plunder.", gathered / expectedPlunder * 100);
        }
    }
}