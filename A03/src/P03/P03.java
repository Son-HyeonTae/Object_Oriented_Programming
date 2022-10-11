package P03;

import java.util.Scanner;

class seat {
    String seatTable[] = {"---", "---", "---", "---", "---", "---", "---", "---", "---", "---"};

    void showTable() {
        for (int i = 0; i < seatTable.length; i++) {
            System.out.print(seatTable[i] + " ");
        }
        System.out.println();
    }

    void reserve(String name, int seatNum) {
        if (seatTable[seatNum-1].equals("---")) {
            seatTable[seatNum-1] = name;
        }
        else {
            System.out.println("이미 예약된 자리입니다.");
        }
    }

    void cancel(String name) {
        if (name.equals("---")) {
            System.out.println("잘못된 취소입니다.");
            return;
        }

        for (int i = 0; i < seatTable.length; i++) {
            if (seatTable[i].equals(name)) {
                seatTable[i] = "---";
                break;
            }
            if (i == seatTable.length-1) {
                System.out.println("없는 이름입니다..");
            }
        }
    }
}

public class P03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        seat S = new seat();
        seat A = new seat();
        seat B = new seat();

        System.out.println("명품콘서트홀 예약 시스템입니다.");

        while (true) {
            System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4>>");
            int menu = scanner.nextInt();
            int seatGrade;
            int seatNum;
            String name;

            switch (menu) {
                case 1:
                    System.out.print("좌석구분 S(1), A(2), B(3)>>");
                    seatGrade = scanner.nextInt();

                    switch (seatGrade) {
                        case 1:
                            System.out.print("S>> ");
                            S.showTable();
                            System.out.print("이름>>");
                            name = scanner.next();
                            System.out.print("번호>>");
                            seatNum = scanner.nextInt();
                            S.reserve(name, seatNum);
                            break;

                        case 2:
                            System.out.print("A>> ");
                            A.showTable();
                            System.out.print("이름>>");
                            name = scanner.next();
                            System.out.print("번호>>");
                            seatNum = scanner.nextInt();
                            A.reserve(name, seatNum);
                            break;

                        case 3:
                            System.out.print("B>> ");
                            B.showTable();
                            System.out.print("이름>>");
                            name = scanner.next();
                            System.out.print("번호>>");
                            seatNum = scanner.nextInt();
                            B.reserve(name, seatNum);
                            break;

                        default:
                            System.out.println("입력 오류.");
                    }
                    break;

                case 2:
                    System.out.print("S>> ");
                    S.showTable();
                    System.out.print("A>> ");
                    A.showTable();
                    System.out.print("B>> ");
                    B.showTable();
                    System.out.println("<<<조회를 완료하였습니다.>>>");
                    break;

                case 3:
                    System.out.print("좌석 S(1), A(2), B(3)>>");
                    seatGrade = scanner.nextInt();

                    switch (seatGrade) {
                        case 1:
                            System.out.print("S>> ");
                            S.showTable();
                            System.out.print("이름>>");
                            name = scanner.next();
                            S.cancel(name);
                            break;

                        case 2:
                            System.out.print("A>> ");
                            A.showTable();
                            System.out.print("이름>>");
                            name = scanner.next();
                            A.cancel(name);
                            break;

                        case 3:
                            System.out.print("B>> ");
                            B.showTable();
                            System.out.print("이름>>");
                            name = scanner.next();
                            B.cancel(name);
                            break;

                        default:
                            System.out.println("입력 오류.");
                    }
                    break;

                case 4:
                    System.exit(0);

                default:
                    System.out.println("입력 오류.");
            }
        }
    }
}
