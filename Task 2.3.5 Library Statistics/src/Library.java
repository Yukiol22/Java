import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();


    public void addBook(Book book) {
        books.add(book);
    }

    public void displayBooks() {
        System.out.println("Library Catalog:");
        for (int i = 0; i < books.size(); i++) {
            Book b = books.get(i);
            System.out.println((i + 1) + ". Title: \"" + b.getTitle() + "\", Author: \"" + b.getAuthor() + "\", Year: " + b.getPublicationYear());
        }
    }

    public void findBooksByAuthor(String author) {
        System.out.println("\nBooks by Author \"" + author + "\":");
        for (Book b : books) {
            if (b.getAuthor().equalsIgnoreCase(author)) {
                System.out.println("Title: \"" + b.getTitle() + "\", Year: " + b.getPublicationYear());
            }
        }
    }
    public void borrowBook(String title) {
        Book bookToBorrow = null;
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title)) {
                bookToBorrow = b;
                break;
            }
        }

        if (bookToBorrow != null) {
            books.remove(bookToBorrow);
            System.out.println("You have successfully borrowed: \"" + title + "\"");
        } else {
            System.out.println("Sorry, the book \"" + title + "\" is not available in the library.");
        }
    }

    public void returnBook(Book book) {
        books.add(book);
        System.out.println("You have successfully returned: \"" + book.getTitle() + "\"");
    }

    public boolean isBookAvailable(String title) {
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title)) {
                return true;
            }
        }
        return false;
    }

    public double getAverageBookRating() {
        if (books.isEmpty()) {
            return 0.0;
        }
        double sum = 0;
        for (Book b : books) {
            sum += b.getRating();
        }
        return sum / books.size();
    }

    public Book getMostReviewedBook() {
        if (books.isEmpty()) {
            return null;
        }
        Book mostReviewed = books.get(0);
        for (Book b : books) {
            if (b.getReviewCount() > mostReviewed.getReviewCount()) {
                mostReviewed = b;
            }
        }
        return mostReviewed;
    }

}