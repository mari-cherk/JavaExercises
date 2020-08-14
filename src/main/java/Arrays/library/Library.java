package Arrays.library;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Library {

    private ArrayList<Book> books;

    public Library() {
        this.books = new ArrayList<Book>();
    }

    public void addBook(Book newBook){
        books.add(newBook);
    }

    public void printBooks(){
        books.forEach(System.out::println);
    }

    public ArrayList<Book> searchByTitle(String title) {

        ArrayList<Book> found = new ArrayList<Book>();
        //found = (ArrayList<Book>) this.books.stream().filter(x -> x.title().contains(title)).collect(Collectors.toList());
        found = (ArrayList<Book>) this.books.stream().filter(x -> StringUtils.included(x.title(), title)).collect(Collectors.toList());
        return found;
    }

    public ArrayList<Book> searchByPublisher(String publisher){
        ArrayList<Book> found = new ArrayList<Book>();
        found = (ArrayList<Book>) this.books.stream().filter(x -> StringUtils.included(x.publisher(), publisher)).collect(Collectors.toList());
        return found;
    }

    public ArrayList<Book> searchByYear(int year){
        ArrayList<Book> found = new ArrayList<Book>();
        found = (ArrayList<Book>) this.books.stream().filter(x -> x.year() == year).collect(Collectors.toList());
        return found;
    }
}
