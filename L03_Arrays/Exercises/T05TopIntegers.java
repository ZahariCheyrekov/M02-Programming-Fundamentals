package M02_ProgrammingFundamentals.L03_Arrays.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class T05TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < numbers.length; i++) {
            int currentElement = numbers[i];
            boolean isTop = true;
            for (int j = i; j < numbers.length - 1; j++) {
                if (currentElement <= numbers[j + 1]) {
                    isTop = false;
                    break;
                }
            }
            if (isTop) {
                System.out.print(currentElement + " ");
            }
        }
    }
}