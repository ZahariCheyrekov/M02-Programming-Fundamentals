package M02_ProgrammingFundamentals.L05_Lists.Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T03MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> firstList = Arrays.stream(scanner.nextLine()
                .split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondList = Arrays.stream(scanner.nextLine()
                .split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        int smallerList = Math.min(firstList.size(), secondList.size());

        List<Integer> resultList = new ArrayList<>();
        mergeLists(resultList, firstList, secondList, smallerList);
    }

    private static void mergeLists(List<Integer> resultList, List<Integer> first, List<Integer> second, int smaller) {
        for (int i = 0; i < smaller; i++) {
            resultList.add(first.get(i));
            resultList.add(second.get(i));
        }

        if (first.size() > second.size()) {
            addTheRestNumbers(first, smaller, resultList);
        } else if (second.size() > first.size()) {
            addTheRestNumbers(second, smaller, resultList);
        } else {
            printTheResult(resultList);
        }
    }

    private static void addTheRestNumbers(List<Integer> list, int smaller, List<Integer> resultList) {
        for (int i = smaller; i < list.size(); i++) {
            resultList.add(list.get(i));
        }
        printTheResult(resultList);
    }

    private static void printTheResult(List<Integer> resultList) {
        System.out.println(resultList.toString()
                .replaceAll("[\\[\\]]", "")
                .replaceAll(", ", " "));
    }
}