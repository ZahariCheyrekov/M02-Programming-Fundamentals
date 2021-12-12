package M02_ProgrammingFundamentals.L07_MapsLambdaAndStreamAPI.Exercises;

import java.util.*;

public class T06Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> courses = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] data = input.split(" : ");
            String course = data[0];
            String user = data[1];

            courses.putIfAbsent(course, new ArrayList<>());
            courses.get(course).add(user);
            input = scanner.nextLine();
        }
        courses.entrySet()
                .stream()
                .sorted((a, b) -> Integer.compare(b.getValue().size(), a.getValue().size()))
                .forEach(entry -> {
                    System.out.printf("%s: %d%n", entry.getKey(), entry.getValue().size());
                    entry.getValue()
                            .stream()
                            .sorted()
                            .forEach(name -> System.out.printf("-- %s%n", name));
                });
    }
}