package streamfunctionconsumer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExampleFunction {

    //Function - метод apply принимает объект одного типа и возвращает объект другого типа
    //map() - interm. После метода map тип объекта в стриме может измениться.

    public static void main(String[] args) {

        Book[] books = {new Book("one", 234), new Book("two", 567), new Book("three", 999)};

        List<Integer> isbns = new ArrayList<>();
        Arrays.stream(books).forEach(book -> {
            isbns.add(book.getIsbn());
        });

        //book -> book.getIsbn() Book::getIsbn
        Arrays.stream(books).map(Book::getIsbn)
                .collect(Collectors.toList());

        ExampleFunction exampleFunction = new ExampleFunction();
        System.out.println(exampleFunction.getIsbnList(books));

        String[] names = {"one", "two", "three"};
        List<Book> collect = Arrays.stream(names).map(Book::new).collect((Collectors.toList()));

    }


    private List<Integer> getIsbnList(Book[] books) {
        return Arrays.stream(books).map(Book::getIsbn)
                .collect(Collectors.toList());
    }

}
