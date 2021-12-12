package M02_ProgrammingFundamentals.L07_MapsLambdaAndStreamAPI.Exercises;

import java.util.*;

public class T07StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<Double>> studentInfo = new LinkedHashMap<>();

        int students = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= students; i++) {
            String studentName = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            studentInfo.putIfAbsent(studentName, new ArrayList<>());
            studentInfo.get(studentName).add(grade);
        }
        Map<String, Double> studentAverage = new LinkedHashMap<>();
        for (Map.Entry<String, List<Double>> entry : studentInfo.entrySet()) {
            double average = entry.getValue().stream().mapToDouble(x -> x).average().getAsDouble();
            if (average >= 4.50) {
                studentAverage.put(entry.getKey(), average);
            }
        }
        studentAverage.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Double>comparingByValue().reversed())
                .forEach(entry -> System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue()));
    }
}