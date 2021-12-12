package M02_ProgrammingFundamentals.L05_Lists.Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T10SoftUniCoursePlanning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> schedule = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("course start")) {
            String[] tokens = input.split(":");
            String command = tokens[0];
            String lessonTitle = tokens[1];
            switch (command) {
                case "Add":
                    putIfAbsent(schedule, lessonTitle);
                    break;
                case "Insert":
                    int index = Integer.parseInt(tokens[2]);
                    insertLessonAtIndex(schedule, lessonTitle, index);
                    break;
                case "Remove":
                    removeLesson(schedule, lessonTitle);
                    break;
                case "Swap":
                    swapLessons(schedule, lessonTitle, tokens);
                    break;
                case "Exercise":
                    addExercise(schedule, lessonTitle);
                    break;
            }
            input = scanner.nextLine();
        }
        printResult(schedule);
    }

    private static void putIfAbsent(List<String> schedule, String lessonTitle) {
        if (!schedule.contains(lessonTitle)) {
            schedule.add(lessonTitle);
        }
    }

    private static void insertLessonAtIndex(List<String> schedule, String lessonTitle, int index) {
        if (!schedule.contains(lessonTitle)) {
            if (index >= 0 && index < schedule.size()) {
                schedule.add(index, lessonTitle);
            }
        }
    }

    private static void removeLesson(List<String> schedule, String lessonTitle) {
        schedule.remove((Object) lessonTitle);
        schedule.remove(lessonTitle + "Exercise");
    }

    private static void swapLessons(List<String> schedule, String lessonTitle, String[] tokens) {
        String secondLesson = tokens[2];
        if (schedule.contains(lessonTitle) && schedule.contains(secondLesson)) {
            int indexFirstLesson = schedule.indexOf(tokens[1]);
            int indexSecondLesson = schedule.indexOf(tokens[2]);

            schedule.add(indexSecondLesson, lessonTitle);
            schedule.remove(secondLesson);
            schedule.remove(indexFirstLesson);
            schedule.add(indexFirstLesson, secondLesson);

            if (schedule.contains(lessonTitle + "-Exercise")) {
                if (indexSecondLesson == schedule.size() - 1) {
                    schedule.add(lessonTitle + "-Exercise");
                } else {
                    schedule.add(indexSecondLesson + 1, lessonTitle + "-Exercise");
                }
                schedule.remove(indexFirstLesson + 2);

            } else if (schedule.contains(secondLesson + "-Exercise")) {
                if (indexFirstLesson == schedule.size() - 1) {
                    schedule.add(secondLesson + "-Exercise");
                } else {
                    schedule.add(indexFirstLesson + 1, secondLesson + "-Exercise");
                }
                schedule.remove(indexSecondLesson + 2);
            }
        }
    }

    private static void addExercise(List<String> schedule, String lessonTitle) {
        String lessonAndExercise = lessonTitle + "-Exercise";
        if (schedule.contains(lessonTitle) && !schedule.contains(lessonAndExercise)) {
            schedule.add(schedule.indexOf(lessonTitle) + 1, lessonAndExercise);
        } else if (!schedule.contains(lessonAndExercise)) {
            schedule.add(lessonTitle);
            schedule.add(lessonAndExercise);
        }
    }

    private static void printResult(List<String> schedule) {
        for (int i = 0; i < schedule.size(); i++) {
            System.out.printf("%d.%s%n", (i + 1), schedule.get(i));
        }
    }
}