package E08;

interface PhoneInterface {
    final int TIMEOUT = 10000;
    void sendCall();
    void receiveCall();
    default void printLogo() {
        System.out.println("** Phone **");
    }
}

class SamsungPhone implements PhoneInterface {
    @Override
    public void sendCall() {
        System.out.println("Ring-Ring-Ring");
    }

    @Override
    public void receiveCall() {
        System.out.println("Incoming phone call");
    }

    public void flash() {
        System.out.println("flash on the phone");
    }
}

public class InterfaceEx {
    public static void main(String[] args) {
        SamsungPhone phone = new SamsungPhone();

    }
}
