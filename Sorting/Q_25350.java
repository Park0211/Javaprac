package Sorting;

// import java.util.Scanner;
// import java.util.Arrays;

// public class Q_25305 {
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         int A =sc.nextInt();
//         int B =sc.nextInt();

//         int arr[] = new int[A];

//         for(int i =0; i< arr.length; i++ ){
//             arr[i] = sc.nextInt();
//         }

//         Arrays.sort(arr);
//         int s = arr[arr.length -B];
//         System.out.println(s);

//     }
    
// }


// import java.util.Scanner;
// import java.util.Arrays;

// public class Q_25305 {
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);
//         int scoreCount = sc.nextInt(); // 점수 갯수 입력받기
//         int cutofScore = sc.nextInt(); // 커트라인 숫자 입력
//         int score[] = new int[scoreCount]; // 점수 담을 배열

//         for(int i =0; i < scoreCount; i++){
//             score[i] = sc.nextInt(); // 배열에 점수 입력
//         }

//         Arrays.sort(score); // 오름차순 정렬

//         System.out.println(score[scoreCount - cutofScore]);   // 오름차순 정렬이므로, 전체 배열 갯수에서 순서만큼을 뺀 숫자를 배열 번지수로 넣는다.
//     }
// }


import java.util.Scanner;
import java.util.Arrays;

public class Q_25350{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int k = sc.nextInt();

        int arr[] = new int[N];

        for(int i=0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        int s = arr[arr.length - k];
        System.out.println(s);
    }
}