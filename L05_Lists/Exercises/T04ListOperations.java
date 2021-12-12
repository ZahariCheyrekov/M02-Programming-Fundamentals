package M02_ProgrammingFundamentals.L05_Lists.Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T04ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).
                map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] tokens = input.split("\\s+");
            String command = tokens[0];
            switch (command) {
                case "Add":
                    int numberToAdd = Integer.parseInt(tokens[1]);
                    numbers.add(numberToAdd);
                    break;
                case "Insert":
                    int numberToInsert = Integer.parseInt(tokens[1]);
                    int index = Integer.parseInt(tokens[2]);
                    if (index >= 0 && index < numbers.size()) {
                        numbers.add(index, numberToInsert);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Remove":
                    int indexToRemove = Integer.parseInt(tokens[1]);
                    if (indexToRemove >= 0 && indexToRemove < numbers.size()) {
                        numbers.remove(indexToRemove);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Shift":
                    String leftOrRight = tokens[1];
                    int count = Integer.parseInt(tokens[2]);
                    switch (leftOrRight) {
                        case "left":
                            shiftLeft(numbers, count);
                            break;
                        case "right":
                            shiftRight(numbers, count);
                            break;
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        printResult(numbers);
    }

    private static void shiftLeft(List<Integer> numbers, int count) {
        for (int i = 0; i < count; i++) {
            int removed = numbers.get(0);
            numbers.remove(numbers.get(0));
            numbers.add(removed);
        }
    }

    private static void shiftRight(List<Integer> numbers, int count) {
        for (int i = 0; i < count; i++) {
            int removed = numbers.get(numbers.size() - 1);
            numbers.remove(numbers.size() - 1);
            numbers.add(0, removed);
        }
    }

    private static void printResult(List<Integer> numbers) {
        for (Integer num : numbers) {
            System.out.print(num + " ");
        }
    }
}