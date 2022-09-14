package P04;

import java.util.Scanner;

public class P04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mid;

        // enter a number
        System.out.print("정수 3개 입력>>");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        // calculate
        if (num1 >= num2) {
            if (num3 >= num1) {
                mid = num1;
            }
            else if (num2 >= num3) {
                mid = num2;
            }
            else {
                mid = num3;
            }
        }
        else if (num1 > num3) {
            mid = num1;
        }
        else if (num2 > num3) {
            mid = num3;
        }
        else {
            mid = num2;
        }

        // print the result
        System.out.println("중간 값은 " + mid);

        scanner.close();
    }
}
