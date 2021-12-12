package M02_ProgrammingFundamentals.L05_Lists.MoreExercises;

import java.util.*;
import java.util.stream.Collectors;

public class T04MixedUpLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> listOne = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> listTwo = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        Collections.reverse(listTwo);

        List<Integer> biggerList = new ArrayList<>();
        if (listOne.size() > listTwo.size()) {
            biggerList = listOne;
        } else {
            biggerList = listTwo;
        }

        int startNumber = Math.max(biggerList.get(biggerList.size() - 1), biggerList.get(biggerList.size() - 2));
        int endNumber = Math.min(biggerList.get(biggerList.size() - 1), biggerList.get(biggerList.size() - 2));

        int smallerList = Math.min(listOne.size(), listTwo.size());
        List<Integer> resultList = new ArrayList<>();
        fillTheResultList(listOne, listTwo, resultList, smallerList);

        findingNumbersInRange(resultList, startNumber, endNumber);
    }

    private static void fillTheResultList(List<Integer> listOne, List<Integer> listTwo, List<Integer> resultList, int smallerList) {
        for (int i = 0; i < smallerList; i++) {
            resultList.add(listOne.get(i));
            resultList.add(listTwo.get(i));
        }
    }

    private static void findingNumbersInRange(List<Integer> resultList, int startNumber, int endNumber) {
        List<Integer> finalList = new ArrayList<>();
        for (Integer num : resultList) {
            if (num > endNumber && num < startNumber) {
                finalList.add(num);
            }
        }
        printElements(finalList);
    }

    private static void printElements(List<Integer> finalList) {
        Collections.sort(finalList);
        for (Integer num : finalList) {
            System.out.print(num + " ");
        }
    }
}