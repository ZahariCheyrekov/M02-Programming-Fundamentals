package M02_ProgrammingFundamentals.MidExams.Exam04MidExam;

import java.util.Arrays;
import java.util.Scanner;

public class T03HeartDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] neighborhood = Arrays.stream(scanner.nextLine().split("@+")).mapToInt(Integer::parseInt).toArray();

        int index = 0;
        String input = scanner.nextLine();
        while (!input.equals("Love!")) {
            String[] data = input.split("\\s+");
            int length = Integer.parseInt(data[1]);
            index += length;
            if (index >= neighborhood.length) {
                index = 0;
            }
            if (neighborhood[index] == 0) {
                System.out.printf("Place %d already had Valentine's day.%n", index);
            } else {
                neighborhood[index] -= 2;
                if (neighborhood[index] == 0) {
                    System.out.printf("Place %d has Valentine's day.%n", index);
                }
            }
            input = scanner.nextLine();
        }
        System.out.printf("Cupid's last position was %d.%n", index);

        int failed = 0;
        for (int house : neighborhood) {
            if (house != 0) {
                failed++;
            }
        }

        if (failed == 0) {
            System.out.println("Mission was successful.");
        } else {
            System.out.printf("Cupid has failed %d places.", failed);
        }
    }
}