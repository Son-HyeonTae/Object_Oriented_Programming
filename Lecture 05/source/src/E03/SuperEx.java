package E03;

class Point {
    int x;
    int y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class ColorPoint extends Point {
    private String color;

    public ColorPoint(int x, int y, String color) {
        super(x, y);
        this.color = color;
    }

    public void showColorPoint() {
        System.out.println(color + "(" + super.x + "," + super.y + ")");
    }
}

public class SuperEx {
    public static void main(String[] args) {
        ColorPoint cp = new ColorPoint(1, 2, "Mint");
        cp.showColorPoint();
    }
}
