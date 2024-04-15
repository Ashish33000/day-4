import java.util.*;
public class Three{
    public static void main(String[] args) {
           Library library = new Library();

        library.addBook(new Book("Book 1"));
        library.addBook(new Book("Book 2"));
         library.addBook(new Book("Book 3"));         


        library.addMember(new Member("Member 1"));
        library.addMember(new Member("Member 2"));
        library.addMember(new Member("Member 3"));

       
        library.logReturnedBook(new Book("Returned Book 1"));
        library.logReturnedBook(new Book("Returned Book 2"));
        library.logReturnedBook(new Book("Returned Book 3"));
          System.out.println(library.getAllBooks());
        System.out.println( library.getNextUser());
        System.out.println(library.getAllMembers());
        System.out.println(library.getLastReturnedBook().getTitle());
        
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
class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
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
    private ArrayList<Book> books;
    private LinkedList<User> waitingQueue;
    private Vector<Member> members;
    private Stack<Book> returnedBooksLog;

    public Library() {
        this.books = new ArrayList<>();
        this.waitingQueue = new LinkedList<>();
        this.members = new Vector<>();
        this.returnedBooksLog = new Stack<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public ArrayList<Book> getAllBooks() {
        return books;
    }

    public void addToWaitingQueue(User user) {
        waitingQueue.add(user);
    }

    public User getNextUser() {
        return waitingQueue.poll();
    }

    public void addMember(Member member) {
        members.add(member);
    }

    public Vector<Member> getAllMembers() {
        return members;
    }

    public void logReturnedBook(Book book) {
        returnedBooksLog.push(book);
    }

    public Book getLastReturnedBook() {
        return returnedBooksLog.peek();
    }
}
