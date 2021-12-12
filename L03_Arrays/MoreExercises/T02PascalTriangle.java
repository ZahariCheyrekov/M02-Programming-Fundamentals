package M02_ProgrammingFundamentals.L03_Arrays.MoreExercises;

import java.util.Scanner;

public class T02PascalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        long[][] pascalArray = new long[n][];

        for (int i = 0; i < n; i++) {
            pascalArray[i] = new long[i + 1];

            for (int j = 0; j < i + 1; j++) {
                if (j > 0 && j < pascalArray[i].length - 1) {
                    pascalArray[i][j] = pascalArray[i - 1][j - 1] + pascalArray[i - 1][j];
                } else {
                    pascalArray[i][j] = 1;
                }
            }
            for (int j = 0; j < pascalArray[i].length; j++) {
                System.out.print(pascalArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}