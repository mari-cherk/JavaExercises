package Arrays.library;

public class Book {

    private String title;
    private String publusher;
    private int year;

    public Book(String title, String publusher, int year) {
        this.title = title;
        this.publusher = publusher;
        this.year = year;
    }

    public String title(){
        return this.title;
    }

    public String publisher(){
        return this.publusher;
    }

    public int year(){
        return this.year;
    }

    public String toString(){
        return this.title + ", " + this.publusher + ", " + this.year;
    }
}
