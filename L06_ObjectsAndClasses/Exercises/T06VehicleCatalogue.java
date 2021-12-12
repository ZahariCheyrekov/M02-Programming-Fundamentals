package M02_ProgrammingFundamentals.L06_ObjectsAndClasses.Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T06VehicleCatalogue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Vehicle> vehicles = new ArrayList<>();
        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] data = input.split("\\s+");
            String type = data[0];
            String model = data[1];
            String color = data[2];
            int horsepower = Integer.parseInt(data[3]);

            Vehicle vehicle = new Vehicle(type, model, color, horsepower);

            vehicle.setType(type);
            vehicle.setModel(model);
            vehicle.setColor(color);
            vehicle.setHorsepower(horsepower);
            vehicles.add(vehicle);

            input = scanner.nextLine();
        }

        String model = scanner.nextLine();
        while (!model.equals("Close the Catalogue")) {
            String finalModel = model;
            vehicles
                    .stream()
                    .filter(v -> v.getModel().equals(finalModel))
                    .forEach(System.out::println);

            model = scanner.nextLine();
        }

        System.out.printf("Cars have average horsepower of: %.2f.%n", average(vehicles.stream()
                .filter(v -> v.getType().equals("car"))
                .collect(Collectors.toList())));

        System.out.printf("Trucks have average horsepower of: %.2f.%n", average(vehicles.stream()
                .filter(v -> v.getType().equals("truck"))
                .collect(Collectors.toList())));
    }

    private static double average(List<Vehicle> vehicles) {
        if (vehicles.size() == 0) {
            return 0.0;
        }
        double sum = 0;

        for (Vehicle vehicle : vehicles) {
            sum += vehicle.getHorsepower();
        }
        return sum / vehicles.size();
    }

    static class Vehicle {
        String type;
        String model;
        String color;
        int horsepower;

        public Vehicle(String type, String model, String color, int horsepower) {
            this.type = type;
            this.model = model;
            this.color = color;
            this.horsepower = horsepower;
        }

        public String getType() {
            return type;
        }

        public String getModel() {
            return model;
        }

        public int getHorsepower() {
            return horsepower;
        }

        public void setType(String type) {
            this.type = type;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public void setHorsepower(int horsepower) {
            this.horsepower = horsepower;
        }

        public String toString() {
            return String.format("Type: %s%n" +
                            "Model: %s%n" +
                            "Color: %s%n" +
                            "Horsepower: %d", this.type.toUpperCase().charAt(0) + this.getType().substring(1),
                    this.model, this.color, this.horsepower);
        }
    }
}