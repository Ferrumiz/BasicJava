package streamfunctionconsumer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ExampleConsumer {

    //Consumer - метод accept - принимает параметр и ничего не возвращает.
    //foreach() - term.
    //peek() - interm.

    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();
        stringList.add("one");
        stringList.add("two");
        stringList.add("three");
        stringList.add("three");
        stringList.add("two");

        Book[] books = {new Book("one"), new Book("two"), new Book("three")};
        ExampleConsumer exampleConsumer = new ExampleConsumer();

        Consumer<Book> consumer = book -> {
            String name = book.getName().toUpperCase();
            book.setName(name);
        };

        //1 - static ExampleConsumer::updateName
        //2 - exampleConsumer::updateName
        //3 - this::updateName , super::updateName

        // object :: method
        //s -> object.method(s)


        //Arrays.stream(books).forEach(book -> updateName(book));
        Arrays.stream(books).forEach(ExampleConsumer::updateName);

        exampleConsumer.callUpdateNameForAll(books);
        Arrays.stream(books).forEach(Book::printName);

        //peek()
        Arrays.stream(books).peek(ExampleConsumer::updateName)
                .filter(book -> book.getName().contains("T"))
                .forEach(System.out::println);

        //System.out::println   book -> System.out.println(book)

        //book -> book.getName().contains("T");
        Predicate<Book> bookPredicate = new Predicate<>() {
            @Override
            public boolean test(Book book) {
                return book.getName().contains("T");
            }
        };


        for (
                Book book : books) {
            String name = book.getName().toUpperCase();
            book.setName(name);
        }
        System.out.println(Arrays.toString(books));

        Arrays.stream(books).

                forEach(book ->

                {
                    String name = book.getName().toUpperCase();
                    book.setName(name);
                });
        System.out.println(Arrays.toString(books));
    }


    private void updateName() {
        //
    }

    private static void updateName(Book book) {
        String name = book.getName().toUpperCase();
        book.setName(name);
    }

    private void callUpdateNameForAll(Book[] books) {

        Runnable runnable = this::updateName;

        Arrays.stream(books).forEach(this::updateNameTwo);

    }

    private void updateNameTwo(Book book) {
        String name = book.getName().toUpperCase();
        book.setName(name);
    }
}
