package M02_ProgrammingFundamentals.L05_Lists.MoreExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T05DrumSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double savings = Double.parseDouble(scanner.nextLine());
        List<Integer> drumSet = Arrays.stream(scanner.nextLine().split("\\s+")).
                map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> startingNumbers = new ArrayList<>();

        startingNumbers.addAll(drumSet);

        String input = scanner.nextLine();
        while (!input.equals("Hit it again, Gabsy!")) {
            int hitPower = Integer.parseInt(input);
            for (int i = 0; i < drumSet.size(); i++) {
                drumSet.set(i, drumSet.get(i) - hitPower);
            }
            for (int i = 0; i < drumSet.size(); i++) {
                if (drumSet.get(i) <= 0) {
                    if (savings - (startingNumbers.get(i) * 3) > 0) {
                        drumSet.set(i, startingNumbers.get(i));
                        savings -= (startingNumbers.get(i) * 3);
                    } else {
                        drumSet.remove(i);
                        startingNumbers.remove(i);
                    }
                }
            }
            input = scanner.nextLine();
        }
        printResult(drumSet, savings);
    }

    private static void printResult(List<Integer> drumSet, double savings) {
        for (Integer num : drumSet) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.printf("Gabsy has %.2flv.", savings);
    }
}