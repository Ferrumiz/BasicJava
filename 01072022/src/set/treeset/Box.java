package set.treeset;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Box {

    private char letter;

    private List<Book> books;

    public Box(char letter) {
        this.letter = letter;
        this.books = new ArrayList<>();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Box box = (Box) o;
        return letter == box.letter && Objects.equals(books, box.books);
    }

    @Override
    public int hashCode() {
        return Objects.hash(letter, books);
    }

    public int compareTo(Object o)

    public void putBook(Book book){

   }

    public char getLetter() {
        return letter;
    }
}
