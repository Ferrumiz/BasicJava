package etc;

public class Phone {

    private String name;

    public void call(int number) {
        if (checkNumber(number)) {
            System.out.println(" Call to number " + number);
        } else {
            System.out.println("input number" + number + " is correct");
        }
    }

    public void receiveCall() {
        //
    }

    private boolean checkNumber(int number) {
        return number > 0;
    }

    public void setName(String name) {
        this.name = name;
    }
}

