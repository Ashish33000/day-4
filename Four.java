import java.util.*;
public class Four{
    public static void main(String[] args) {
           Library library = new Library();

       
        
    }
}

class Book {
   private String title;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}


class Member {
    private String name;

    public Member(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Library {
  private HashSet<Member> members;
    private LinkedHashSet<Book> borrowedBooks;
    private TreeSet<String> sortedBookTitles;
    private HashMap<Integer, Book> bookDetailsById;
    private LinkedHashMap<Integer, Book> bookCheckoutDetails;
    private TreeMap<Integer, Book> booksSortedById;

    public Library() {
        this.members = new HashSet<>();
        this.borrowedBooks = new LinkedHashSet<>();
        this.sortedBookTitles = new TreeSet<>();
        this.bookDetailsById = new HashMap<>();
        this.bookCheckoutDetails = new LinkedHashMap<>();
        this.booksSortedById = new TreeMap<>();
    }

    public void addMember(Member member) {
        members.add(member);
    }

    public HashSet<Member> getAllMembers() {
        return members;
    }

    public void checkoutBook(Book book) {
        borrowedBooks.add(book);
        sortedBookTitles.add(book.getTitle());
        bookCheckoutDetails.put(book.getId(), book);
    }

    public LinkedHashSet<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public TreeSet<String> getSortedBookTitles() {
        return sortedBookTitles;
    }

    public void addBookDetails(int id, Book book) {
        bookDetailsById.put(id, book);
        booksSortedById.put(id, book);
    }

    public HashMap<Integer, Book> getBookDetailsById() {
        return bookDetailsById;
    }

    public LinkedHashMap<Integer, Book> getBookCheckoutDetails() {
        return bookCheckoutDetails;
    }

    public TreeMap<Integer, Book> getBooksSortedById() {
        return booksSortedById;
    }
}
