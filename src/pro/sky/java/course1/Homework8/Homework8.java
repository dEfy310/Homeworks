package pro.sky.java.course1.Homework8;

public class Homework8 {
    private static Book[] books = new Book[5];

    public static void main(String[] args) {
        Author fedorDostoevsky = new Author("Fedor", "Dostoevsky");
        Book idiot = new Book("Idiot", fedorDostoevsky, 1869);

        Author nikolayGogol = new Author("Nikolay", "Gogol");
        Book tarasBulba = new Book("Taras Bulba", nikolayGogol, 1835);

        Author jackLondon = new Author("Jack", "London");
        Book theGame = new Book("The Game", jackLondon, 1905);

        tarasBulba.setReleaseYear(1920);

        books[0] = idiot;
        books[1] = tarasBulba;

        appendNewBook(books, theGame);
        printAllBooks(books);

        Library book = new Library(5);
        book.appendNewBook(idiot);
        book.appendNewBook(tarasBulba);
        book.appendNewBook(theGame);
        System.out.println("");
        book.getBookInfo("Idiot");
        book.setPublishingYear("Taras Bulba", 1883);
        book.getBookInfo("Kolobok");
        book.getBookInfo();
    }

    public static void appendNewBook(Book[] library, Book book) {
        for (int i = 0; i < library.length; i++) {
            if (library[i] == null) {
                library[i] = book;
                System.out.println();
                System.out.println("Книга добавлена в ячейку " + i);
                return;
            }
        }
        System.out.println("Книга не добавлена, так как нет свободных ячеек");
        System.out.println();
    }

    public static void printAllBooks(Book[] books) {
        for (Book book : books) {
            if (book != null) {
                System.out.println();
                System.out.print(book.getAuthorName().getFirstName() + " " + book.getAuthorName().getMiddleName() + ": " + book.getBookName() + ": " + book.getReleaseYear());
            }
        }
    }
}
