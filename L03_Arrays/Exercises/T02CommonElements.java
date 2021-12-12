package M02_ProgrammingFundamentals.L03_Arrays.Exercises;

import java.util.Scanner;

public class T02CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] partOne = scanner.nextLine().split("\\s+");
        String[] partTwo = scanner.nextLine().split("\\s+");

        StringBuilder stringBuilder = new StringBuilder();
        for (String element : partTwo) {
            for (String value : partOne) {
                if (element.equals(value)) {
                    stringBuilder.append(value).append(" ");
                }
            }
        }
        System.out.println(stringBuilder);
    }
}