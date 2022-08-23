package set.appset.treeset;

import java.util.Set;

public class Book {

    private String name;

    private String author;

    private int pagesCount;

    public Book(String name, String author, int pagesCount) {
        this.name = name;
        this.author = author;
        this.pagesCount = pagesCount;
    }

    public char getAlphabetIndex() {
        return name.toLowerCase().charAt(0);
    }
}
