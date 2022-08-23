package set.appset.treeset;

import java.util.*;

public class TreeApp {

    public static void main(String[] args) {

        TreeSet<Box> catalog = new TreeSet<>();
        Book bookOne = new Book("Operation system Administration", "Admin", 110);
        Book bookTwo = new Book("System administration", "Admin", 110);
        Book bookThree = new Book("Linux administration", "Admin", 110);
        Book bookFour = new Book("Oracle administration", "Admin", 110);
        TreeApp treeApp = new TreeApp();
        treeApp.putBookToBox(new Book[]{bookOne, bookTwo, bookThree, bookFour}, catalog);
    }

    private void putBookToBox(Book[] books, TreeSet<Box> catalog) {
        for (Book book : books) {
            char alphabetIndex = book.getAlphabetIndex();
            Box box = new Box(alphabetIndex);
            createBox(alphabetIndex, catalog);
            box.putBook(book);
            if (!catalog.contains(box)) {
                catalog.add(box);
            }
        }
    }

    private Box createBox(char alphabetIndex, TreeSet<Box> catalog) {
        Box tempBox = new Box(alphabetIndex);
        if (catalog.contains(tempBox)) {
            SortedSet<Box> boxes = catalog.subSet(tempBox, true, tempBox, true);
            return boxes.iterator().next();
        }
        return new Box(alphabetIndex);
    }
}
