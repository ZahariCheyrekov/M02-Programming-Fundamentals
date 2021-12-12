package M02_ProgrammingFundamentals.L03_Arrays.MoreExercises;

import java.util.Arrays;
import java.util.Scanner;

public class T04LongestIncreasingSubsequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int maxLength = 0;
        int lastIndex = -1;
        int[] len = new int[numbers.length];
        int[] previous = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            len[i] = 1;
            previous[i] = -1;

            for (int k = 0; k < i; k++) {
                if (numbers[k] < numbers[i] && len[k] + 1 > len[i]) {
                    len[i] = len[k] + 1;
                    previous[i] = k;
                }
            }
            if (len[i] > maxLength) {
                maxLength = len[i];
                lastIndex = i;
            }
        }
        int[] lis = new int[maxLength];
        int currentIndex = maxLength - 1;

        while (lastIndex != -1) {
            lis[currentIndex] = numbers[lastIndex];
            currentIndex--;
            lastIndex = previous[lastIndex];
        }
        for (int li : lis) {
            System.out.print(li + " ");
        }
    }
}