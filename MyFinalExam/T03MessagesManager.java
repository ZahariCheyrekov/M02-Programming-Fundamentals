package M02_ProgrammingFundamentals.MyFinalExam;

import java.util.*;

public class T03MessagesManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> sendMap = new TreeMap<>();
        Map<String, Integer> receivedMap = new TreeMap<>();

        int capacity = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        while (!input.equals("Statistics")) {
            String[] data = input.split("=");
            String command = data[0];

            switch (command) {
                case "Add":
                    String username = data[1];
                    int send = Integer.parseInt(data[2]);
                    int received = Integer.parseInt(data[3]);

                    if (!sendMap.containsKey(username) && !receivedMap.containsKey(username)) {
                        sendMap.put(username, send);
                        receivedMap.put(username, received);
                    }
                    break;
                case "Message":
                    String sender = data[1];
                    String receiver = data[2];

                    if (sendMap.containsKey(sender) && receivedMap.containsKey(receiver)) {
                        sendMap.put(sender, sendMap.get(sender) + 1);
                        receivedMap.put(receiver, receivedMap.get(receiver) + 1);

                        int totalMessagesSender = sendMap.get(sender) + receivedMap.get(sender);
                        int totalMessagesReceiver = receivedMap.get(receiver) + sendMap.get(receiver);

                        if (totalMessagesSender >= capacity) {
                            System.out.printf("%s reached the capacity!%n", sender);
                            sendMap.remove(sender);
                            receivedMap.remove(sender);
                        }

                        if (totalMessagesReceiver >= capacity) {
                            System.out.printf("%s reached the capacity!%n", receiver);
                            receivedMap.remove(receiver);
                            sendMap.remove(receiver);
                        }
                    }

                    break;
                case "Empty":
                    String emptyUsername = data[1];

                    if (emptyUsername.equals("All")) {
                        sendMap.clear();
                        receivedMap.clear();
                    } else {
                        if (sendMap.containsKey(emptyUsername) && receivedMap.containsKey(emptyUsername)) {
                            sendMap.remove(emptyUsername);
                            receivedMap.remove(emptyUsername);
                        }
                    }
                    break;
            }
            input = scanner.nextLine();
        }

        Map<String, Integer> totalMessages = new TreeMap<>();
        for (Map.Entry<String, Integer> entry : sendMap.entrySet()) {
            totalMessages.put(entry.getKey(), entry.getValue());
        }
        for (Map.Entry<String, Integer> entry : receivedMap.entrySet()) {
            totalMessages.put(entry.getKey(), totalMessages.get(entry.getKey()) + entry.getValue());
        }


        System.out.printf("Users count: %d%n", sendMap.size());

        receivedMap.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed()
                        .thenComparing(Map.Entry.comparingByKey()))
                .forEach(entry -> {
                    String name = entry.getKey();
                    int total = totalMessages.get(name);
                    System.out.printf("%s - %d%n", entry.getKey(), total);
                });
    }
}