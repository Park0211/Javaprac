package BruteForce;

import java.util.Scanner;

public class Q_2798 {
    public static void main(String[] args) {
      // FOR LOOP , BFS, DFS
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // number of cards
        int M = sc.nextInt(); // max number

        int[] arr = new int[N]; // card number

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int res = 0;

        for (int i = 0; i < N - 2; i++) {
            for (int j = i + 1; j < N - 1; j++) {
                for (int k = j + 1; k < N; k++) {
                    int sum = arr[i] + arr[j] + arr[k];
                    if (sum <= M && sum > res) {
                        res = sum;
                    }
                }
            }
        }
        System.out.println(res);
        sc.close();
    }
}

