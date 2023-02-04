package reflection;

public class TechnicalBook {

    private String name;

    public int pages;



    public TechnicalBook(String name, int pages) {
        this.name = "simple text";
        this.pages = 500;
    }

    @Override
    public String toString() {
        return "TechnicalBook{" +
                "name='" + name + '\'' +
                ", pages=" + pages +
                '}';
    }
}
