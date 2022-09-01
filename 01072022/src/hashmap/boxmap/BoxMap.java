package hashmap.boxmap;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BoxMap {
    public static void main(String[] args) {

        Book bookOne = new Book("Operation system Administration", "Admin", 110);
        Book bookTwo = new Book("System administration", "Admin", 110);
        Book bookThree = new Book("Linux administration", "Admin", 110);
        Book bookFour = new Book("Oracle administration", "Admin", 110);

        Map<Box, List<Book>> catalog = new HashMap<>();
        BoxMap boxMap = new BoxMap();
        boxMap.putBooksToCatalog(catalog, bookOne, bookFour, bookThree, bookTwo);

    }

    private void putBooksToCatalog(Map<Box, List<Book>> catalog, Book... books) {
        for (Book book : books) {
            char alphabetIndex = book.getAlphabetIndex1();
            Box box = getBox(alphabetIndex);
            List<Book> bookList;
            if (catalog.containsKey(box)) {
                bookList = catalog.get(box);
                bookList.add(book);
            } else {
                bookList = new ArrayList<>();
                bookList.add(book);
                catalog.put(box, bookList);
            }
        }
    }

    private Box getBox(char letter) {
        return new Box(letter);
    }
}


