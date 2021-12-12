package M02_ProgrammingFundamentals.L06_ObjectsAndClasses.Exercises;

import java.util.Scanner;

public class T02Articles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(", ");
        Article article = new Article(input[0], input[1], input[2]);

        int numberOfArticles = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numberOfArticles; i++) {
            String[] data = scanner.nextLine().split(": ");
            String command = data[0];
            String newData = data[1];
            switch (command) {
                case "Edit":
                    article.changeContent(newData);
                    break;
                case "ChangeAuthor":
                    article.changeAuthor(newData);
                    break;
                case "Rename":
                    article.renameTitle(newData);
                    break;
            }
        }
        System.out.println(article);
    }

    static class Article {
        String title;
        String content;
        String author;

        public Article(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }

        public void changeContent(String newContent) {
            this.content = newContent;
        }

        public void changeAuthor(String newAuthor) {
            this.author = newAuthor;
        }

        public void renameTitle(String newTitle) {
            this.title = newTitle;
        }

        public String toString() {
            return title + " - " + content + ": " + author;
        }
    }
}