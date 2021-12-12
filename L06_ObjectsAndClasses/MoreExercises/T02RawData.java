package M02_ProgrammingFundamentals.L06_ObjectsAndClasses.MoreExercises;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class T02RawData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        LinkedHashSet<Car> carList = new LinkedHashSet<>();

        while (n-- > 0) {
            String[] input = scanner.nextLine().split("\\s+");
            String model = input[0];
            int speed = Integer.parseInt(input[1]);
            int power = Integer.parseInt(input[2]);
            int cargoWeight = Integer.parseInt(input[3]);
            String cargoType = input[4];
            double tire1p = Double.parseDouble(input[5]);
            int tire1a = Integer.parseInt(input[6]);
            double tire2p = Double.parseDouble(input[7]);
            int tire2a = Integer.parseInt(input[8]);
            double tire3p = Double.parseDouble(input[9]);
            int tire3a = Integer.parseInt(input[10]);
            double tire4p = Double.parseDouble(input[11]);
            int tire4a = Integer.parseInt(input[12]);
            Engine engine = new Engine(speed, power);
            Cargo cargo = new Cargo(cargoWeight, cargoType);
            Tire tire1 = new Tire(tire1p, tire1a);
            Tire tire2 = new Tire(tire2p, tire2a);
            Tire tire3 = new Tire(tire3p, tire3a);
            Tire tire4 = new Tire(tire4p, tire4a);
            Car car = new Car(model, engine, cargo, tire1, tire2, tire3, tire4);
            carList.add(car);
        }
        String command = scanner.nextLine();
        ArrayList<String> output = new ArrayList<>();
        if (command.equals("fragile")) {
            carList.forEach(e -> {
                if (e.getCargo().getType().equals("fragile")) {
                    for (Tire tireSet : e.getTires()) {
                        if (tireSet.getPressure() < 1) {
                            output.add(e.getModel());
                            break;
                        }
                    }
                }
            });
        } else {
            carList.forEach(e -> {
                if (e.getCargo().getType().equals("flamable") && e.getEngine().getPower() > 250) {
                    output.add(e.getModel());
                }
            });
        }
        output.forEach(System.out::println);
    }

    public static class Car {
        String model;
        Engine engine;
        Cargo cargo;
        Tire tire1;
        Tire tire2;
        Tire tire3;
        Tire tire4;

        public Car(String model, Engine engine, Cargo cargo, Tire tire1, Tire tire2, Tire tire3, Tire tire4) {
            this.model = model;
            this.engine = engine;
            this.cargo = cargo;
            this.tire1 = tire1;
            this.tire2 = tire2;
            this.tire3 = tire3;
            this.tire4 = tire4;
        }

        public Cargo getCargo() {
            return cargo;
        }

        public Tire[] getTires() {
            return new Tire[]{tire1, tire2, tire3, tire4};
        }

        public String getModel() {
            return model;
        }

        public Engine getEngine() {
            return engine;
        }
    }

    public static class Engine {
        int speed;
        int power;

        public Engine(int speed, int power) {
            this.speed = speed;
            this.power = power;
        }

        public int getPower() {
            return power;
        }
    }

    public static class Cargo {
        int weight;
        String type;

        public Cargo(int weight, String type) {
            this.weight = weight;
            this.type = type;
        }

        public String getType() {
            return type;
        }
    }

    public static class Tire {
        double pressure;
        int age;

        public Tire(double pressure, int age) {
            this.pressure = pressure;
            this.age = age;
        }

        public double getPressure() {
            return pressure;
        }
    }
}