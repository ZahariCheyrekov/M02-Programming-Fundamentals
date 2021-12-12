package M02_ProgrammingFundamentals.L03_Arrays.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class T03ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = Integer.parseInt(scanner.nextLine());
        int[] arrayOne = new int[arraySize];
        int[] arrayTwo = new int[arraySize];

        int rotations = 0;
        for (int i = 0; i < arraySize; i++) {
            int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            rotations++;
            if (rotations % 2 == 0) {
                arrayOne[i] = numbers[1];
                arrayTwo[i] = numbers[0];
            } else {
                arrayOne[i] = numbers[0];
                arrayTwo[i] = numbers[1];
            }
        }
        System.out.println(Arrays.toString(arrayOne).replaceAll("[\\[\\],]", ""));
        System.out.println(Arrays.toString(arrayTwo).replaceAll("[\\[\\],]", ""));
    }
}