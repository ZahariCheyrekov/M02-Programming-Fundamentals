package M02_ProgrammingFundamentals.L03_Arrays.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class T06EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        if (numbers.length == 1) {
            System.out.println(0);
        } else {
            boolean areEqual = false;
            for (int i = 0; i < numbers.length; i++) {
                int leftSum = 0;
                int rightSum = 0;
                for (int j = 0; j < i; j++) {
                    leftSum += numbers[j];
                }
                for (int j = i + 1; j < numbers.length; j++) {
                    rightSum += numbers[j];
                }
                if (leftSum == rightSum) {
                    areEqual = true;
                    System.out.println(i);
                    break;
                }
            }
            if (!areEqual) {
                System.out.println("no");
            }
        }
    }
}