package set.treeset;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TreeApp {

    public static void main(String[] args) {

        Set<Box> catalog = new HashSet<>();
        Book bookOne = new Book("Administration1", "Admin",110);
        Book bookTwo = new Book("Administration2", "Admin",110);
        Book bookThree = new Book("Administration3", "Admin",110);
        TreeApp treeApp = new TreeApp();
        treeApp.putBookToBox(new Book[]{bookOne,bookTwo,bookThree});

        for (int i = 0; i < 26; i++) {
            char letter = (char)(i +'a');
            Box tempBox = new Box(letter);
            catalog.add(tempBox);
        }

        catalog.contains(new Box('z'))


        for (Box box: catalog) {
            if (box.getLetter()==book.getAlphabetIndex()){
                box.putBook(book);
            }
        }


    }
private void putBookToBox (Book[] books, Set<Box> catalog){
        for (Book book:books){
            char
        }
}
    char alphabetIndex = book.getAlphabetIndex();
    Box box = createBox(alphabetIndex,catalog);
    box.putBook(book);
    if(!catalog.contains(box)) {
        catalog.add(box);
    }

    }

    private  Box createBox ( char alphabetIndex,Set<Box> catalog) {
        if(catalog.contains(new Box(alphabetIndex))){
            for(Box box: catalog){
                if (box.getLetter()==alphabetIndex){
                    return box;
                }
            }
    }
    return new Box(alphabetIndex);
}
