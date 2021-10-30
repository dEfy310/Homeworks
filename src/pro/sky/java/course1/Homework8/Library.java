package pro.sky.java.course1.Homework8;

public class Library {
    private Book[] library;

    public Library(int size) {
        this.library = new Book[size];
    }

    public void getBookInfo() {
        for (Book book : library) {
            if (book != null) {
                System.out.print("\n" + book.getAuthorName().getFirstName() + " " + book.getAuthorName().getMiddleName() + ": ");
                System.out.print(book.getBookName() + ": ");
                System.out.print(book.getReleaseYear() + "\n");
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
        System.out.println("Ошибка при добавлении книги!");
    }

    public void getBookInfo(String bookName) {
        for (Book book : library) {
            if (book == null) {
                continue;
            }
            if (bookName.equals(book.getBookName())) {
                System.out.println("\n" + book.getBookName() + " by " + book.getAuthorName().getFirstName() + " " +
                        book.getAuthorName().getMiddleName() + " was published in " + book.getReleaseYear());
                return;
            }
        }
        System.out.println("Book not found!");
    }

    public void setPublishingYear(String bookName, int yearOfRelease) {
        for (int i = 0; i < library.length - 1; i++) {
            if (library[i] == null) {
                continue;
            }
            if (bookName.equals(library[i].getBookName())) {
                library[i].setReleaseYear(yearOfRelease);
                return;
            }
        }
    }
}
