package M02_ProgrammingFundamentals.L07_MapsLambdaAndStreamAPI.Exercises;

import java.util.*;

public class T08CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> companies = new TreeMap<>();

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] data = input.split(" -> ");
            String company = data[0];
            String ID = data[1];

            if (!companies.containsKey(company)) {
                companies.put(company, new ArrayList<>());
                companies.get(company).add(ID);
            } else {
                if (!companies.get(company).contains(ID)) {
                    companies.get(company).add(ID);
                }
            }
            input = scanner.nextLine();
        }

        companies.forEach((key, value) -> {
            System.out.printf("%s%n", key);
            value.forEach(ID -> System.out.printf("-- %s%n", ID));
        });
    }
}