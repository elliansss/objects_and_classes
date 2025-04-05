import java.util.Objects;

public class Book {
    private String bookTitle;
    private Author nameOfAuthor;
    private int publicationYear;
    public Book(String bookTitle, Author nameOfAuthor, int publicationYear) {
        this.bookTitle = bookTitle;
        this.nameOfAuthor = nameOfAuthor;
        this.publicationYear = publicationYear;
    }

    public String getBookTitle() {
        return this.bookTitle;
    }
    public Author getNameOfAuthor() {
        return this.nameOfAuthor; }

    public int getPublicationYear() {
        return this.publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
    public String toString() {
        return "A title of book " + this.bookTitle + this.nameOfAuthor + ", the year, when the book was published " + this.publicationYear;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publicationYear == book.publicationYear;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(publicationYear);
    }

    public Book(int publicationYear) {
        this.publicationYear = publicationYear;
    }

}

