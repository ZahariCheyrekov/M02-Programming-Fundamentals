package M02_ProgrammingFundamentals.L06_ObjectsAndClasses.Exercises;

import java.util.*;

public class T01AdvertisementMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfMessages = Integer.parseInt(scanner.nextLine());

        List<String> phrase = new ArrayList<>(List.of("Excellent product.", "Such a great product.", "I always use that product.",
                "Best product of its category.", "Exceptional product.",
                "I can’t live without this product."));

        List<String> event = new ArrayList<>(List.of("Now I feel good.", "I have succeeded with this product.",
                "Makes miracles. I am happy of the results!", "I cannot believe but now I feel awesome.", "" +
                        "Try it yourself, I am very satisfied.", "I feel great!"));

        List<String> author = new ArrayList<>(List.of("Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"));

        List<String> city = new ArrayList<>(List.of("Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"));

        Random rnd = new Random();
        for (int i = 1; i <= numberOfMessages; i++) {
            String phraseRnd = phrase.remove(rnd.nextInt(phrase.size()));
            String eventRnd = event.remove(rnd.nextInt(event.size()));
            String authorRnd = author.remove(rnd.nextInt(author.size()));
            String cityRnd = city.remove(rnd.nextInt(city.size()));
            System.out.printf("%s %s %s - %s%n", phraseRnd, eventRnd, authorRnd, cityRnd);
        }
    }
}