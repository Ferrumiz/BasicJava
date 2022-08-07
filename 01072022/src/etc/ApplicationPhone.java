package etc;

public class ApplicationPhone {

    public static void main(String[] args) {
        Man alex = new Man ("Alex");
        Phone phone = new Phone();
        phone.setName("Phone");
        alex.makeCall(phone,123456);

        WirelessPhone wirelessPhone = new WirelessPhone();
        wirelessPhone.setName("WirelessPhone");
        WirePhone wirePhone = new WirePhone();
        wirelessPhone.setName("WirePhone");
    }
}
