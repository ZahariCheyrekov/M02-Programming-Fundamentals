package M02_ProgrammingFundamentals.L03_Arrays.MoreExercises;

import java.util.Arrays;
import java.util.Scanner;

public class T01EncryptSortAndPrintArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int names = Integer.parseInt(scanner.nextLine());

        int[] points = new int[names];
        for (int i = 0; i < names; i++) {
            String name = scanner.nextLine();
            int vowelSum = 0;
            int notVowelSum = 0;
            for (int j = 0; j < name.length(); j++) {
                char currentSymbol = name.charAt(j);
                if (currentSymbol == 'a' || currentSymbol == 'e' || currentSymbol == 'i' ||
                        currentSymbol == 'o' || currentSymbol == 'u'
                        || currentSymbol == 'A' || currentSymbol == 'E' || currentSymbol == 'I' ||
                        currentSymbol == 'O' || currentSymbol == 'U') {
                    vowelSum += currentSymbol * name.length();
                } else {
                    notVowelSum += currentSymbol / name.length();
                }
                points[i] = vowelSum + notVowelSum;
            }
        }
        Arrays.sort(points);
        for (int num : points) {
            System.out.println(num);
        }
    }
}