import model.Book;
import model.LibraryMember;
import system.Library;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("1984", "George Orwell", "111");
        Book book2 = new Book("The Hobbit", "J.R.R. Tolkien", "222");
        Book book3 = new Book("Dune", "Frank Herbert", "333");
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        LibraryMember alice = new LibraryMember("Alice", 1);
        LibraryMember bob = new LibraryMember("Bob", 2);
        library.addMember(alice);
        library.addMember(bob);


        library.borrowBook(alice, book1);
        library.borrowBook(bob, book1);
        library.returnBook(alice, book1);
        library.borrowBook(bob, book1);

        System.out.println();


        library.reserveBook(alice, book2);
        library.reserveBook(alice, book3);
        library.reserveBook(bob, book2);
        library.displayReservedBooks(alice);

        library.cancelReservation(bob, book2); 
        library.cancelReservation(alice, book2);
        library.displayReservedBooks(alice);
    }
}