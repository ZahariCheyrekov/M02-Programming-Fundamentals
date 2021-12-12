package M02_ProgrammingFundamentals.L05_Lists.Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T06CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> firstPlayerCards = Arrays.stream(scanner.nextLine().split("\\s+")).
                map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondPlayerCards = Arrays.stream(scanner.nextLine().split("\\s+")).
                map(Integer::parseInt).collect(Collectors.toList());

        compareCards(firstPlayerCards, secondPlayerCards);
    }

    private static void compareCards(List<Integer> first, List<Integer> second) {
        while (first.size() > 0 || second.size() > 0) {
            if (first.get(0).equals(second.get(0))) {
                first.remove(0);
                second.remove(0);
            } else if (first.get(0) > second.get(0)) {
                first.add(first.get(0));
                first.add(second.get(0));
                first.remove(0);
                second.remove(0);
            } else if (second.get(0) > first.get(0)) {
                second.add(second.get(0));
                second.add(first.get(0));
                second.remove(0);
                first.remove(0);
            }
            if (first.isEmpty()) {
                findSecondSum(second);
                break;
            } else if (second.isEmpty()) {
                findFirstSum(first);
                break;
            }
        }
    }

    private static void findFirstSum(List<Integer> player) {
        int sum = 0;

        for (Integer num :
                player) {
            sum += num;
        }
        System.out.printf("First player wins! Sum: %d", sum);
    }

    private static void findSecondSum(List<Integer> player) {
        int sum = 0;

        for (Integer num :
                player) {
            sum += num;
        }
        System.out.printf("Second player wins! Sum: %d", sum);
    }
}