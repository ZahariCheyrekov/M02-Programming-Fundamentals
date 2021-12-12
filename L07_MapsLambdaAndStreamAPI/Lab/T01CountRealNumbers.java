package M02_ProgrammingFundamentals.L07_MapsLambdaAndStreamAPI.Lab;

import java.util.*;

public class T01CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = Arrays.stream(scanner.nextLine().split("\\s+")).mapToDouble(Double::parseDouble).toArray();

        Map<Double, Integer> counts = new TreeMap<>();

        for (double currentNumber : numbers) {
            counts.putIfAbsent(currentNumber, 0);
            counts.put(currentNumber, counts.get(currentNumber) + 1);
        }
        counts.forEach((k, v) -> System.out.printf("%.0f -> %d%n", k, v));
    }
}