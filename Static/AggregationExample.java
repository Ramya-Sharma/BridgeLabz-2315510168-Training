import java.util.ArrayList;
import java.util.List;

// Book class (can exist independently)
class Book {
    String title;
    String author;

    // Constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Display book details
    public void displayBook() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}

// Library class (aggregates multiple books)
class Library {
    private String libraryName;
    private List<Book> books;  // Aggregation: Library HAS-A list of Books

    // Constructor
    public Library(String libraryName) {
        this.libraryName = libraryName;
        this.books = new ArrayList<>();
    }

    // Add a book to the library
    public void addBook(Book book) {
        books.add(book);
    }

    // Display library and its books
    public void displayLibrary() {
        System.out.println("Library: " + libraryName);
        System.out.println("Books available:");
        for (Book book : books) {
            book.displayBook();
        }
        System.out.println();
    }
}

// Main class
public class AggregationExample {
    public static void main(String[] args) {
        // Create independent books
        Book b1 = new Book("The Alchemist", "Paulo Coelho");
        Book b2 = new Book("1984", "George Orwell");
        Book b3 = new Book("The Great Gatsby", "F. Scott Fitzgerald");

        // Create two libraries
        Library lib1 = new Library("City Library");
        Library lib2 = new Library("University Library");

        // Add books to libraries
        lib1.addBook(b1);
        lib1.addBook(b2);

        lib2.addBook(b2); // same book can exist in another library
        lib2.addBook(b3);

        // Display libraries
        lib1.displayLibrary();
        lib2.displayLibrary();
    }
}
