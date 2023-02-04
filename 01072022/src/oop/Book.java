package oop;

public class Book {

    private String name;

    private String author;

    private int pagesCount;

    public Book(String name, int pagesCount) {
        this.name = name;
        this.author = author;
        this.pagesCount = pagesCount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPagesCount(int pagesCount) {
        this.pagesCount = pagesCount;
    }

    public char getAlphabetIndex1() {
        return name.toLowerCase().charAt(0);
    }
}
