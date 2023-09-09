package comparatorjavarush;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Message {
    private String message;
    private int id;

    public static void main(String[] args){
        List<Message> messages = new ArrayList();
        messages.add(new Message("Hello, World!"));
        messages.add(new Message("Hello, Sun!"));
        System.out.println(messages);

        Comparator<Message> comparator = new Comparator<Message>() {
            @Override
            public int compare(Message o1, Message o2) {
                return o1.getId().compareTo(o2.getId());
            }

            @Override
            public boolean equals(Object obj) {
                return false;
            }
        };

    }

    public Message(String message) {
        this.message = message;
        this.id = new Random().nextInt(1000);
    }
    public String getMessage() {
        return message;
    }
    public Integer getId() {
        return id;
    }
    public String toString() {
        return "[" + id + "] " + message;
    }
}