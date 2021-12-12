package M02_ProgrammingFundamentals.L05_Lists.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T04ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] data = input.split("\\s+");
            String command = data[0];
            int number = Integer.parseInt(data[1]);
            switch (command) {
                case "Add":
                    numbers.add(number);
                    break;
                case "Remove":
                    numbers.remove((Object) number);
                    break;
                case "RemoveAt":
                    int indexAt = Integer.parseInt(data[1]);
                    numbers.remove(indexAt);
                    break;
                case "Insert":
                    int index = Integer.parseInt(data[2]);
                    numbers.add(index, number);
                    break;
                case "":
                    break;
            }
            input = scanner.nextLine();
        }
        printResult(numbers);
    }

    private static void printResult(List<Integer> numbers) {
        System.out.println(numbers.toString()
                .replaceAll("[\\[\\]]", "")
                .replaceAll(",", ""));
    }
}