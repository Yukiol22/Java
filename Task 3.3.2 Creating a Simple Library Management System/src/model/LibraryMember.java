package model;

import java.util.ArrayList;
import java.util.List;

public class LibraryMember {
    private String name;
    private int memberId;
    private List<Book> borrowedBooks = new ArrayList<>();

    public LibraryMember(String name, int memberId) {
        this.name = name;
        this.memberId = memberId;
    }

    public String getName()  { return name; }
    public int getMemberId() { return memberId; }

    public List<Book> getBorrowedBooks()      { return borrowedBooks; }
    public void addBorrowedBook(Book book)    { borrowedBooks.add(book); }
    public void removeBorrowedBook(Book book) { borrowedBooks.remove(book); }
}