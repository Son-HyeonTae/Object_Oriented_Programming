package P06;

import java.util.Scanner;

public class P06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // enter a number
        System.out.print("1~99 사이의 정수를 입력하시오>>");
        int n = scanner.nextInt();

        // calculate
        int count = 0;

        if (n/10%3 == 0) {
            count++;
        }
        if (n%10%3 == 0) {
            count++;
        }

        // print the result
        if (count == 2) {
            System.out.println("박수짝짝");
        }
        else if (count == 1) {
            System.out.println("박수짝");
        }
        else {
            System.out.println("3의 배수가 없습니다.");
        }

        scanner.close();
    }
}
