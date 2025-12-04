package OOP;

public class Book {
    private final String title;
    private final String author;
    private final int pages;

    public Book(String title, String author, int pages){
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public boolean isBookLong(){
        return this.pages >= 300;
    }
}
class MainBook {
    public static void main(String[] args){
        Book book1 = new Book("Independence", "John", 250);
        Book book2 = new Book("The hearts", "Ayo", 500);

        System.out.println(book1.isBookLong());
        System.out.println(book2.isBookLong());


    }
}
