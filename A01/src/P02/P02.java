package P02;

import java.util.Scanner;

public class P02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // enter a number
        System.out.print("2자리수 정수 입력(10~99)>>");
        int n = scanner.nextInt();

        // print the result
        if (n/10 == n%10) {
            System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
        }
        else {
            System.out.println("No! 10의 자리와 1의 자리가 같지 않습니다.");
        }

        scanner.close();
    }
}
