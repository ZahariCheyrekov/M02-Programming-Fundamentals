package M02_ProgrammingFundamentals.L03_Arrays.Lab;

import java.util.Scanner;

public class T02PrintNumbersInReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers = Integer.parseInt(scanner.nextLine());

        int[] array = new int[numbers];
        for (int i = array.length - 1; i >= 0; i--) {
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}