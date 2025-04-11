import java.util.Objects;

public class Book {
    private String bookTitle;
    private Author author;
    private int publicationYear;
    public Book(String bookTitle, Author author, int publicationYear) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getBookTitle() {
        return this.bookTitle;
    }
    public Author getAuthor() {
        return this.author; }

    public int getPublicationYear() {
        return this.publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public Book(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public Book(Author author) {
        this.author = author;
    }

    public String toString() {
        return "A title of book " + this.bookTitle + this.author + ", the year, when the book was published " + this.publicationYear;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publicationYear == book.publicationYear && Objects.equals(bookTitle, book.bookTitle) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookTitle, author, publicationYear);
    }
}

