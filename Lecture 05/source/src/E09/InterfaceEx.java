package E09;

import javax.rmi.ssl.SslRMIClientSocketFactory;

interface PhoneInterface {
    final int TIMEOUT = 10000;
    void sendCall();
    void receiveCall();
    default void printLogo() {
        System.out.println("** Phone **");
    }
}

interface MobilePhoneInterface extends PhoneInterface {
    void sendSMS();
    void receiveSMS();
}

interface MP3Interface {
    public void play();
    public void stop();
}

class PDA {
    public int calculate(int x, int y) {
        return x + y;
    }
}

class SmartPhone extends PDA implements MobilePhoneInterface, MP3Interface {
    @Override
    public void sendCall() {
        System.out.println("Ring-Ring-Ring");
    }

    @Override
    public void receiveCall() {
        System.out.println("Incoming phone call");
    }

    @Override
    public void sendSMS() {
        System.out.println("Send a SMS");
    }

    @Override
    public void receiveSMS() {
        System.out.println("Receive a SMS");
    }

    @Override
    public void play() {
        System.out.println("Play music");
    }

    @Override
    public void stop() {
        System.out.println("Stop music");
    }

    public void schedule() {
        System.out.println("manage schedule");
    }
}

public class InterfaceEx {
    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone();
        phone.printLogo();
        phone.sendCall();
        phone.play();
        System.out.println(phone.calculate(3, 5));
        phone.schedule();
        phone.receiveSMS();
    }
}
