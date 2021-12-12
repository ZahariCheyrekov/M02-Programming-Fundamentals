package M02_ProgrammingFundamentals.L02_DataTypesAndVariables.Exercises;

import java.util.Scanner;

public class T11Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int snowBalls = Integer.parseInt(scanner.nextLine());
        int bestSnow = 0;
        int bestTime = 0;
        int bestQuality = 0;
        double bestValue = Double.NEGATIVE_INFINITY;

        for (int i = 1; i <= snowBalls; i++) {
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());

            double snowballValue = Math.pow((1.0 * snowballSnow / snowballTime), snowballQuality);
            if (snowballValue > bestValue) {
                bestSnow = snowballSnow;
                bestTime = snowballTime;
                bestQuality = snowballQuality;
                bestValue = snowballValue;
            }
        }
        System.out.printf("%d : %d = %.0f (%d)", bestSnow, bestTime, bestValue, bestQuality);
    }
}
