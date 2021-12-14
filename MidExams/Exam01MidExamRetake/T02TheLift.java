package M02_ProgrammingFundamentals.MidExams.Exam01MidExamRetake;

import java.util.Arrays;
import java.util.Scanner;

public class T02TheLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int waitingPeople = Integer.parseInt(scanner.nextLine());
        int[] lift = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < lift.length; i++) {
            if (lift[i] < 4) {
                if (waitingPeople >= 4 - lift[i]) {
                    waitingPeople -= 4 - lift[i];
                    lift[i] = 4;
                } else {
                    lift[i] += waitingPeople;
                    waitingPeople = 0;
                }
            }
        }
        for (int wagon : lift) {
            if (wagon != 4) {
                System.out.println("The lift has empty spots!");
                break;
            }
        }
        if (waitingPeople > 0) {
            System.out.printf("There isn't enough space! %d people in a queue!%n", waitingPeople);
        }
        System.out.println(Arrays.toString(lift).replaceAll("[\\[\\],]", ""));
    }
}