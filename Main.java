import java.util.Scanner;
// 1 ~ 11
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M =sc.nextInt();
        int[] bucket = new int[N];
        for (int i=1; i < N+1; i++){
            bucket[i - 1] = i;
        }
        for (int i = 0; i < M; i++) {
            int x = sc.nextInt(); // 1
            int y = sc.nextInt();  // 2
            // [1, 2, 3, 4, 5]
            // temp = 1
            int temp = bucket[x - 1];
            // [1, 2, 3, 4, 5]
            // bucket[y - 1] = 2
            //  bucket[x - 1] = 1
            // [2, 2, 3, 4, 5]
            bucket[x - 1] = bucket[y - 1];
            bucket[y - 1] = temp;
        }

        // [2, 2, 3, 4, 5]
        for (int value : bucket) {
            System.out.print(value + " ");
        }

        // for value in bucket:
        //     print(value, end=" ")
        
        // for (int value1 = 0; value1 < bucket.length; value1++) {
        //     System.out.println(bucket[value1] + " ");
        // }

        // 10813
        /*
            N = 5 
            bucket = [1, 2, 3, 4, 5]
            M = 4
            
            1, 2
            [2, 1, 3, 4, 5]

            3, 4
            [2, 1, 4, 3, 5]

            1, 4
            [3, 1, 4, 2, 5]

            2, 2
            [3, 1, 4, 2, 5]

        */
            
        // int B = sc.nextInt();
        // int C = sc.nextInt();
        // System.out.println((A+B)%C);
        // System.out.println(((A%C) + (B%C))%C);
        // System.out.println((A*B)%C);
        // System.out.println(((A%C) * (B%C))%C);

        // 1330
        // if(A > B) {
        //     System.out.println(">");
        // } else if (A < B) {
        //     System.out.println("<");
        // } else {
        //     System.out.println("==");
        // }
        // sc.close();

        // 2739
        // for (int i = 1; i < 10; i++) {
        //     System.out.println(N + " * " + i + " = " + N*i);
        // }

        // int flag = 1;

        // while (flag < 10) {
        //     System.out.println(N + " * " + flag + " = " + N*flag);
        //     flag++;
        // }

        // 10807
        // [x, x, x, .... ]
        // int[] arr = new int[N];
        // int count = 0;
        // // [1 4 1 2 4 2 4 2 3 4 4 ]
        // for (int i = 0; i < N; i++) {
        //     arr[i] = sc.nextInt();
        // }

        // int v = sc.nextInt();
        // for (int i = 0; i < N; i++) {
        //     if (arr[i] == v) {
        //         count++;
        //     }
        // }
        // System.out.println(count);

        
    }

    
}

