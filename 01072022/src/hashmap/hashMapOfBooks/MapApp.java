package hashmap.hashMapOfBooks;


import java.util.HashMap;
import java.util.Map;

public class MapApp {
    public static void main(String[] args) {

        Book bookOne = new Book("Operation system Administration", "Admin", 110);
        Book bookTwo = new Book("System administration", "Admin", 110);
        Book bookThree = new Book("Linux administration", "Admin", 110);
        Book bookFour = new Book("Oracle administration", "Admin", 110);

        Map<Character, Book> catalog = new HashMap<>();
        MapApp mapApp = new MapApp();
        mapApp.putBookToBox(new Book[]{bookOne, bookTwo, bookThree, bookFour}, catalog);

        for (Map.Entry<Character, Book> books : catalog.entrySet()) {
            Character key = books.getKey();
            Book name = books.getValue();
            System.out.println("Key = " + key + ", name = " + name);
        }
    }

    private void putBookToBox(Book[] books, Map<Character, Book> catalog) {
        for (Book k: books) {
            char tmp = k.getAlphabetIndex1();
            catalog.put(tmp, k);
        }
    }
}


