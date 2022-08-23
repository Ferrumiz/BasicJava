package hashmap.hashMapOfBooks;

import org.jetbrains.annotations.NotNull;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Box implements  Comparable{

    private char letter;

    private List<Book> books;

    public Box(char letter) {
        this.letter = letter;
        this.books = new ArrayList<>();
    }


    public void putBook(Book book) {
        books.add(book);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Box box = (Box) o;
        return letter == box.letter;
    }

    @Override
    public int hashCode() {
        return Objects.hash(letter);
    }

    @Override
    public int compareTo(@NotNull Object o) {
        return  this.letter-((Box)o).letter;
    }
}

