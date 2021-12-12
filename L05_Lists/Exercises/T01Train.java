package M02_ProgrammingFundamentals.L05_Lists.Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T01Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> wagons = Arrays.stream(scanner.nextLine().split("\\s+")).
                map(Integer::parseInt).collect(Collectors.toList());
        int capacityWagon = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] tokens = input.split("\\s+");
            if (tokens.length == 1) {
                int passengers = Integer.parseInt(tokens[0]);
                addPassengers(passengers, wagons, capacityWagon);
            } else {
                int passengers = Integer.parseInt(tokens[1]);
                wagons.add(passengers);
            }
            input = scanner.nextLine();
        }
        printResult(wagons);
    }

    private static void addPassengers(int passengers, List<Integer> wagons, int capacityWagon) {
        for (int i = 0; i < wagons.size(); i++) {
            if (passengers + wagons.get(i) <= capacityWagon) {
                wagons.set(i, wagons.get(i) + passengers);
                break;
            }
        }
    }

    private static void printResult(List<Integer> wagons) {
        for (Integer number : wagons) {
            System.out.print(number + " ");
        }
    }
}