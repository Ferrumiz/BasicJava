package streamfunctionconsumer;

public class Book {

    private String name;

    private int isbn;

    public Book() {
    }

    public Book(String name, int isbn) {
        this.name = name;
        this.isbn = isbn;
    }

    public Book(String one) {
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", isbn=" + isbn +
                '}';
    }

    public void printName() {
        System.out.println(name);
    }
}
