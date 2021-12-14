package M02_ProgrammingFundamentals.MidExams.Exam03MidExamRetake;

import java.util.Scanner;

public class T01CounterStrike {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int initialEnergy = Integer.parseInt(scanner.nextLine());

        int wins = 0;
        String input = scanner.nextLine();
        while (!input.equals("End of battle")) {
            int distance = Integer.parseInt(input);
            if (initialEnergy >= distance) {
                initialEnergy -= distance;
                wins++;
                if (wins % 3 == 0) {
                    initialEnergy += wins;
                }
            } else {
                System.out.printf("Not enough energy! Game ends with %d won battles and %d energy", wins, initialEnergy);
                return;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Won battles: %d. Energy left: %d", wins, initialEnergy);
    }
}