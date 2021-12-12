package M02_ProgrammingFundamentals.L03_Arrays.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class T01Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        int[] wagons = new int[number];
        int sum = 0;
        for (int i = 0; i < number; i++) {
            int people = Integer.parseInt(scanner.nextLine());
            wagons[i] = people;
            sum += people;
        }
        System.out.println(Arrays.toString(wagons).replaceAll("[\\[\\],]", ""));
        System.out.println(sum);
    }
}