package M02_ProgrammingFundamentals.L05_Lists.Exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T08AnonymousThreat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> lineNames = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!"3:1".equals(command)) {
            String[] splitTheCommand = command.split("\\s+");

            switch (splitTheCommand[0]) {
                case "merge":
                    int startIndex = Integer.parseInt(splitTheCommand[1]);
                    int endIndex = Integer.parseInt(splitTheCommand[2]);

                    if (startIndex < 0) {
                        startIndex = 0;
                    }
                    if (endIndex > lineNames.size() - 1) {
                        endIndex = lineNames.size() - 1;
                    }
                    int counter = startIndex;

                    for (int i = startIndex; i < endIndex; i++) {
                        String concat = lineNames.get(counter) + lineNames.get(counter + 1);
                        lineNames.set(counter, concat);
                        lineNames.remove(counter + 1);
                    }
                    break;
                case "divide":
                    int index = Integer.parseInt(splitTheCommand[1]);
                    int partitions = Integer.parseInt(splitTheCommand[2]);

                    if (index >= 0 && index < lineNames.size() && partitions >= 0 && partitions <= 100) {
                        String element = lineNames.get(index);
                        List<String> newList = new ArrayList<>();

                        if (element.length() % partitions == 0) {
                            int portionLength = element.length() / partitions;
                            int count = 0;
                            for (int i = 0; i < partitions; i++) {
                                StringBuilder concat = new StringBuilder();
                                for (int j = 0; j < portionLength; j++) {
                                    char symbol = element.charAt(count);
                                    concat.append(symbol);
                                    count++;
                                }
                                newList.add(concat.toString());
                            }
                        } else {
                            int portionLength = element.length() / partitions;
                            int count = 0;
                            for (int i = 0; i < partitions; i++) {
                                StringBuilder concat = new StringBuilder();

                                if (i == partitions - 1) {
                                    for (int j = count; j < element.length(); j++) {
                                        char symbol = element.charAt(count);
                                        concat.append(symbol);
                                        count++;
                                    }
                                } else {
                                    for (int j = 0; j < portionLength; j++) {
                                        char symbol = element.charAt(count);
                                        concat.append(symbol);
                                        count++;
                                    }
                                }
                                newList.add(concat.toString());
                            }
                        }
                        lineNames.remove(index);
                        lineNames.addAll(index, newList);
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        for (String item : lineNames) {
            System.out.print(item + " ");
        }
    }
}