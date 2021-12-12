package M02_ProgrammingFundamentals.L03_Arrays.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class T08MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int magicNumber = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == magicNumber) {
                    System.out.printf("%d %d%n", array[i], array[j]);
                }
            }
        }
    }
}