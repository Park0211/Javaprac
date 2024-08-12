package BruteForce;

import java.util.Scanner;

// 이해 안됨 ㅠㅠ!!! 
public class Q_2231 {
    public static void main(String[] args){
        // 245 -> 245 + 2 + 4 + 5 = 256
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine();
        // boolean flag = false;

        // for(int i = 0; i <= N; i++){
        //     int a = i;
        //     int sum = a;
        //     while(a != 0){
        //         sum += a % 10;
        //         a = a / 10;
        //     }

        //     if( sum == N){
        //         System.out.println(i);
        //         return;
        //     }
        // }
        // if(!flag) {
        //     System.out.println(0);
        // }

        // 245 -> 245 + 2 + 4 + 5 = 256

        int result = 0;

        for (int i = 1; i <= N; i++) {
            int num = i;
            int sum = 0;

            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            if (sum + i == N) {
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
    
}
