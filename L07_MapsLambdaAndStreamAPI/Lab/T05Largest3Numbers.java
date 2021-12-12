package M02_ProgrammingFundamentals.L07_MapsLambdaAndStreamAPI.Lab;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T05Largest3Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt)
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .collect(Collectors.toList());

        System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
    }
}