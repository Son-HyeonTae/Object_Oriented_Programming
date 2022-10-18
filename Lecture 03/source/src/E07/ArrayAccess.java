package E07;

import java.util.Scanner;

public class ArrayAccess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num[] = new int[5];
        int max = 0;

        System.out.print("양수 5개를 입력하세요.: ");
        for (int i = 0; i < 5; i++) {
            num[i] = scanner.nextInt();
            if (max < num[i]) {
                max = num[i];
            }
        }

        System.out.println("제일　큰　수는　" + max + "입니다．");

        scanner.close();
    }
}
