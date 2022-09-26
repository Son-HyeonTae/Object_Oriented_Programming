package P08_1;

import java.util.Scanner;

public class P08_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long RRN; // Resident Registration number
        long encryptionNum = 1548324815537l;
        long temp = 0l;

        while (true) {
            // print and select menu
            System.out.println("메뉴] 1. 주민번호입력, 2. 복호화, 3. 종료");
            System.out.print("메뉴를 선택> ");
            int n = scanner.nextInt();

            // menu no1 - encryption
            if (n == 1) {
                System.out.print("주민번호를 입력> ");
                RRN = scanner.nextLong();

                temp = RRN ^ encryptionNum;

                System.out.println("암호화된 주민번호 : " + temp);
            }

            // menu no2 - decryption
            if (n == 2) {
                temp = temp ^ encryptionNum;

                System.out.println(("복호화된 주민번호 : " + temp));
            }

            // menu no3 - shutdown
            if (n == 3) {
                System.out.println("프로그램을 종료.");
                break;
            }
        }
    }
}
