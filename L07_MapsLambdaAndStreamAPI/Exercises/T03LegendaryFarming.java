package M02_ProgrammingFundamentals.L07_MapsLambdaAndStreamAPI.Exercises;

import java.util.*;

public class T03LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> legendarily = new TreeMap<>();
        legendarily.put("shards", 0);
        legendarily.put("fragments", 0);
        legendarily.put("motes", 0);

        Map<String, Integer> junkItems = new TreeMap<>();
        boolean isObtained = false;
        while (!isObtained) {
            String[] data = scanner.nextLine().split("\\s+");
            for (int i = 0; i < data.length; i += 2) {
                int quantity = Integer.parseInt(data[i]);
                String material = data[i + 1].toLowerCase();

                if (material.equals("shards") || material.equals("fragments") || material.equals("motes")) {
                    legendarily.put(material, legendarily.get(material) + quantity);

                    if (legendarily.get(material) >= 250) {
                        legendarily.put(material, legendarily.get(material) - 250);
                        switch (material) {
                            case "shards":
                                System.out.println("Shadowmourne obtained!");
                                break;
                            case "fragments":
                                System.out.println("Valanyr obtained!");
                                break;
                            case "motes":
                                System.out.println("Dragonwrath obtained!");
                                break;
                        }
                        isObtained = true;
                        break;
                    }
                } else {
                    junkItems.putIfAbsent(material, 0);
                    junkItems.put(material, junkItems.get(material) + quantity);
                }
            }
        }
        legendarily.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(entry -> System.out.printf("%s: %d%n", entry.getKey(), entry.getValue()));

        junkItems.forEach((k, v) -> System.out.printf("%s: %d%n", k, v));
    }
}