package M02_ProgrammingFundamentals.L07_MapsLambdaAndStreamAPI.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class T04WordFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = Arrays.stream(scanner.nextLine().split("\\s+"))
                .filter(word -> word.length() % 2 == 0)
                .toArray(String[]::new);

        Arrays.stream(words).forEach(System.out::println);
    }
}