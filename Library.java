package GuviTask3;

public class Library {
    private Book[] books;
    private int bookCount;

    public Library() {
        this.books = new Book[5];
        this.bookCount = 0;
    }


    public void addBook(Book book) {
        if (bookCount < books.length) {
            books[bookCount++] = book;
            System.out.println("Book added!");
        } else {
            System.out.println("Library is full.");
        }
    }

    public void removeBook(int bookID) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getBookID() == bookID) {
                for (int j = i; j < bookCount - 1; j++) {
                    books[j] = books[j + 1];
                }
                bookCount--;
                System.out.println("Book removed");
                return;
            }
        }
        System.out.println("Book with ID " + bookID + " not found.");
    }

    public void displayBooks() {
        if (bookCount == 0) {
            System.out.println("No books in the library.");
        } else {
            System.out.println("Books in the library:");
            for (int i = 0; i < bookCount; i++) {
                displayBookDetails(books[i]);
            }
        }
    }
    private void displayBookDetails(Book book) {
        System.out.println("ID: " + book.getBookID() + ", Title: " + book.getTitle() +
                ", Author: " + book.getAuthor() + ", Available: " + book.isAvailable());
    }
}