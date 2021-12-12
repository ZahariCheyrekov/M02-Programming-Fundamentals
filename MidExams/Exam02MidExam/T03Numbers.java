package M02_ProgrammingFundamentals.MidExams.Exam02MidExam;

import java.util.*;
import java.util.stream.Collectors;

public class T03Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt)
                .sorted().collect(Collectors.toList());
        Collections.reverse(numbers);

        int sum = 0;
        for (Integer num : numbers) {
            sum += num;
        }
        int average = sum / numbers.size();
        int counter = 0;
        for (Integer num : numbers) {
            if (num > average) {
                counter++;
                System.out.print(num + " ");
                if (counter == 5) {
                    break;
                }
            }
        }
        if (counter == 0) {
            System.out.println("No");
        }
    }
}