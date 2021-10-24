package pro.sky.java.course1.Homework9;

public class Library {
    private Book[] library;

    public Library(int range) {
        this.library = new Book[range];
    }

    public void getBookInfo(Book[] books) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                System.out.print("\n" + books[i].getAuthorName().getFirstName() + " " + books[i].getAuthorName().getMiddleName() + ": ");
                System.out.print(books[i].getBookName() + ": ");
                System.out.print(books[i].getReleaseYear() + "\n");
            }
        }

    }

    public void appendNewBook(Book bookName) {
        for (int i = 0; i < library.length; i++) {
            if (library[i] == null) {
                library[i] = bookName;
                return;
            }
        }
    }

    public void getBookInfo(String bookName) {
        for (int i = 0; i < library.length; i++) {
            if (library[i] == null) {
                continue;}
            if (bookName.equals(library[i].getBookName())) {
                System.out.println("\n" + library[i].getBookName() + " by " + library[i].getAuthorName().getFirstName() + " " +
                        library[i].getAuthorName().getMiddleName() + " was published in " + library[i].getReleaseYear());
                return;
            }
        }
    }

    public void setPublishingYear(String bookName, int yearOfRelease) {
        for (int i = 0; i < library.length - 1; i++) {
            if (library[i] == null) {
                continue;}
            if (bookName.equals(library[i].getBookName())) {
                library[i].setReleaseYear(yearOfRelease);
                return;
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder books = new StringBuilder();
        for (int i = 0; i < library.length; i++) {
            books.append(library[i] + "\n");
        }
        return "Library: " + "\n" + books;
    }
}


