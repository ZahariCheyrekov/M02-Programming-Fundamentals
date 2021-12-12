package M02_ProgrammingFundamentals.L05_Lists.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T05ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).
                map(Integer::parseInt).collect(Collectors.toList());


        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] data = input.split("\\s+");
            String command = data[0];
            switch (command) {
                case "Contains":
                    int num = Integer.parseInt(data[1]);
                    checkIfContains(numbers, num);
                    break;
                case "Print":
                    String evenOrOdd = data[1];
                    switch (evenOrOdd) {
                        case "even":
                            printEvenNumbers(numbers);
                            break;
                        case "odd":
                            printOddNumbers(numbers);
                            break;
                    }
                    break;
                case "Get":
                    printSum(numbers);
                    break;
                case "Filter":
                    String condition = data[1];
                    int number = Integer.parseInt(data[2]);
                    fulfillCondition(condition, numbers, number);
                    break;
            }
            input = scanner.nextLine();
        }
    }

    private static void checkIfContains(List<Integer> numbers, int number) {
        if (numbers.contains(number)) {
            System.out.println("Yes");
        } else {
            System.out.println("No such number");
        }
    }

    private static void printEvenNumbers(List<Integer> numbers) {
        for (Integer num : numbers) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    private static void printOddNumbers(List<Integer> numbers) {
        for (Integer num : numbers) {
            if (num % 2 == 1) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    private static void printSum(List<Integer> numbers) {
        int sum = 0;
        for (Integer num : numbers) {
            sum += num;
        }
        System.out.println(sum);
    }

    private static void fulfillCondition(String condition, List<Integer> numbers, int number) {
        switch (condition) {
            case "<":
                printLowerNumbers(numbers, number);
                break;
            case ">":
                printHigherNumbers(numbers, number);
                break;
            case ">=":
                printHigherAndEqual(numbers, number);
                break;
            case "<=":
                printLowerAndEqual(numbers, number);
                break;
        }
    }

    private static void printLowerNumbers(List<Integer> numbers, int number) {
        for (Integer num : numbers) {
            if (num < number) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    private static void printHigherNumbers(List<Integer> numbers, int number) {
        for (Integer num : numbers) {
            if (num > number) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    private static void printHigherAndEqual(List<Integer> numbers, int number) {
        for (Integer num : numbers) {
            if (num >= number) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    private static void printLowerAndEqual(List<Integer> numbers, int number) {
        for (Integer num : numbers) {
            if (num <= number) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }
}