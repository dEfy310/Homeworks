package pro.sky.java.course1.Homework8;

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
}
