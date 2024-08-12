package BruteForce;

import java.util.Scanner;

public class Q_1436 {
    
   public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();

    int num =666;
    int count =1;

    while(count !=N){
        num++;

        if(String.valueOf(num).contains("666")){  // 666 이 포함되이있다면 카운트 +1 해라?
            count++;
        }
    }
    System.out.println(num);
   }
    
}
