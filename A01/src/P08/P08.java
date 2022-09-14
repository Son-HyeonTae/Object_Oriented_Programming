package P08;

import java.util.Scanner;

public class P08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // enter coordinate1
        System.out.print("점1(x1, y1)의 좌표를 입력하시오>>");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();

        // enter coordinate2
        System.out.print("점2(x2, y2)의 좌표를 입력하시오>>");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        // print the result
        if (((100<=x1)&&(x1<=200)||(100<=x2)&&(x2<=200))
          & ((100<=y1)&&(y1<=200)||(100<=y2)&&(y2<=200))) {
            System.out.println("두 직사각형은 충돌합니다.");
        }
        else {
            System.out.println("두 직사각형은 충돌하지 않습니다.");
        }

        scanner.close();
    }
}
