package M02_ProgrammingFundamentals.L03_Arrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class T06EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] firstArray = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int[] secondArray = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int sum = 0;
        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i] != secondArray[i]) {
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                return;
            }
            sum += firstArray[i];
        }
        System.out.printf("Arrays are identical. Sum: %d", sum);
    }
}