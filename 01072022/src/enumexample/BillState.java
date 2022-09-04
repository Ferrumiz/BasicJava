package enumexample;

public enum BillState {
    PAID("This is a paid bill"),
    UNPAID("This is an unpaid bill"),
    WAITED("This is a waited bill");

    private String desc;

    BillState(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }
}
