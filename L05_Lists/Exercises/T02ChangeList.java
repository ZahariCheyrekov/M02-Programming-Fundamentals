package M02_ProgrammingFundamentals.L05_Lists.Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T02ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).
                map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] tokens = input.split("\\s+");
            String command = tokens[0];
            int element = Integer.parseInt(tokens[1]);
            switch (command) {
                case "Delete":
                    deleteElements(numbers, element);
                    break;
                case "Insert":
                    int position = Integer.parseInt(tokens[2]);
                    insertAtPosition(numbers, element, position);
                    break;
            }
            input = scanner.nextLine();
        }
        printResult(numbers);
    }

    private static void deleteElements(List<Integer> numbers, int element) {
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == element) {
                numbers.remove(numbers.get(i));
            }
        }
    }

    private static void insertAtPosition(List<Integer> numbers, int element, int position) {
        numbers.add(position, element);
    }

    private static void printResult(List<Integer> numbers) {
        for (Integer num : numbers) {
            System.out.print(num + " ");
        }
    }
}