package M02_ProgrammingFundamentals.MyMidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T03DeckOFCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> cards = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        int numberCommand = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberCommand; i++) {
            String[] tokens = scanner.nextLine().split(", ");
            String command = tokens[0];
            switch (command) {
                case "Add":
                    String addCardName = tokens[1];
                    if (cards.contains(addCardName)) {
                        System.out.println("Card is already in the deck");
                    } else {
                        System.out.println("Card successfully added");
                        cards.add(addCardName);
                    }
                    break;
                case "Remove":
                    String removeCard = tokens[1];
                    if (cards.contains(removeCard)) {
                        System.out.println("Card successfully removed");
                        cards.remove(removeCard);
                    } else {
                        System.out.println("Card not found");
                    }
                    break;
                case "Remove At":
                    int removeIndex = Integer.parseInt(tokens[1]);
                    if (removeIndex >= 0 && removeIndex < cards.size()) {
                        System.out.println("Card successfully removed");
                        cards.remove(removeIndex);
                    } else {
                        System.out.println("Index out of range");
                    }
                    break;
                case "Insert":
                    int insertIndex = Integer.parseInt(tokens[1]);
                    String insertCard = tokens[2];
                    if (insertIndex >= 0 && insertIndex < cards.size() && cards.contains(insertCard)) {
                        System.out.println("Card is already added");
                    } else if (insertIndex >= 0 && insertIndex < cards.size() && !cards.contains(insertCard)) {
                        System.out.println("Card successfully added");
                        cards.add(insertIndex, insertCard);
                    } else {
                        System.out.println("Index out of range");
                    }
                    break;
            }
        }
        System.out.println(String.join(", ", cards));
    }
}