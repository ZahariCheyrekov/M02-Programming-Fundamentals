package M02_ProgrammingFundamentals.MidExams.Exam04MidExam;

import java.util.Scanner;

public class T01GuineaPig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double food = Double.parseDouble(scanner.nextLine());
        double hay = Double.parseDouble(scanner.nextLine());
        double cover = Double.parseDouble(scanner.nextLine());
        double weight = Double.parseDouble(scanner.nextLine());

        double foodGrams = food * 1000;
        double hayGrams = hay * 1000;
        double coverGrams = cover * 1000;

        for (int i = 1; i <= 30; i++) {
            foodGrams -= 300;
            if (i % 2 == 0) {
                hayGrams -= foodGrams * 0.05;
            }
            if (i % 3 == 0) {
                coverGrams -= (weight * 1000) / 3;
            }
            if (foodGrams <= 0 || hayGrams <= 0 || coverGrams <= 0) {
                System.out.println("Merry must go to the pet store!");
                return;
            }
        }
        System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.",
                foodGrams / 1000, hayGrams / 1000, coverGrams / 1000);
    }
}