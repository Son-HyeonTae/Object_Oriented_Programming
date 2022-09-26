package P10;

public class P10 {
    public static void main(String[] args) {
        int position[] = new int[10];

        // create random position
        for (int i = 0; i < 10; i++) {
            position[i] = (int)(Math.random()*16);

            // deduplication
            for (int j = 0; j < i; j++) {
                if (position[i] == position[j]) {
                    i--;
                }
            }
        }

        int arr[] = new int[16];

        // assign random number to position which is random
        for (int i = 0; i < 10; i++) {
            arr[position[i]] = (int)(Math.random()*10+1);
        }

        // print result
        for (int i = 1; i <= 16; i++) {
            System.out.print(arr[i-1] + "\t");

            if (i % 4 == 0) {
                System.out.println();
            }
        }
    }
}
