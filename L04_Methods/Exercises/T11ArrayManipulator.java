package M02_ProgrammingFundamentals.L04_Methods.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class T11ArrayManipulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //reading an array from the console
        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        String arrayCommands = scanner.nextLine(); //reading commands for manipulating the array
        while (!arrayCommands.equals("end")) {
            String[] arrayContains = arrayCommands.split(" ");
            String first = arrayContains[0]; //first index of the array(command)

            if (first.equals("exchange")) {
                int index = Integer.parseInt(arrayContains[1]);
                if (index < 0 || index >= numbers.length) {
                    System.out.println("Invalid index");
                } else {
                    exchange(numbers, index);
                }
            } else if (first.equals("max")) {
                String evenOrOdd = arrayContains[1];
                if (evenOrOdd.equals("even")) {
                    findMaxIndexEven(numbers); // finding the highest even number index
                }
                if (evenOrOdd.equals("odd")) {
                    findMaxIndexOdd(numbers); // finding the highest odd number index
                }

            } else if (first.equals("min")) {
                String evenOrOdd = arrayContains[1];
                if (evenOrOdd.equals("even")) {
                    findMinIndexEven(numbers); // finding the lowest even number index
                }
                if (evenOrOdd.equals("odd")) {
                    findMinIndexOdd(numbers); // finding the lowest odd number index
                }

            } else if (first.equals("first")) {
                int count = Integer.parseInt(arrayContains[1]);
                if (count > numbers.length) {
                    System.out.println("Invalid count");
                } else {
                    String evenOrOdd = arrayContains[2];
                    if (evenOrOdd.equals("even")) {
                        findFirstEvenNumbers(count, numbers); // finding the first even numbers
                    }
                    if (evenOrOdd.equals("odd")) {
                        findFirstOddNumbers(count, numbers); // finding the first odd numbers
                    }
                }

            } else if (first.equals("last")) {
                int count = Integer.parseInt(arrayContains[1]);
                if (count > numbers.length) {
                    System.out.println("Invalid count");
                } else {
                    String evenOrOdd = arrayContains[2];
                    if (evenOrOdd.equals("even")) {
                        lastEvenNumbers(count, numbers); // finding the last even numbers
                    }
                    if (evenOrOdd.equals("odd")) {
                        lastOddNumbers(count, numbers); // finding the last odd numbers
                    }
                }
            }
            arrayCommands = scanner.nextLine();
        }
        System.out.print("[");
        for (int i = 0; i < numbers.length; i++) {
            if (i == 0) {
                System.out.print(numbers[i]);
            } else {
                System.out.print(", " + numbers[i]);
            }
        }
        System.out.print("]");
    }

    private static void exchange(int[] numbers, int index) {
        int[] temp = copyArray(numbers);
        int count = 0;
        for (int i = index + 1; i < temp.length; i++) {
            numbers[count] = temp[i];
            count++;
        }
        for (int i = 0; i <= index; i++) {
            numbers[count] = temp[i];
            count++;
        }
    }

    private static int[] copyArray(int[] numbers) {
        int[] newArray = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            newArray[i] = numbers[i];
        }
        return newArray;
    }

    private static void findMaxIndexEven(int[] numbers) {
        int max = Integer.MIN_VALUE;
        int index = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0 && max <= numbers[i]) {
                max = numbers[i];
                index = i;
            }
        }
        if (index == -1) {
            System.out.println("No matches");
        } else {
            System.out.println(index);
        }
    }

    private static void findMaxIndexOdd(int[] numbers) {
        int max = Integer.MIN_VALUE;
        int index = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0 && max <= numbers[i]) {
                max = numbers[i];
                index = i;
            }
        }
        if (index == -1) {
            System.out.println("No matches");
        } else {
            System.out.println(index);
        }
    }

    private static void findMinIndexEven(int[] numbers) {
        int min = Integer.MAX_VALUE;
        int index = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0 && min >= numbers[i]) {
                min = numbers[i];
                index = i;
            }
        }
        if (index == -1) {
            System.out.println("No matches");
        } else {
            System.out.println(index);
        }
    }

    private static void findMinIndexOdd(int[] numbers) {
        int min = Integer.MAX_VALUE;
        int index = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0 && min >= numbers[i]) {
                min = numbers[i];
                index = i;
            }
        }
        if (index == -1) {
            System.out.println("No matches");
        } else {
            System.out.println(index);
        }
    }

    private static void findFirstEvenNumbers(int number, int[] numbers) {
        int[] result = new int[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                result = expandAndAddToArray(result, numbers[i]);
                if (result.length == number) {
                    break;
                }
            }
        }
        printArray(result);
    }

    private static void findFirstOddNumbers(int number, int[] numbers) {
        int[] result = new int[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                result = expandAndAddToArray(result, numbers[i]);
                if (result.length == number) {
                    break;
                }
            }
        }
        printArray(result);
    }

    private static void printArray(int[] numbers) {
        System.out.print("[");
        for (int i = 0; i < numbers.length; i++) {
            if (i == 0) {
                System.out.print(numbers[i]);
            } else {
                System.out.print(", " + numbers[i]);
            }
        }
        System.out.println("]");
    }

    private static void lastEvenNumbers(int number, int[] numbers) {
        int[] result = new int[0];
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (numbers[i] % 2 == 0) {
                result = expandAndAddToArray(result, numbers[i]);
                if (result.length == number) {
                    break;
                }
            }
        }
        reversedArray(result);
        printArray(result);
    }

    private static void lastOddNumbers(int number, int[] numbers) {
        int[] result = new int[0];
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (numbers[i] % 2 != 0) {
                result = expandAndAddToArray(result, numbers[i]);
                if (result.length == number) {
                    break;
                }
            }
        }
        reversedArray(result);
        printArray(result);
    }

    private static void reversedArray(int[] numbers) {
        int[] temp = copyArray(numbers);
        for (int i = numbers.length - 1; i >= 0; i--) {
            numbers[i] = temp[numbers.length - 1 - i];
        }
    }

    private static int[] expandAndAddToArray(int[] oldArray, int element) {
        int[] newArray = new int[oldArray.length + 1];
        for (int i = 0; i < oldArray.length; i++) {
            newArray[i] = oldArray[i];
        }
        newArray[newArray.length - 1] = element;
        return newArray;
    }
}