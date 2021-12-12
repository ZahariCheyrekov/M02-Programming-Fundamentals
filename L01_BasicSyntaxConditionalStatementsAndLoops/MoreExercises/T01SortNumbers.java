package M02_ProgrammingFundamentals.L01_BasicSyntaxConditionalStatementsAndLoops.MoreExercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class T01SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        numbers.add(Integer.parseInt(scanner.nextLine()));
        numbers.add(Integer.parseInt(scanner.nextLine()));
        numbers.add(Integer.parseInt(scanner.nextLine()));

        Collections.sort(numbers);
        Collections.reverse(numbers);
        for (Integer num : numbers) {
            System.out.println(num);
        }
    }
}