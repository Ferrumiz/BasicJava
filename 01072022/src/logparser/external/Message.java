package logparser.external;

public class Message {
    private String text;
    private int length;

    public Message(String text, int length) {
        this.text = text;
        this.length = length;
    }

    public String getText() {
        return text;
    }

    public int getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "Message{" +
                "text='" + text + '\'' +
                ", length=" + length +
                '}';
    }
}
