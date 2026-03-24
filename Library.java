import java.util.*;

class Book {
    String title, author, ISBN;

    Book(String t, String a, String i) {
        title = t;
        author = a;
        ISBN = i;
    }
}

class Library {
    ArrayList<Book> books = new ArrayList<>();

    void addBook(Book b) {
        books.add(b);
    }

    void removeBook(String isbn) {
        books.removeIf(b -> b.ISBN.equals(isbn));
    }

    void displayBooks() {
        for (Book b : books) {
            System.out.println(b.title + " " + b.author + " " + b.ISBN);
        }
    }

    public static void main(String[] args) {
        Library l = new Library();
        l.addBook(new Book("Java", "James", "101"));
        l.displayBooks();
    }
}