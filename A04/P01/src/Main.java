import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList listGrade = new ArrayList();

        System.out.print("5개 학점 입력 >> ");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            listGrade.add(scanner.next());
        }

        System.out.println(listGrade);
    }
}