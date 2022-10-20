package E10;

import java.util.Scanner;

public class ScoreAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double gpa[][] = new Double[4][2];
        double sum = 0.0;

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 2; j++) {
                System.out.print(i + "학년 " + j + "학기 성적을 입력해주세요.>> ");
                gpa[i - 1][j - 1] = scanner.nextDouble();

                sum += gpa[i - 1][j - 1];
            }
        }

        System.out.println("학점 평균은 " + sum / 8 + "입니다.");
    }
}