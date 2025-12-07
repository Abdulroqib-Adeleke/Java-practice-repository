package OOP;

import java.util.ArrayList;

public class Library {
    private ArrayList<Books> books = new ArrayList<>();

    public void addBook(Books books){
        this.books.add(books);
        System.out.println(books.getTitle() + " added to the library.");
    }

    public Books findBook(String title){
        for(Books b : books){
            if(b.getTitle().equals(title))
                return b;
        }
        return null;
    }

    public void listBook(){
        if(books.isEmpty())
            System.out.println("No books in the library!");

        System.out.println("Books is the library are:");
        for(Books b : books)
            System.out.println("- " + b);
    }
}

class Books{
    private final String title;
    private final String author;
    private final int pages;

    public Books(String title, String author, int pages){
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getPages() {
        return this.pages;
    }

    @Override
    public String toString() {
        return "Book: " + this.title + " by " + this.author + ", pages: " + this.pages + ".";
    }
}

class LibraryMain{
    public static void main(String[] args) {
        Library lib = new Library();

        lib.addBook(new Books("Days gone", "John", 700));
        lib.addBook(new Books("Half of a yellow sun", "Chimamanda", 1200));
        lib.addBook(new Books("Independence", "Obinna", 230));

        System.out.println(lib.findBook("Independence"));
        System.out.println(lib.findBook("yes"));
        System.out.println("------");
        lib.listBook();
    }
}
