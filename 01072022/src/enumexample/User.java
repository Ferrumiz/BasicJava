package enumexample;

public class User {

    private UserState state;

    public User(UserState active) {

    }

    public void setState(UserState state) {
        this.state = state;
    }

    public UserState getState() {
        return state;
    }
}
