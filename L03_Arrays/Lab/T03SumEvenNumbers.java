package M02_ProgrammingFundamentals.L03_Arrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class T03SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int sumEven = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                sumEven += num;
            }
        }
        System.out.println(sumEven);
    }
}