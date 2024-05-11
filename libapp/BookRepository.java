package libapp;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class BookRepository {
    // Instance of the array list of books
    private ArrayList<Book> books = new ArrayList<>();

    public BookRepository() {
        // Add some objects to the array list
        books.add(new Book("34567", "Neuromancer", "Sci-fi", "null", "William Gibson"));
        books.add(new Book("34237", "1984", "Fantasy", "null", "George Orwell"));
        books.add(new Book("54527", "Skullduggery Pleasant", "Fantasy", "null", "Derek Landy"));

    }

    // Method that find a book with an ISBN
    public Book findByIsbn (String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;
    }

    // Method that finds books with a keyword
    public ArrayList<Book> findByTitle (String keyword) {
        ArrayList<Book> booksFound = new ArrayList<>();
        for (Book book : books) {
            // Added lowercase method to avoid case sensitivity
            if (book.getTitle().toLowerCase().contains(keyword.toLowerCase())) {
                booksFound.add(book);
            }
        }
        return booksFound;
    }
}
