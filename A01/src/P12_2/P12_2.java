package P12_2;

import java.util.Scanner;

public class P12_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int answer = 0;

        // enter a expression
        System.out.print("연산>>");
        int num1 = scanner.nextInt();
        String operator = scanner.next();
        int num2 = scanner.nextInt();

        // calculate
        switch(operator) {
            case "+" :
                answer = num1 + num2;
                break;
            case "-" :
                answer = num1 - num2;
                break;
            case "*" :
                answer = num1 * num2;
                break;
            case "/" :
                if (num1 == 0 || num2 == 0) {
                    System.out.println("0으로 나눌 수 없습니다.");
                    System.exit(0);
                }
                else {
                    answer = num1 / num2;
                }
                break;
        }

        // print the result
        System.out.println(num1+operator+num2+"의 계산 결과는 "+answer);

        scanner.close();
    }
}
