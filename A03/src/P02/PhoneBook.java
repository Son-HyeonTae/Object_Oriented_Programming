package P02;

import java.util.Scanner;

class Phone {
    private String name;
    private String tel;

    Phone(String name, String tel) {
        this.name = name;
        this.tel  = tel;
    }

    public String getName() {
        return name;
    }

    public String getTel() {
        return tel;
    }
}

public class PhoneBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("인원수>>");
        int num = scanner.nextInt();

        Phone phone[] = new Phone[num];

        for (int i = 0; i < phone.length; i++) {
            System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
            String name = scanner.next();
            String tel  = scanner.next();
            phone[i]    = new Phone(name, tel);
        }

        System.out.println("저장되었습니다...");

        System.out.print("검색할 이름>>");
        String searchName = scanner.next();
        while (!(searchName.equals("그만"))) {
            for (int i = 0; i < phone.length; i++) {
                if (searchName.equals(phone[i].getName())) {
                    System.out.println(phone[i].getName() + "의 번호는 " + phone[i].getTel() + "입니다.");
                    break;
                }
                if (i == phone.length-1) {
                    System.out.println(searchName + " 이 없습니다.");
                }
            }
            System.out.print("검색할 이름>>");
            searchName = scanner.next();
        }

        scanner.close();
    }
}
