package M02_ProgrammingFundamentals.L03_Arrays.Exercises;

import java.util.Scanner;

public class T04ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] array = scanner.nextLine().split("\\s+");
        int rotations = Integer.parseInt(scanner.nextLine());

        if (rotations != array.length) {
            for (int i = 0; i < rotations; i++) {
                String temp = array[0];
                for (int j = 0; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
                array[array.length - 1] = temp;
            }
        }
        System.out.println(String.join(" ", array));
    }
}