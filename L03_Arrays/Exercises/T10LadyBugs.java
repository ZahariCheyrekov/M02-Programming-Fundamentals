package M02_ProgrammingFundamentals.L03_Arrays.Exercises;

import java.util.Scanner;

public class T10LadyBugs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] field = new int[n];

        String[] bugsIndex = scanner.nextLine().split(" ");

        for (String index : bugsIndex) {
            int bugIndexes = Integer.parseInt(index);
            if (bugIndexes >= 0 && bugIndexes < field.length) {
                field[bugIndexes] = 1;
            }
        }
        String line = scanner.nextLine();

        while (!line.equals("end")) {
            String[] commands = line.split(" ");
            int bugIndex = Integer.parseInt(commands[0]);
            String direction = commands[1];
            int length = Integer.parseInt(commands[2]);

            if (bugIndex < 0 || bugIndex >= field.length || field[bugIndex] != 1) {
                line = scanner.nextLine();
                continue;
            }
            field[bugIndex] = 0;

            if (direction.equals("right")) {
                bugIndex += length;

                while (bugIndex < field.length && field[bugIndex] == 1) {
                    bugIndex += length;
                }
                if (bugIndex < field.length) {
                    field[bugIndex] = 1;
                }
            } else {
                bugIndex -= length;

                while (bugIndex >= 0 && field[bugIndex] == 1) {
                    bugIndex -= length;
                }
                if (bugIndex >= 0) {
                    field[bugIndex] = 1;
                }
            }
            line = scanner.nextLine();
        }
        for (int j : field) {
            System.out.print(j + " ");
        }
    }
}