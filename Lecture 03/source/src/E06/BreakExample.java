package E06;

import java.util.Scanner;

public class BreakExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("exit가 입력되면 종료됩니다.");
        while (true) {
            System.out.print(">> ");
            String input = scanner.next();

            if (input.equals("exit")) {
                break;
            }
        }

        scanner.close();
    }
}
