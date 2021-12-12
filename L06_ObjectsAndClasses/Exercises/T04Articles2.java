package M02_ProgrammingFundamentals.L06_ObjectsAndClasses.Exercises;

import java.util.*;

public class T04Articles2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfLines = Integer.parseInt(scanner.nextLine());

        List<Article> articles = new ArrayList<>();
        for (int i = 0; i < numberOfLines; i++) {
            String[] data = scanner.nextLine().split(",\\s+");
            String title = data[0];
            String content = data[1];
            String author = data[2];

            Article article = new Article(title, content, author);
            articles.add(article);
        }
        String criteria = scanner.nextLine();
        switch (criteria) {
            case "title":
                articles.sort(Comparator.comparing(Article::getTitle));
                break;
            case "content":
                articles.sort(Comparator.comparing(Article::getContent));
                break;
            case "author":
                articles.sort(Comparator.comparing(Article::getAuthor));
                break;
        }
        articles.forEach(System.out::println);
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

        public String getTitle() {
            return title;
        }

        public String getContent() {
            return content;
        }

        public String getAuthor() {
            return author;
        }

        public String toString() {
            return String.format("%s - %s: %s", this.title, this.content, this.author);
        }
    }
}