package P16;

import java.util.Scanner;

public class P16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str[] = {"가위", "바위", "보"};
        String command = "";

        System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");

        while(true) {
            // user input
            System.out.print("가위 바위 보!>>");
            command = scanner.next();

            // random
            int n = (int)(Math.random()*3);

            // game end
            if (command.equals("그만")) {
                System.out.println("게임을 종료합니다...");
                break;
            }

            // calculator
            System.out.print("사용자 = " + command + ", 컴퓨터 = " + str[n] + ", ");
            // in case of draw
            if (str[n].equals(command)) {
                System.out.println("비겼습니다.");
            }
            // win or lose
            else {
                if (str[n].equals("가위")) {
                    if (command.equals("바위")) {
                        System.out.println("사용자가 이겼습니다.");
                    }
                    else {
                        System.out.println("컴퓨터가 이겼습니다.");
                    }
                }
                else if (str[n].equals("바위")) {
                    if (command.equals("보")) {
                        System.out.println("사용자가 이겼습니다.");
                    }
                    else {
                        System.out.println("컴퓨터가 이겼습니다.");
                    }
                }
                else { // 보
                    if (command.equals("가위")) {
                        System.out.println("사용자가 이겼습니다.");
                    }
                    else {
                        System.out.println("컴퓨터가 이겼습니다.");
                    }
                }
            }
        }

        scanner.close();
    }
}
