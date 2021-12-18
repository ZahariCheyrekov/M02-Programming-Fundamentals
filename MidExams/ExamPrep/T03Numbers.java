package M02_ProgrammingFundamentals.MidExams.ExamPrep;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T03Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt)
                .sorted().collect(Collectors.toList());

        double sumAll = 0;
        for (Integer num : numbers) {
            sumAll += num;
        }
        double average = sumAll / numbers.size();
        int count = 0;
        for (int i = numbers.size() - 1; i >= 0; i--) {
            if (numbers.get(i) > average) {
                System.out.print(numbers.get(i) + " ");
                count++;
                if (count == 5) {
                    break;
                }
            }
        }
        if (count == 0) {
            System.out.println("No");
        }
    }
}