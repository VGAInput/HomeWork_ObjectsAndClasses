import lesson_11.Author;
import lesson_11.Book;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Author> authors = new ArrayList<>();

        authors.add(new Author("Herman", "Melville"));
        authors.add(new Author("Leo", "Tolstoy"));

        ArrayList<Book> books = new ArrayList<>();

        books.add(new Book("Moby-Dick", 1956, authors.get(0).getName(), authors.get(0).getSurname()));
        books.add(new Book("War and Peace", 1981, authors.get(1).getName(), authors.get(1).getSurname()));

        System.out.println(books.get(0).getPublicationYear());

        books.get(0).setPublicationYear(2013);

        System.out.println(books.get(0).getPublicationYear());

    }
}