public class LibraryMain {
    public static void main(String[] args) {
        Book book1 = new Book("Introduction to Java Programming", "John Smith", 2020);
        Book book2 = new Book("Data Structures and Algorithms", "Jane Doe", 2018);
        Book book3 = new Book("The Art of Fiction", "Alice Johnson", 2019);

        book1.setRating(4.5);
        book1.addReview("Great book for beginners!");
        book1.addReview("Very clear examples.");

        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.displayBooks();

        System.out.println("\nRating for \"" + book1.getTitle() + "\": " + book1.getRating());
        System.out.println("Reviews for \"" + book1.getTitle() + "\":");
        for (String review : book1.getReviews()) {
            System.out.println("- " + review);
        }
    }
}