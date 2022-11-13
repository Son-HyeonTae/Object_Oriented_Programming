import java.util.*;

public class P01 {
    public static void main(String[] args) {
        ArrayList gradeArrayList = new ArrayList();
        Scanner scanner = new Scanner(System.in);

        System.out.print("학점 개수 입력 >> ");
        int num = scanner.nextInt();

        System.out.print("학점 " + num + "개 입력 >> ");
        for (int i = 0; i < num; i++) {
            gradeArrayList.add(scanner.next().charAt(0));
        }

        System.out.println();
        System.out.print("학점 : ");
        System.out.println(gradeArrayList);

        for (int i = 0; i < gradeArrayList.size(); i++) {
            if (gradeArrayList.get(i).equals('A')) {
                gradeArrayList.set(i, 4.0);
            } else if (gradeArrayList.get(i).equals('B')) {
                gradeArrayList.set(i, 3.0);
            } else if (gradeArrayList.get(i).equals('C')) {
                gradeArrayList.set(i, 2.0);
            } else if (gradeArrayList.get(i).equals('D')) {
                gradeArrayList.set(i, 1.0);
            } else if (gradeArrayList.get(i).equals('F')) {
                gradeArrayList.set(i, 0.0);
            } else {
                gradeArrayList.set(i, -1);
            }
        }

        System.out.print("점수 : ");
        System.out.println(gradeArrayList);
    }
}