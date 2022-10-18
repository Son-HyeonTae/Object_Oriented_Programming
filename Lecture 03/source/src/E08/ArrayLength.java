package E08;

import java.util.Scanner;

public class ArrayLength {
    public static void main(String[] args) {
        int num[] = new int[8];
        int sum = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print(num.length + "개의 정수를 입력하세요.: ");
        for (int i = 0; i < num.length; i++) {
            num[i] = scanner.nextInt();
        }
        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }

        System.out.println("정수의 평균은 " + (double)sum / num.length + "입니다.");

        scanner.close();
    }
}
