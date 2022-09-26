package P04;

import java.util.Scanner;

public class P04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // enter a lowercase alphabet
        System.out.print("소문자 알파벳 하나를 입력하시오>>");
        char a = scanner.next().charAt(0);
        while (a >= 97) {
            for (int i = 97; i <= (int)a; i++) {
                System.out.print((char)i);
            }
            a -= 1;
            System.out.println();
        }
    }
}
