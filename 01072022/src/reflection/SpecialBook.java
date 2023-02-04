package reflection;

public class SpecialBook {
    private String name;

    public int pages;

    private String author;

    public SpecialBook(String name, int pages, String author) {
        this.name = name;
        this.pages = pages;
        this.author = author;
    }

    public SpecialBook(){
        name = "simple text";
    }

    private void turn(){
        System.out.println("turn" + name);
    }

    @Override
    public String toString() {
        return "SpecialBook{" +
                "name='" + name + '\'' +
                ", pages=" + pages +
                ", author='" + author + '\'' +
                '}';
    }
}
