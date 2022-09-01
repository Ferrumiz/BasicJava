package hashmap.boxmap;

public class Book {

    private String name;

    private String author;

    private int pagesCount;

    public Book(String name, String author, int pagesCount) {
        this.name = name;
        this.author = author;
        this.pagesCount = pagesCount;
    }

    public char getAlphabetIndex1() {
        return name.toLowerCase().charAt(0);
    }
}
