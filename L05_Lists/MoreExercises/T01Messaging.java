package M02_ProgrammingFundamentals.L05_Lists.MoreExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T01Messaging {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).
                map(Integer::parseInt).collect(Collectors.toList());
        List<String> text = Arrays.stream(scanner.nextLine().split(""))
                .collect(Collectors.toList());

        decryptingMessage(numbers, text);
    }

    private static void decryptingMessage(List<Integer> numbers, List<String> text) {
        StringBuilder decryptedMessage = new StringBuilder();
        int currentSum = 0;

        for (int currentNum : numbers) {
            while (currentNum > 0) {
                currentSum += currentNum % 10;
                currentNum /= 10;
            }
            if (text.size() < currentSum) {
                currentSum = Math.abs(text.size() - currentSum);
            }
            for (int j = 0; j < text.size(); j++) {
                if (currentSum == j) {
                    decryptedMessage.append(text.get(j));
                    text.remove(j);
                    currentSum = 0;
                    break;
                }
            }
        }
        printMessage(decryptedMessage);
    }

    private static void printMessage(StringBuilder decryptedMessage) {
        System.out.println(decryptedMessage);
    }
}