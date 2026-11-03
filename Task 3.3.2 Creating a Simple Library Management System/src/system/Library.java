package system;

import model.Book;
import model.LibraryMember;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();
    private List<LibraryMember> members = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void addMember(LibraryMember member) {
        members.add(member);
    }

    public void borrowBook(LibraryMember member, Book book) {
        if (books.contains(book)) {
            books.remove(book);
            member.addBorrowedBook(book);
            System.out.println(member.getName() + " MemberID: "+ member.getMemberId() +" borrowed " + book.getTitle());
        } else {
            System.out.println(member.getName() + " tried to borrow the book but " + book.getTitle() +" is not available.");
        }
    }

    public void returnBook(LibraryMember member, Book book) {
        if (member.getBorrowedBooks().contains(book)) {
            member.removeBorrowedBook(book);
            books.add(book);
            System.out.println(member.getName() +" MemberID: "+   member.getMemberId() + " returned " + book.getTitle());
        } else {
            System.out.println(member.getName() +  " has not borrowed " + book.getTitle());
        }
    }
}