package M02_ProgrammingFundamentals.FinalExams.Exam05FinalExam;

import java.util.*;

public class T03Pirates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<Integer>> cities = new TreeMap<>();

        String input = scanner.nextLine();
        while (!input.equals("Sail")) {
            String[] data = input.split("\\|+");
            String cityName = data[0];
            int population = Integer.parseInt(data[1]);
            int gold = Integer.parseInt(data[2]);

            if (!cities.containsKey(cityName)) {
                cities.put(cityName, new ArrayList<>());
                cities.get(cityName).add(0, population);
                cities.get(cityName).add(1, gold);
            } else {
                cities.get(cityName).set(0, cities.get(cityName).get(0) + population);
                cities.get(cityName).set(1, cities.get(cityName).get(1) + gold);
            }
            input = scanner.nextLine();
        }

        input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] data = input.split("=>");
            String command = data[0];
            String city = data[1];

            switch (command) {
                case "Plunder":
                    int people = Integer.parseInt(data[2]);
                    int gold = Integer.parseInt(data[3]);

                    int currentPeople = cities.get(city).get(0);
                    int currentGold = cities.get(city).get(1);

                    System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n",
                            city, gold, people);


                    currentPeople -= people;
                    currentGold -= gold;

                    if (currentGold <= 0 || currentPeople <= 0) {
                        cities.remove(city);
                        System.out.printf("%s has been wiped off the map!%n", city);
                    } else {
                        cities.get(city).set(0, currentPeople);
                        cities.get(city).set(1, currentGold);
                    }
                    break;
                case "Prosper":
                    int prosperGold = Integer.parseInt(data[2]);
                    int currentGoldCity = cities.get(city).get(1);

                    if (prosperGold < 0) {
                        System.out.println("Gold added cannot be a negative number!");
                    } else {
                        cities.get(city).set(1, currentGoldCity + prosperGold);
                        System.out.printf("%d gold added to the city treasury. %s now has %d gold.%n",
                                prosperGold, city, currentGoldCity + prosperGold);
                    }
                    break;
            }
            input = scanner.nextLine();
        }

        if (!cities.isEmpty()) {
            System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:%n", cities.size());

            cities.entrySet()
                    .stream()
                    .sorted((g1, g2) -> g2.getValue().get(1).compareTo(g1.getValue().get(1)))
                    .forEach(entry -> System.out.printf("%s -> Population: %d citizens, Gold: %d kg%n",
                            entry.getKey(), entry.getValue().get(0), entry.getValue().get(1)));
        } else {
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        }
    }
}