package E01;

public class Circle {
    int radius;
    String name;

    public Circle() { }

    public double getArea() {
        return 3.14 * radius * radius;
    }

    public static void main(String[] args) {
        Circle pizza = new Circle();
        pizza.radius = 10;
        pizza.name = "피자";

        double area = pizza.getArea();
        System.out.println(pizza.name + "의 면적은 " + area);

        Circle donut = new Circle();
        donut.radius = 2;
        donut.name = "도넛";

        System.out.println(donut.name + "의 면적은 " + donut.getArea());
    }
}
