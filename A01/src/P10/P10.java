package P10;

import java.util.Scanner;

public class P10 {
    public static void main(String[] args) {
        // enter coordinate1
        System.out.print("첫번째 원의 중심과 반지름 입력>>");
        Scanner scanner = new Scanner(System.in);
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double r1 = scanner.nextDouble();

        // enter coordinate2
        System.out.print("두번째 원의 중심과 반지름 입력>>");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double r2 = scanner.nextDouble();

        // calculate
        double distanceBetweenTwoPoints = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        double sumOfTwoRadius = r1 + r2;

        // print the result
        if (distanceBetweenTwoPoints < sumOfTwoRadius) {
            System.out.println("두 원은 서로 겹친다.");
        } else {
            System.out.println("두 원은 서로 겹치지 않는다.");
        }

        scanner.close();
    }
}
