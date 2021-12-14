package M02_ProgrammingFundamentals.MidExams.Exam03MidExamRetake;

import java.util.Arrays;
import java.util.Scanner;

public class T02ShootForTheWin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] targets = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int shotTargets = 0;
        String input = scanner.nextLine();
        while (!input.equals("End")) {
            int index = Integer.parseInt(input);
            if (index >= 0 && index < targets.length) {
                if (targets[index] != -1) {
                    shotTargets++;
                    int targetValue = targets[index];
                    targets[index] = -1;
                    for (int i = 0; i < targets.length; i++) {
                        if (targets[i] != -1) {
                            if (targets[i] > targetValue) {
                                targets[i] -= targetValue;
                            } else {
                                targets[i] += targetValue;
                            }
                        }
                    }
                }
            }
            input = scanner.nextLine();
        }
        System.out.printf("Shot targets: %d -> ", shotTargets);
        System.out.println(Arrays.toString(targets).replaceAll("[\\[\\],]", ""));
    }
}