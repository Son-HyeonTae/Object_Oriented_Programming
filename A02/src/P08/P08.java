package P08;

import java.util.Scanner;

public class P08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // input integer
        System.out.print("정수 몇개?");
        int n = scanner.nextInt();

        // create array
        int arr[] = new int[n];

        // create random number
        for (int i = 0; i < n; i++) {
            arr[i] = (int)(Math.random()*100)+1;

            // deduplication
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    i--;
                }
            }
        }

        // print result
        for (int i = 1; i <= n; i++) {
            System.out.print(arr[i-1] + " ");

            if (i % 10 == 0) {
                System.out.println();
            }
        }

        scanner.close();
    }
}
