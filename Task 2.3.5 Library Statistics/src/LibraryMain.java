public class LibraryMain {
    public static void main(String[] args) {
        Book book1 = new Book("Introduction to Java Programming", "John Smith", 2020);
        Book book2 = new Book("Data Structures and Algorithms", "Jane Doe", 2018);
        Book book3 = new Book("The Art of Fiction", "Alice Johnson", 2019);

        book1.setRating(4.5);
        book1.addReview("Great book!");
        book1.addReview("Very helpful.");

        book2.setRating(4.8);
        book2.addReview("Essential read.");

        book3.setRating(4.0);

        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.displayBooks();

        System.out.println("\nAverage Book Rating: " + library.getAverageBookRating());

        Book topBook = library.getMostReviewedBook();

        if (topBook != null) {
            System.out.println("Most Reviewed Book: \"" + topBook.getTitle() + "\" with " + topBook.getReviewCount() + " reviews.");
        }
    }
}