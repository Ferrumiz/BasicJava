package etc;

public class Man {
    private String name;
    public Man(String name){
        this.name = name;
    }
    public void makeCall(Phone phone, int number){
        phone.call(number);
    }
}
