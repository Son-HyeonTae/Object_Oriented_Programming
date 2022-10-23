package E02;

import java.util.Scanner;

public class Rectangle {
    int width;
    int height;

    public Rectangle() { }

    public int getArea() {
        return width * height;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Rectangle rect = new Rectangle();
        System.out.print("사각형의 폭을 입력하세요.: ");
        rect.width = scanner.nextInt();
        System.out.print("사각형의 높이을 입력하세요.: ");
        rect.height = scanner.nextInt();

        System.out.println("사각형의 넓이는 " + rect.getArea());
    }
}
