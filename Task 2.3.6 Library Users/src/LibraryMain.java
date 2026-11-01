public class LibraryMain {
    public static void main(String[] args) {
        Book book1 = new Book("Introduction to Java Programming", "John Smith", 2020);
        Book book2 = new Book("Data Structures and Algorithms", "Jane Doe", 2018);
        Book book3 = new Book("The Art of Fiction", "Alice Johnson", 2019);

        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        User user1 = new User("Bob Builder", 22);
        library.addUser(user1);

        library.displayBooks();
        library.displayUsers();

        library.borrowBook("Data Structures and Algorithms", user1);

        library.displayBooks();

        library.returnBook(book2, user1);

        library.displayBooks();
    }
}