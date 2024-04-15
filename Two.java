import java.util.*;
public class Two{
    public static void main(String[] args) {
          Book book1 = new Book("Science", false);
        Library library = new Library();
        
         try {
            library.checkoutBook(book1);
        } catch (BookNotAvailableException e) {
            System.out.println(e.getMessage());
        } finally {
            
            System.out.println("Thank you" );
        }
        
    }
}
class BookNotAvailableException extends RuntimeException {
    public BookNotAvailableException() {
       
    }

    public BookNotAvailableException(String m) {
        super(m);
    }
}
class Book {
    private String title;
    private boolean available;

    public Book(String title, boolean available) {
        this.title = title;
        this.available = available;
    }

    public boolean isAvailable() {
        return available;
    }
}

class Library {
    public void checkoutBook(Book book) throws BookNotAvailableException {
        if (book.isAvailable()) {
          
            System.out.println(book + " has been checked ");
        } else {
            throw new BookNotAvailableException();
        }
    }
}
