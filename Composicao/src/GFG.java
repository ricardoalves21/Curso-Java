import java.util.ArrayList;
import java.util.List;

class GFG {



    public static void main(String[] args) {

        Book b1 = new Book("EffectiveJ Java", "Joshua Bloch");
        Book b2 = new Book("Thinking in Java", "Bruce Eckel");
        Book b3 = new Book("Java: The Complete Reference", "Herbert Schildt");

        List<Book> book = new ArrayList<Book>();

        book.add(b1);
        book.add(b2);
        book.add(b3);

        Library library = new Library(book);

        List<Book> books = library.getListOfBooksInLibrary();

        for (Book bk : books) {
            System.out.println("Title : " + bk.title + " and " + " Author : " + bk.author);
        }



    }



}