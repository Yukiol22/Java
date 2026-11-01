public class LibraryMain {
    public static void main(String[] args) {
        Book book1 = new Book("Introduction to Java Programming", "John Smith", 2020);
        Book book2 = new Book("Data Structures and Algorithms", "Jane Doe", 2018);
        Book book3 = new Book("The Art of Fiction", "Alice Johnson", 2019);

        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);


        System.out.println("Is \"Data Structures and Algorithms\" available? " + library.isBookAvailable("Data Structures and Algorithms"));
        System.out.println("Is \"Harry Potter\" available? " + library.isBookAvailable("Harry Potter"));


        library.borrowBook("Data Structures and Algorithms");

        System.out.println("Is \"Data Structures and Algorithms\" available now? " + library.isBookAvailable("Data Structures and Algorithms"));
    }
}