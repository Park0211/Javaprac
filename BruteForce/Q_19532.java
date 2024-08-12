package BruteForce;

import java.util.Scanner;

public class Q_19532 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();

        //(c*e) - (b*f) = x
        // (a*f) - (c*d) =y

        for(int i = -999; i<= 999; i++){ // x
            for(int j = -999; j <=999 ; j++){ // y
                // ax + by = c
                // dx + ey = f
                // ai + bj = c && di + ej = f
                // x = ?
                // y = ?
                if(a*i + b*j ==c && d*i + e*j ==f){
                    System.out.println(i + " " + j);
                }
            }
        }
    }
}
