package M02_ProgrammingFundamentals.MidExams.Exam02MidExam;

import java.util.Arrays;
import java.util.Scanner;

public class T02ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] tokens = input.split("\\s+");
            String command = tokens[0];
            switch (command) {
                case "swap":
                    int firstSwapIndex = Integer.parseInt(tokens[1]);
                    int secondSwapIndex = Integer.parseInt(tokens[2]);
                    swapIndexes(numbers, firstSwapIndex, secondSwapIndex);
                    break;
                case "multiply": {
                    int firstIndex = Integer.parseInt(tokens[1]);
                    int secondIndex = Integer.parseInt(tokens[2]);
                    multiplyNumbers(numbers, firstIndex, secondIndex);
                }
                break;
                case "decrease":
                    decreaseNumbers(numbers);
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.println(Arrays.toString(numbers).replaceAll("[\\[\\]]", ""));
    }

    private static void swapIndexes(int[] numbers, int firstSwapIndex, int secondSwapIndex) {
        int firstElement = numbers[firstSwapIndex];
        int secondElement = numbers[secondSwapIndex];
        numbers[firstSwapIndex] = secondElement;
        numbers[secondSwapIndex] = firstElement;
    }

    private static void multiplyNumbers(int[] numbers, int firstIndex, int secondIndex) {
        numbers[firstIndex] = numbers[firstIndex] * numbers[secondIndex];
    }

    private static void decreaseNumbers(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] -= 1;
        }
    }
}