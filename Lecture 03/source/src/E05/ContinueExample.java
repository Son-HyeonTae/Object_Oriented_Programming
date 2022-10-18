package E05;

import java.util.Scanner;

public class ContinueExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.print("정수 5개를 입력하세요.: ");

        for (int i = 0; i < 5; i++) {
            int n = scanner.nextInt();

            if (n > 0) {
                sum += n;
            }
            else {
                continue;
            }
        }

        System.out.println("정수들의 합은 " + sum + "입니다.");

        scanner.close();
    }
}