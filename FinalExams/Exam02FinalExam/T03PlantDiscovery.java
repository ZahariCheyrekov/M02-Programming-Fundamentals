package M02_ProgrammingFundamentals.FinalExams.Exam02FinalExam;

import java.util.*;

public class T03PlantDiscovery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> plantsRarity = new HashMap<>();
        Map<String, List<Double>> plantsRating = new HashMap<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] plantInformation = scanner.nextLine().split("<->");
            String plant = plantInformation[0];
            int rarity = Integer.parseInt(plantInformation[1]);
            plantsRarity.put(plant, rarity);
            plantsRating.putIfAbsent(plant, new ArrayList<>());
        }

        String input = scanner.nextLine();
        while (!input.equals("Exhibition")) {
            String[] data = input.split(": ");
            String command = data[0];
            String[] information = data[1].split(" - ");
            String plant = information[0];

            if (!plantsRarity.containsKey(plant)) {
                System.out.println("error");
                input = scanner.nextLine();
                continue;
            }

            switch (command) {
                case "Rate":
                    double rating = Double.parseDouble(information[1]);
                    plantsRating.get(plant).add(rating);
                    break;
                case "Update":
                    int newRarity = Integer.parseInt(information[1]);
                    plantsRarity.put(plant, newRarity);
                    break;
                case "Reset":
                    plantsRating.get(plant).clear();
                    break;
                default:
                    System.out.println("error");
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.println("Plants for the exhibition:");
        plantsRarity.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue()
                        .thenComparingDouble(x -> plantsRating.get(x.getKey()).stream()
                                .mapToDouble(Double::doubleValue)
                                .average().orElse(0.0))
                        .reversed())
                .forEach(e -> System.out.printf("- %s; Rarity: %d; Rating: %.2f%n", e.getKey(), e.getValue(),
                        plantsRating.get(e.getKey()).stream().mapToDouble(Double::doubleValue).average().orElse(0.0)));
    }
}