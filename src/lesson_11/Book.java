package lesson_11;

public class Book {

    private String bookName;
    private Author author;
    private int publicationYear;

    public Book(String bookName, int publicationYear, String authorName,String authorSurname) {
        this.bookName = bookName;
        this.publicationYear = publicationYear;
        this.author = new Author(authorName,authorSurname);
    }
    public String getBookName() {
        return this.bookName;
    }

    public int getPublicationYear() {
        return this.publicationYear;
    }
    public Author getBookAuthor() {
        return this.author;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }


}
