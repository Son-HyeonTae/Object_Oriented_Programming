package E06;

class Weapon {
    protected int fire() {
        return 1;
    }
}

class Cannon extends Weapon {
    @Override
    protected int fire() {
        return 10;
    }
}

public class Overriding {
    public static void main(String[] args) {
        Weapon weapon;
        weapon = new Weapon();
        System.out.println("Weapon fire : damage -" + weapon.fire());

        weapon = new Cannon();
        System.out.println("Cannon fire : damage -" + weapon.fire());
    }
}