package Sorting;

import java.util.Scanner;
import java.util.Arrays;

public class Q_2587 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 5;
        int[] arr = new int[N];
        int sum = 0;

        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            arr[i] = num;
            sum += num;
        }

        System.out.println(sum / N); // average number

        // arr[5] = [5, 3, 4, 2, 1]
        // for (int i = 0; i < N; i++)  {
        //     for (int j = i + 1; j < N; j++) {
        //         if (arr[i] > arr[j]) {
        //             int temp = arr[i];
        //             arr[j] = arr[i];
        //             arr[i] = temp;
        //         }
        //     }
        // }

        Arrays.sort(arr);
        System.out.println(arr[N / 2]);

    }
}

