package M02_ProgrammingFundamentals.L02_DataTypesAndVariables.Exercises;

import java.util.Scanner;

public class T07WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int operations = Integer.parseInt(scanner.nextLine());
        int capacity = 255;

        int total = 0;
        for (int i = 0; i < operations; i++) {
            int liters = Integer.parseInt(scanner.nextLine());
            if (liters > capacity) {
                System.out.println("Insufficient capacity!");
            } else {
                capacity -= liters;
                total += liters;
            }
        }
        System.out.println(total);
    }
}