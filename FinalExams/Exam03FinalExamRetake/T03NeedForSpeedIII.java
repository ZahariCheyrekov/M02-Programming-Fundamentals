package M02_ProgrammingFundamentals.FinalExams.Exam03FinalExamRetake;

import java.util.*;

public class T03NeedForSpeedIII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<Integer>> cars = new TreeMap<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split("\\|+");
            String car = data[0];
            int mileage = Integer.parseInt(data[1]);
            int fuel = Integer.parseInt(data[2]);

            cars.putIfAbsent(car, new ArrayList<>());
            cars.get(car).add(0, mileage);
            cars.get(car).add(1, fuel);
        }

        String input = scanner.nextLine();
        while (!input.equals("Stop")) {
            String[] data = input.split(" : ");
            String command = data[0];
            String car = data[1];

            switch (command) {
                case "Drive":
                    int distance = Integer.parseInt(data[2]);
                    int fuel = Integer.parseInt(data[3]);

                    if (cars.get(car).get(1) >= fuel) {
                        cars.get(car).set(0, cars.get(car).get(0) + distance);
                        cars.get(car).set(1, cars.get(car).get(1) - fuel);
                        System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n",
                                car, distance, fuel);

                        if (cars.get(car).get(0) >= 100_000) {
                            System.out.printf("Time to sell the %s!%n", car);
                            cars.remove(car);
                        }
                    } else {
                        System.out.println("Not enough fuel to make that ride");
                    }
                    break;
                case "Refuel":
                    int refuel = Integer.parseInt(data[2]);
                    int currentFuel = cars.get(car).get(1) + refuel;

                    if (currentFuel > 75) {
                        refuel = (currentFuel - 75) - refuel;
                        currentFuel = 75;
                    }
                    cars.get(car).set(1, currentFuel);
                    System.out.printf("%s refueled with %d liters%n", car, Math.abs(refuel));
                    break;
                case "Revert":
                    int kilometers = Integer.parseInt(data[2]);
                    int currentKM = cars.get(car).get(0);
                    int setKilometers = currentKM - kilometers;

                    if (setKilometers < 10_000) {
                        setKilometers = 10_000;
                    } else {
                        System.out.printf("%s mileage decreased by %d kilometers%n", car, kilometers);
                    }
                    cars.get(car).set(0, setKilometers);
                    break;
            }
            input = scanner.nextLine();
        }

        cars.entrySet()
                .stream()
                .sorted((m1, m2) -> m2.getValue().get(0).compareTo(m1.getValue().get(0)))
                .forEach(entry -> System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n",
                        entry.getKey(), entry.getValue().get(0), entry.getValue().get(1)));
    }
}