package OneDimensinalArray;
import java.util.Scanner;

public class Q_5597 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[31];

        //int N = sc.nextInt();

        for(int i= 1; i<=28; i++){
            int student = sc.nextInt();
            arr[student] = 1;

        }

        for(int i = 1; i <= 30; i++){
            if(arr[i] !=1)
                System.out.println(i);
           
        }
    }
}

//  import java.util.Scanner;

//  public class Pmain{
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);
//         int[] arr = new int[30];

//         //int N = sc.nextInt();

//         for(int i= 0; i<28; i++){
//             int student = sc.nextInt();
//             arr[student] =1;

//         }

//         for(int i =1; i < arr.length; i++){
//             if(arr[i] !=1)
//                 System.out.println(i);
           
//         }
//     }
//  }
