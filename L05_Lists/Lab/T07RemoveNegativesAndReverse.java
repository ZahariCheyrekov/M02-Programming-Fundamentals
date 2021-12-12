package M02_ProgrammingFundamentals.L05_Lists.Lab;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T07RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).
                map(Integer::parseInt).collect(Collectors.toList());

        numbers.removeIf(n -> n < 0);  // how to find if numbers in the list are negative

        if (numbers.isEmpty()) {
            System.out.println("empty");
        } else {
            Collections.reverse(numbers);
            System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
        }
    }
}