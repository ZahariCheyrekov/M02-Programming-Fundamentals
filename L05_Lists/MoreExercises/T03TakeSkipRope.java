package M02_ProgrammingFundamentals.L05_Lists.MoreExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class T03TakeSkipRope {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Character> letters = new ArrayList<>();
        List<Character> numbers = new ArrayList<>();

        finNumbersAndDigits(input, letters, numbers);

        List<Integer> takeList = new ArrayList<>();
        List<Integer> skipList = new ArrayList<>();
        findEvenOrOdd(numbers, takeList, skipList);


        String string = letters.toString()
                .substring(1, 3 * letters.size() - 1)
                .replaceAll(", ", "");

        takePartsOfString(string, takeList, skipList);
    }

    private static void finNumbersAndDigits(String input, List<Character> letters, List<Character> numbers) {
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (Character.isDigit(currentChar)) {
                numbers.add(currentChar);
            } else {
                letters.add(currentChar);
            }
        }
    }

    private static void findEvenOrOdd(List<Character> numbers, List<Integer> takeList, List<Integer> skipList) {
        for (int i = 0; i < numbers.size(); i++) {
            int currentNum = Character.getNumericValue(numbers.get(i));
            if (i % 2 == 0) {
                takeList.add(currentNum);
            } else {
                skipList.add(currentNum);
            }
        }
    }

    private static void takePartsOfString(String string, List<Integer> takeList, List<Integer> skipList) {
        StringBuilder newString = new StringBuilder();
        for (int i = 0; i < takeList.size(); i++) {
            int take = takeList.get(i);
            for (int j = 0; j < take; j++) {
                if (string.length() == 0) {
                    break;
                }
                newString.append(string.charAt(0));
                string = string.substring(1);
            }

            for (int j = 0; j < skipList.get(i); j++) {
                if (string.length() == 0) {
                    break;
                }
                string = string.substring(1);
            }
        }
        System.out.println(newString);
    }
}