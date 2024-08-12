package Sorting;

// import java.util.Scanner;

// public class Q_2750 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int N = sc.nextInt();

//         int[] arr = new int[N];

//         for (int i = 0; i < N; i++) {
//             arr[i] = sc.nextInt();
//         }
    
//         // arr[5] = [5, 3, 4, 2, 1]
//         for (int i = 0; i < N - 1; i++)  {
//             for (int j = i + 1; j < N; j++) {
//                 if (arr[i] > arr[j]) {
//                     int temp = arr[j];
//                     arr[j] = arr[i];
//                     arr[i] = temp;
//                 }
//             }
//         }
//         for(int val : arr){               // 이부분 이해 x!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//         System.out.println(val);
//         }

//     }
// }


import java.util.Scanner;

public class Q_2750{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int [] arr = new int[N];

        for(int i=0; i< N; i++){
            arr[i] =sc.nextInt();
        }
        // [ 5 3 4 2 1 ]
        // 이부분 왜 이렇게 해야하는지 이해가 안감 왜 이중 포문인지????
        for(int i =0; i < arr.length; i++){ // i = 5
            for(int j =i+1; j < arr.length; j++){ // j = 3
                if(arr[i] > arr[j]){
                    int temp =arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;                }
            }
        }

        for(int i=0; i< N; i++){
            System.out.println(arr[i]);
        }

    }
}