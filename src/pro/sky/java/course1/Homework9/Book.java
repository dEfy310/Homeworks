package pro.sky.java.course1.Homework9;
import java.util.Objects;
public class Book {
    private final String bookName;
    private int releaseYear;
    public Author authorName;

    public Book(String bookName, Author authorName, int releaseYear) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.releaseYear = releaseYear;
    }

    public Author getAuthorName() {
        return authorName;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public String getBookName() {
        return bookName;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    @Override
    public String toString() {
        return "Book: " + bookName + " by " + authorName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return releaseYear == book.releaseYear && bookName.equals(book.bookName) && authorName.equals(book.authorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, releaseYear, authorName);
    }
}


