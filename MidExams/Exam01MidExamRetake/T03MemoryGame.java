package M02_ProgrammingFundamentals.MidExams.Exam01MidExamRetake;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T03MemoryGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> elements = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        int moves = 0;
        String input = scanner.nextLine();
        while (!input.equals("end")) {
            moves++;
            String[] indexes = input.split("\\s+");
            int firstElement = Integer.parseInt(indexes[0]);
            int secondElement = Integer.parseInt(indexes[1]);

            boolean isCorrect = checkIfCorrect(elements, firstElement, secondElement, moves);
            if (isCorrect) {
                checkAndRemove(elements, firstElement, secondElement);
            }
            if (elements.isEmpty()) {
                System.out.printf("You have won in %d turns!%n", moves);
                return;
            }
            input = scanner.nextLine();
        }
        System.out.println("Sorry you lose :(");
        printResult(elements);
    }

    private static void checkAndRemove(List<String> elements, int firstElement, int secondElement) {
        if (elements.get(firstElement).equals(elements.get(secondElement))) {
            System.out.printf("Congrats! You have found matching elements - %s!%n", elements.get(firstElement));
            String currentElement = elements.get(firstElement);
            for (int i = 0; i < elements.size(); i++) {
                if (elements.get(i).equals(currentElement)) {
                    elements.remove(i);
                    i = -1;
                }
            }
        } else {
            System.out.println("Try again!");
        }
    }

    private static boolean checkIfCorrect(List<String> elements, int firstElement, int secondElement, int moves) {
        if (firstElement == secondElement ||
                firstElement < 0 || secondElement < 0 ||
                firstElement >= elements.size() || secondElement >= elements.size()) {
            System.out.println("Invalid input! Adding additional elements to the board");
            elements.add(elements.size() / 2, "-" + moves + "a");
            elements.add(elements.size() / 2 + 1, "-" + moves + "a");
            return false;
        }
        return true;
    }

    private static void printResult(List<String> elements) {
        System.out.println(String.join(" ", elements));
    }
}