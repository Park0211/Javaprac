// import java.util.Scanner;

// public class Pmain {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int A = sc.nextInt();
//         int B = sc.nextInt();

//         System.out.println(A - B);

//         sc.close();
//     }
// }


// A-B problem
// import java.util.Scanner;

// public class Pmain{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         int A = sc.nextInt();
//         int B = sc.nextInt();

//         System.out.println(A - B);

//         sc.close();

//     }
// }


// A*B prob
// import java.util.Scanner;

// public class Pmain{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         int A = sc.nextInt();
//         int B = sc.nextInt();

//         System.out.println(A * B);

//         sc.close();
//     }
// }

// A/B prob
// import java.util.Scanner ;

// public class Pmain{
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         double A = sc.nextInt();
//         double B = sc.nextInt();

//         System.out.println(A/B);

//         sc.close();

//     }
// }



// 사칙연산 문제
// import java.util.Scanner;

// public class Pmain{
//     public static void main(String[] args){

//         Scanner sc =new Scanner(System.in);

//         int A = sc.nextInt();
//         int B = sc.nextInt();

//         System.out.println(A + B);
//         System.out.println(A - B);
//         System.out.println(A *B);
//         System.out.println(A /B);
//         System.out.println(A % B);

//         sc.close();

//     }
// }


// (??!) prob

// import java.util.Scanner;

// public class Pamin{
//     public static void main(String[] args){

//         Scanner sc =new Scanner(System.in);

//         String A = sc.next();

//         System.out.println(A + "??!");

//         sc.close();
//     }
// }


// tailand year prob
// import java.util.Scanner;

// public class Pmain{
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         int Y = sc.nextInt();

//         System.out.println(Y -543);

//         sc.close();
//     }
// }


// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int A = sc.nextInt();
//         int B = sc.nextInt();
//         int C = sc.nextInt();
//         System.out.println((A+B)%C);
//         System.out.println(((A%C) + (B%C))%C);
//         System.out.println((A*B)%C);
//         System.out.println(((A%C) * (B%C))%C);


//         sc.close();
//     }
// }

// import java.util.Scanner;

// public class Pmain{
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         int A = sc.nextInt();
//         int B = sc.nextInt();
//         int C = sc.nextInt();

//         System.out.println((A+B)%C);
//         System.out.println(((A%C) + (B%C))%C);
//         System.out.println((A*B)%C);
//         System.out.println(((A%C) * (B%C))%C);

//         sc.close();
//     }
// }

// import java.util.Scanner;

// public class Pmain{
//     public static void main(String[] args){

//         Scanner sc =new Scanner(System.in);

//         int A = sc.nextInt();
//         int B = sc.nextInt();

//         System.out.println(A * (B%10));
//         System.out.println(A * ((B%100)/ 10));   // 만약 여기서 385 - 377 하면 8 인데 그렇게 구하면 안되는건지???
//         System.out.println(A * (B/100));
//         System.out.println(A * B);

//         sc.close();  // 이건 왜하는건지 안넣어도 답이 맞음.
//     }
// }

//꼬마정민

// import java.util.Scanner;

// public class Pmain{
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         int A = sc.nextInt();
//         int B = sc.nextInt();
//         int C = sc.nextInt();

//         System.out.println(A + B + C);

//         sc.close();
//     }
// }



// import java.util.Scanner;

// public class Pmain{
//     public static void main(String[] args){

//         Scanner sc =new Scanner(System.in);

//         int A =sc.nextInt();
//         int B =sc.nextInt();

//         if(A > B){
//             System.out.println(">");
//         }
//         else if(A <B){
//             System.out.println("<");
//         }
//         else{
//             System.out.println("==");
//         }

//         sc.close();
//     }
// }

// import java.util.Scanner;

// public class Pmain{
//     public static void main(String[] args){

//         Scanner sc =new Scanner(System.in);

//         int num = sc.nextInt();

//         if( num <= 100 && num >=90 ){
//             System.out.println("A");
//         }
//         else if( num <=89 && num>=80){
//             System.out.println("B");
//         }

//         else if( num <=79 && num>= 70){
//             System.out.println("C");
//         }
        
//         else if(num <=69 && num>=60){
//             System.out.println("D");
//         }
//         else{
//             System.out.println("F");
//         }

//         sc.close();

//     }
// }


//윤년 
// import java.util.Scanner;

// public class Pmain{
//     public static void main(String[] args){

//         Scanner sc =new Scanner(System.in);

//         int year =sc.nextInt();

//         if(year % 4 ==0 && year %100 !=0 ){
//             System.out.println(1);
//         } 
//         else{
//             System.out.println(0);
//         }
//     }
// }

// import java.util.Scanner;

// public class Pmain{
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         int X = sc.nextInt();
//         int Y = sc.nextInt();

//         if(X > 0){
//             if(Y >0){
//                 System.out.println(1);
//             }
//             else{
//                 System.out.println(4);
//             }  
//         }
//        else{
//             if( Y>0){
//                 System.out.println(2);
//             }
//             else{
//                 System.out.println(3);
//             }
//        } 
//         sc.close();
//     }

// }


// import java.util.Scanner;

// public class Pmain{
//     public static void main(String[] args){

//         Scanner sc =new Scanner(System.in);

//         int H = sc.nextInt();
//         int M = sc.nextInt();

//         if(M < 45){
//             H = H -1;
//             M = 60-
//         }
//     }
// }


// import java.util.Scanner;

// public class Pmain{
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         String S = sc.next();
//         int i = sc.nextInt();

//         System.out.println(S.charAt(i-1));  
        
//         sc.close();
//     }
// }

// import java.util.Scanner;

// public class Pmain{
//     public static void main(String[] args){

//         Scanner sc =new Scanner(System.in);

//         String S = sc.next();
//         System.out.println(S.length());

//         sc.close();
//     }
// }


// public class Pmain {
//     public static void main(String[] args) {
//       System.out.println("Hello world!");
//       Scanner sc = new Scanner(System.in);
//       int n = sc.nextInt();
  
//       for (int i = 0; i < n; i++) {
//         String s = sc.next();
//         System.out.println(s.charAt(0) + s.charAt(s.length() - 1));
//       }
//     }
// }

// if statement 오븐 시계 

// import java.util.Scanner;

// public class Pmain{
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);
        
//         int A = sc.nextInt();  // 시간
//         int B = sc.nextInt();   // 분
//         int C = sc.nextInt();    //타이머 

//         if(C >= 60){
//             A = A + C / 60;
//             B = B + C % 60;
//         }else{
//             B = B + C ;
//         }

//         if(B >= 60){
//             B = B - 60;
//             A = A + 1;
//         }

//         if(A >= 24){
//             A = A -24;
//         }

//         System.out.println(A + " " + B);

//         sc.close();
//     }
// }

//주사위 세개

// import java.util.Scanner;

// public class Pmain{
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         int A = sc.nextInt();
//         int B = sc.nextInt();
//         int C = sc.nextInt();
//         // 전체가 다 같을 때
//         if(A == B && B == C){
//             System.out.println( 10000 + A *1000);
//         }
//         // 두개 만 같을때
//         else if(A ==B){
//             System.out.println(1000 + A *100); 
//         }
//         else if( A==C){
//             System.out.println(1000+ A*100);
//         }
//         else if(B == C){
//             System.out.println(1000+ B*100);
//         }

//         // 모든 수가 다 다를때
//         else{
//             if(A>B){
//                 if(A>C){
//                     System.out.println(A * 100);
//                 }else{
//                     System.out.println(C * 100);
//                 }
//             }else if(B >A){
//                 if(B > C){
//                     System.out.println(B * 100);
//                 }else{
//                     System.out.println(C * 100);
//                 }
//             }else if(C> A){
//                 if(C > B){
//                     System.out.println(C *100);
//                 }else{
//                     System.out.println(B *100);
//                 }
//             }
//         }
//     }
// }

// import java.util.Scanner;

// public class Pmain{
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         int A = sc.nextInt();
//         int B = sc.nextInt();
//         int C = sc.nextInt();

//         if(A == B && B == C && A ==C ){
//             System.out.println(10000 + A * 1000);
//         }
//         else if(A == B){
//             System.out.println(1000+ A *100);
//         }
//         else if(B == C){
//             System.out.println(1000 + B *100);
//         }
//         else if( A == C){
//             System.out.println(1000 + C *100);
//         }
//         else{
//             if(A > B){
//                 if(A > C){
//                     System.out.println( A * 100);
//                 }else{
//                     System.out.println(C * 100);
//                 }
//             }
//             else if(B > A){
//                 if(B > C){
//                     System.out.println(B * 100);
//                 }else{
//                     System.out.println(C * 100);
//                 }
//             }
//             else if(C > A){
//                 if(C >B){
//                     System.out.println(C * 100);
//                 }else{
//                     System.out.println(B * 100);
//                 }
//             }
//         }
//     }
// }

// 반복문 구구단

// import java.util.Scanner;

// public class Pmain{
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         int A = sc.nextInt();

//         for (int i =1 ; i < 10; i++){
//             System.out.println(A +"*" +i +"=" + A *i);
//         }
//     }
// }


//A +B -3 

// import java.util.Scanner;

// public class Pmain{
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         int num = sc.nextInt();

//         for(int i =0 ; i< num; i++){
//             int A = sc.nextInt();
//             int B = sc.nextInt();
//             //int result =A +B ;

//             System.out.println(A + B);
//         }
//     }
// }

//합
// import java.util.Scanner;

// public class Pmain{
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         int sum = 0;

//         for(int i = 1; i <= n; i++){
//              sum += i;
//         }
//         System.out.println(sum);
//     }
// }

// import java.util.Scanner;

// public class Pmain{
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         int sum =0;

//         for(int i = 1 ; i <= n; i++){
//             sum += i;
//         }
//         System.out.println(sum);  // 왜 포문 안에 브라켓 에 서 출력하면 답이 안나오는지???????
//     }
// }

//영수증 

// import java.util.Scanner;

// public class Pmain{
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         int X = sc.nextInt();
//         int N = sc.nextInt();
//         int sum =0;
        
//         for(int i= 0; i <=N; i++ ){
//             int a = sc.nextInt();
//             int b = sc.nextInt();

//              sum = sum + a * b;
//         }
//         if( X == sum){
//             System.out.println("Yes");

//         }else{
//             System.out.println("No");
//         }
//     }
// }

// 다시 풀기 ----출력 오류


// 코딩은 체육 과목이다

// import java.util.Scanner;

// public class Pmain{
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);
        
//         int n = sc.nextInt();

//         for(int i =0; i< n/4; i++){  // 이거 분석 이 이해안됨. 어떻게 롱이 출력 되는지????????????????????????????????????????????
//             System.out.println("long");
//         }
//         System.out.println("int");
//     }
// }

// 빠른 A + B

// bufferedWriter 어떻게 쓰는지 모르겠음.


//A+B -7

// import java.util.Scanner;

// public class Pmain{
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         int T = sc.nextInt();

//         for(int i =0; i < T; i++){
            

//             int A = sc.nextInt();
//             int B = sc.nextInt();
//             System.out.println("Case #" + (i+1)+":" + (A+B));
//         }
//     }
// }


//A +B -8

// import java.util.Scanner;

// public class Pmain{
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         int T = sc.nextInt();

//         for(int i =0; i< T; i++){

//             int A = sc.nextInt();
//             int B = sc.nextInt();

//             System.out.println("Case #" + (i+1) + ": " +  (A+ " + "+ B) +" = "+ (A+B) );
//         }
//     }
// }

// 별찍기 -1

// import java.util.Scanner;

// public class Pmain{
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         int N = sc.nextInt();

//         for(int i= 1; i<= N; i++ ){
//             for(int j =1; j <= i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();

//     }

//     }
// }

// import java.util.Scanner;

// public class Pmain{
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);
        
//         int N = sc.nextInt();

//         for(int i =1; i <= N; i++){     // i =1 , i =2 , i=3    ,i =4      ,i=5
//             for(int j =0; j < i; j++){  // j= 0 , j=1  , j =1,2 , j= 1,2,3 , j=1,2,3,4
//                 // System.out.print("*");
//             }
//             System.out.println(i);       // 줄바꿈 , 줄바꿈----------------------------------
//         }
//     }
// }

//ex
//***** 
// ****
//  ***
//   **
//    *

// import java.util.Scanner;

// public class Pmain{
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         int N = sc.nextInt();

//         for(int i=0; i< N; i++){
//             for(int j =0; j<i ;j++){    // 스페이스 
//                 System.out.print(" ");
//             }

//             for(int j=N; j>i; j--){      // star
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
        
//     }
// }

//별 찍기 -2

// import java.util.Scanner;

// public class Pmain{
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         int N = sc.nextInt();
        
        
//         for(int i =0; i< N ; i++){
//             for(int j =0; j < N-(i+1); j++){
//                 System.out.print(" ");
//             }
//             for(int j =0; j < i+1; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
//     }

//별 찍기 -2 다시연습
// import java.util.Scanner;

// public class Pmain{
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         int N =sc.nextInt();

//         for(int i = 0; i < N; i++){
//             for(int j= 0; j < N-(i+1); j++){
//                 System.out.print(" ");
//             }

//             for(int j = 0; j< i+1; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

//A + B -5

// import java.util.Scanner;

// public class Pmain{
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

        
//         while(true){
        
//         int A = sc.nextInt();
//         int B = sc.nextInt();
        
//         if( A ==0 && B ==0){

//             break;
//         }
//         System.out.println(A+B);
//         }
//     }
// }

//A +B -4   /// 답체크!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

// import java.util.Scanner;

// public class Pmain{
//     public static void main(String[] args){

//     Scanner sc= new Scanner(System.in);

//     while(true){
//         int A = sc.nextInt();
//         int B = sc.nextInt();

//         if(A<0 || B>=10){
//             break;
//         }

//         System.out.println(A + B);
//     }
//     sc.close();
    
//     }
// }

//--------------------------------------------------------------------------------------------------------------
//1 차원 배열
// 개수 세기

// import java.util.Scanner;

// public class Pmain{
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         int N = sc.nextInt();

//         int[] arr = new int[N];
//         int count = 0;

//         for(int i = 0; i < N; i++){
//             arr[i] =sc.nextInt();
//         }

//         int v = sc.nextInt();
//         for(int i =0; i < N ;i++){
//             if(arr[i]== v){
//                 count++;
//             }
//         }
//         System.out.println(count);
//     }
// }



//X 보다 작은수
// import java.util.Scanner;

// public class Pmain{
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         int N = sc.nextInt();

//         int [] arr =  new int [N];
//         int X = sc.nextInt();

//         int result = [];  
        
//         for(int i =0; i<N; i++){
//             arr[i]= sc.nextInt();

//             if(X >arr[i]){
//                 result += [i];

//             }

//         }
//         System.out.println(result);

//     }
// }

// import java.util.Scanner;

// public class Pmain{
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         int N = sc.nextInt();
//         int X = sc.nextInt();
//         int[] arr = new int[N];

//         for(int i =0; i <N; i++){
//             arr[i] =sc.nextInt();
//         }

//         for(int i =0; i<N; i++){
//             if(arr[i]<X){
//                 System.out.println(arr[i]+" ");
//             }
//         }

//     }
// }


///다시 풀어보기!!!!
// import java.util.Scanner;

// public class Pmain{
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         int N = sc.nextInt();
//         int X = sc.nextInt();

//         int[] arr = new int[N];
        
//         for(int i=0; i< N; i++){
//              arr[i]= sc.nextInt();
//         }

//         for(int i=0; i< N; i++){
//             if(X > arr[i]){
//                 System.out.println(arr[i] +" ");
//             }
//         }
//     }
// }


// 최소, 최대   ---------------한번더 풀어보기!!! 그리고 답체크 하기

// import java.util.Scanner;

// public class Pmain{
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         int N = sc.nextInt();
//         int [] arr = new int[N];

//         for(int i= 0; i < N; i++){
//             arr[i] =sc.nextInt();
//         }

//         int Min = arr[0];

//         for(int i=0; i< N;i++){
//             if(Min >arr[i]){
//                 Min = arr[i];
//             }
//         }

//         System.out.println(Min);

//         int Max = arr[0];

//         for(int i =0; i< N; i++){
//             if(Max < arr[i]){
//                 Max =arr[i];
//             }
//         }
//         System.out.println(Max);
//     }
// }

//최댓값  ------한번더 풀어보기

// import java.util.Scanner;

// public class Pmain{
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         // int N = sc.nextInt();
//         int[] arr = new int[9];

//         int count =0;
//         int Max =arr[0];

//         for(int i=0; i< arr.length; i++){

//             arr[i]=sc.nextInt();
//             if(Max < arr[i]){
//                 Max = arr[i]; 
//             }

//         }
//         System.out.println(Max);

//         for(int i =0; i< arr.length; i++){
//             if(Max != arr[i]){
//                 count++;
//             }
//         }
//         System.out.println(count);


//     }
// }

//공 넣기 ==================문제가 이해가 안감! (출력값이 왜 1 2 1 1 0) 인지 이해가 안됨 ********************************************************

// import java.util.Scanner;

// public class Pmain{
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         int N = sc.nextInt();
//         int M = sc.nextInt();

//     }
// }

//공 바꾸기 ! -------------다시 풀어 보기

// import java.util.Scanner;

// public class Pmain{
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         int N = sc.nextInt();
//         int M = sc.nextInt();
//         int [] bucket = new int[N];

//         for(int i =1; i< N+1; i++){
//             bucket[i-1] = i;
//         }
//         for(int i =0; i< M; i++){
//             int x = sc.nextInt();    //1
//             int y = sc.nextInt();    //2
//             //[1, 2, 3, 4, 5]
//             //temp =1

//             int temp = bucket[x - 1];
//             //[1, 2, 3, 4, 5]
//             //bucket[y - 1] =2
//             //bucket[x - 1] = 1
//             //[2, 2, 3, 4, 5]

//             bucket[x - 1] = bucket[y -1];
//             bucket[y -1] = temp;
//         }

//         //[2, 2, 3, 4, 5]
//         for(int value : bucket) {   // 여기 뜻이 이해안감!!!
//             System.out.print(value + " ");   // value 값을 어디서 가지고 온건지??? 위에 value 가 없는데;;;;
//         }

//     }
// }

/*
N = 5    1  2  3  4  5
bucket= [1, 2, 3, 4, 5]
M = 4

1, 2
[2, 1, 3, 4, 5]

3, 4
[2, 1, 4, 3, 5]

1, 4
[3, 1, 4, 2, 5]

2, 2   숫자가 똑같기 때문에 바꿀 필요없음
[3, 1 ,4, 2, 5]


이해 완료!
 */

// 1+1
// how to add two numbers in java


 //과제 안 내신 분 ..?   설명이 필요함.........................

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


// 나머지

// import java.util.Scanner;

// public class Pmain{
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         int count =0 ;

//         for(int i=0; i<= 10; i++){
//             i = sc.nextInt();
//             i = i % 42;
//         }

//         int num =0;


//         for(int i=0; i< 10; i++){
//             if((i % 42) != num ){
//                 count++;
//             }
//         } 
        
//     }
// }

// import java.util.Arrays;
// import java.util.Scanner;

// public class Pmain{
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);
//         int[] arr = new int[10];

//         int count =0;
//         int num = -1;

//         for(int i =0; i< arr.length; i++){
//             arr[i] = sc.nextInt() % 42;
//         }

//         Arrays.sort(arr); // 이 부분 설명 필요 **********************************************************************************************************

//         for(int i =0; i < arr.length; i++){
//             if(num !=arr[i]){
//                 num = arr[i];
//                 count ++;
//             }
//         }
//         System.out.println(count);
//     }
// }

// import java.util.Arrays;
// import java.util.Scanner;

// public class Pmain{
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         int[] arr = new int[10];

//         int count =0;
//         int num = -1;
//         // int remain = num % 42;

//         for(int i =0; i< 10; i++){
//             arr[i] = sc.nextInt();
//             arr[i] =arr[i]% 42;
//         }

//         Arrays.sort(arr);

//         for(int i =0; i<10; i++){
//             if(num != arr[i]){
//                 num = arr[i];
//                 count ++;

//                 // if(remain ==arr[i]){
//                 //     count--;
//                 // }
//                 // if(arr[i] == num && arr[i]%42== num){    //~~~~~~~~~~~~~~ 값이 중복되면은 하나를 빼준다
//                 //     count--;
//                 // }

//             }

//             }
       

//         System.out.println(count);
//     }
// }

// 문자열 문제들

// 문자와 문자열

// import java.util.Scanner;

// public class Pmain{
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         String S = sc.next();
//         int i = sc.nextInt();

//         System.out.println(S.charAt(i-1));
//     }
// }


//단어 길이 재기
// import java.util.Scanner;

// public class Pmain{
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         String s = sc.next();

//         System.out.println(s.length());

//         sc.close();
//     }
// }


// 문자열
// import java.util.Scanner;

// public class Pmain{
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         int T = sc.nextInt();
        
//         String[] arr = new String[T];


//         for(int i =0; i < T; i++){
//             arr[i]= sc.next();
//         }

//         for(int i =0; i < T; i++){
//             System.out.println( arr[i].charAt(0) );           // 왜 이거를 + 로 합쳐서 넣으면 계산이 안되는지????????
//             System.out.println(arr[i].charAt(arr[i].length()-1));
//         }

//     }
// }

// import java.util.Scanner;

// public class Pmain{
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         int T = sc.nextInt();
//         String [] arr = new String[T];

//         for(int i=0; i < T; i++){
//             arr[i] =sc.next();
//         }

//         for(int i=0; i < T; i++){
//             System.out.println(arr[i].charAt(0));
//             System.out.println(arr[i].charAt(arr[i].length()-1));
//         }

//     }

// }


//아스키 코드
// import java.util.Scanner;

// public class Pmain{
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         int n = sc.next().charAt(0);

//         System.out.println(n);
//     }
// }


// import java.util.Scanner;

// public class Pmain{
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         int n = sc.next().charAt(0);

//         System.out.println(n);
//     }
// }

// 숫자의합

// import java.util.Scanner;

// public class Pmain{
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         String number = sc.next();
       
//         int sum =0;

//         for(int i=0; i< n; i++){
//             sum += number.charAt(i)-'0';
//         }

//         System.out.println(sum);
//     }
// }

// import java.util.Scanner;

// public class Pmain{
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         int N = sc.nextInt();
//         String number = sc.next();

//         int sum =0;

//         for(int i=0; i < N; i++){
//             sum += number.charAt(i) -'0';
//         }

//         System.out.println(sum);
//     }
// }

//알파벳 찾기

// import java.util.Scanner;

// public class Pmain{
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         String S = sc.next();


//         for(char c ='a'; c<= 'z'; c++){
//             System.out.print(S.indexOf(c) + " ");   // 인댁스 오브 특정 문자 위치를 찾는 것
//         }

//             }
//         }


// import java.util.Scanner;

// public class Pmain{
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         String S = sc.next();

//         for(char c='a'; c <='z'; c++){
//             System.out.print(S.indexOf(c) + " ");
//         }
//     }
// }


//문자열 반복
// import java.util.Scanner;

// public class Pmain{
//     public static void main(String[] args){

//         Scanner sc =new Scanner(System.in);

//         int T =sc.nextInt();


//         for(int i=0; i< T; i++){
//             int R =sc.nextInt();
//             String S = sc.next();

//             for(int j =0; j< S.length(); j++){

//                 for(int k =0; k < R; k++){
//                     System.out.print(S.charAt(j));
//                 }
//             }
//             System.out.println();
//         }
//     }
// }


// import java.util.Scanner;

// public class Pmain{
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         int T = sc.nextInt();

//         for(int i =0; i< T; i++){
            
//             int R =sc.nextInt();
//             String S = sc.next();

//             for(int j =0; j< S.length(); j++){

//                 for(int k =0; k < R; k++){

//                     System.out.print(S.charAt(j));
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

//단어의 개수
// ---------------------------오답--------------------------------------------
// import java.util.Scanner;

// public class Pmain{
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         String S = sc.next();
//         int count =0;

//         for(int i =0; i< S.length(); i++){
//             if(i ==" "){
//                 count ++;
//             }
//         }
//         System.out.println(count);
//     }
// }


// import java.util.Scanner;

// public class Pmain{
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         String S = sc.nextLine().trim();   // next() 와 nextLine() 차이점인 무언인지 확인!!!!!!!!!!!!!!!!!!!! //  트림을 이용 하여 문자열 앞뒤 공백 제거.
        
//         if(S.isEmpty()){   // 입력 된 문자열이 공백인 경우    //       isEmpty() 뜻 확인!!!!!!!!
//             System.out.println(0);

//         } else{
//             String[] words = S.split(" "); // split 을 이용하여 공백을 기준으로 문자열 분리
//             System.out.println(words.length);  // 분리된 단어의 갯수 출력
//         }
//         sc.close();
//     }
// }

//상수 

// import java.util.Scanner;

// public class Pmain{
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         String A = sc.next();
//         String B = sc.next();

//         String [] arr = new String[2];  // 거꾸로 저장할 배열
        
//         arr[0] ="";   // 배열 초기화
//         arr[1] ="";   // 배열 초기화

//         for(int i =1; i <4; i++){              // 입력 값을 거꾸로 해서 arr 배열에 저장
//             arr[0] += A.charAt(A.length() -i);
//         }

//         for(int i =1; i< 4; i++){
//             arr[1] += B.charAt(B.length() -i);
//         }

//         // 배열에 저장된 값을 int 형으로 바꾸어줌
//         int A2 = Integer.parseInt(arr[0]);
//         int B2 = Integer.parseInt(arr[1]);

//         // 비교해서 큰값 출력
//         if(A2 > B2){
//             System.out.println(A2);
//         }else{
//             System.out.println(B2);
//         }
       
        
//     }
// }

//새싹----문제 이상함

//킹,퀸, 룩, 비숖, 나이트, 폰

// import java.util.Scanner;

// public class Pmain{
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         int arr1 [] = {1, 1, 2, 2, 2, 8};
//         int arr2 [] = new int[6];

//         for(int i =0; i < arr2.length; i++ ){
//             arr2[i] = sc.nextInt();
//             System.out.print(arr1[i] - arr2[i] + " ");
//         }
//         sc.close();
//     }
// }

// 별 찍기-7

// import java.util.Scanner;

// public class Pmain{

//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         int N =sc.nextInt();

//         for(int i =0; i<= N; i++){
//             for(int j =1; j <= N-i; j++){
//                 System.out.println(" ");
//             }
//             for(int k =1; k <=(2*i)-1; k++){
//                 System.out.println("*");
//             }
//         }
//     }
// }


// 팰린드롬

// import java.util.Scanner;

// public class Pmain{
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         String Word = sc.next();

//         int ans = 1;

//         for(int i =0; i < Word.length(); i++ ){
//             if(Word.charAt(i) != Word.charAt(Word.length() -i -1)) {
//                 ans =0;
//             }
//         }
//         System.out.println(ans);
//     }
// }


// import java.util.Scanner;

// public class Pmain{
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         String Word = sc.next();

//         int ans =1;
//         for(int i =0; i < Word.length(); i++){
//             if(Word.charAt(i) != Word.charAt(Word.length()-i-1)){
//                 ans =0;
//             }
//         }
//         System.out.println(ans);
//     }
// }


//단어 공부 #1157
//설명 필요
// import java.util.Scanner;

// public class Pmain{
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         String Word = sc.next();
//         int[] arr = new int[26]; // 영문자 개수 26
        
//         for(int i =0; i < Word.length(); i++){
//             if('A' <= Word.charAt(i) && Word.charAt(i) <='Z'){ //대문자 범위
//                 arr[Word.charAt(i) -'A']++;  // 해당 인덱스의 값 1 증가
//             }
//             else{ // 소문자 범위
//                 arr[Word.charAt(i)- 'a']++;
//             }
//         }

//         int max = -1;
//         char ch = '?';

//         for(int i =0; i < 26; i++) {
//             if(arr[i] > max) {
//                 max = arr[i];
//                 ch = (char) (i + 65);// 대문자 출력함으로 65 를 더해줌
//             }
//             else if (arr[i] == max){
//                 ch = '?';
//             }
//         }
//         System.out.println(ch);
//     }
// }

//크로아티아 알파벳------------------------------- 설명 필요

// 2차원 배열

//행렬 덧셈

// import java.util.Scanner;

// public class Pmain{
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         int m = sc.nextInt();

//         int[][] arr = new int[n][m];
//         int[][] arr1 = new int[n][m];

//         for(int i =0; i < n; i++){
//             for(int j =0; j <m; j++){
//                 arr[i][j] = sc.nextInt();
//             }
//         }

//         for(int i =0; i <n; i++){
//             for(int j =0; j < m; j++){
//                 arr1[i][j] = sc.nextInt();
//             }
//         }

//         for(int i =0; i < n; i++){
//             for(int j =0; j < m; j++){
//                 System.out.println(arr[i][j] + arr1[i][j] +" ");
//                 if(j == m - 1){    
//                     System.out.println();
//                 }
//             }
//         }
//     }
// }


// import java.util.Scanner;

// public class Pmain{
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         int m = sc.nextInt();
        
//         int[][] arr = new int[n][m];
//         int[][] arr1 = new int[n][m];

//         for(int i =0; i<n; i++){
//             for(int j =0; j<m; j++){
//                 arr[i][j] = sc.nextInt();
//             }
//         }

//         for(int i =0; i<n; i++){
//             for(int j =0; j < m; j++){
//                 arr1[i][j] = sc.nextInt();
//             }
//         }

//         for(int i =0; i <n; i++){
//             for(int j =0; j <m; j++){
//                 System.out.println(arr[i][j] + arr1[i][j]+ " ");
//                 if(j ==m-1){
//                     System.out.println();
//                 }
//             }

           
//         }
//     }

// }


//최댓값

// import java.util.Scanner;

// public class Pmain{
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         int[][] arr = new int[9][9];
//         int max =0;
//         int n = 0;
//         int m = 0;

//         for(int i =0; i< 9; i++){
//             for(int j =0; j<9; j++){
                
//                 int a =sc.nextInt();
//                 arr[i][j] = a;
//                 if(arr[i][j] >=max){

//                     max = arr[i][j];
//                     n = i;
//                     m = j;
//                 }
//             }
//         }

//         System.out.println(max);
//         System.out.println((n+1) +" " +(m+1));
//         }
// }

// import java.util.Scanner;

// public class Pmain{
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         int[][] arr = new int[9][9];
//         int max =0;
//         int n =0;
//         int m =0;

//         for(int i=0; i< 9; i++){
//             for(int j =0; j <9; j++){

//                 int a = sc.nextInt();
//                 arr[i][j] = a;
//                 if( a >= max){
//                     max = a;

//                     n= i;
//                     m= j;
//                 }

//             }
//         }
//         System.out.println(max);
//         System.out.println((n+1)+ " " + (m+1));
//     }
// }


//정렬
//커트라인

// import java.util.Scanner;
// import java.util.Arrays;

// public class Pmain{
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

// 대표값

// import java.util.Scanner;
// import java.util.Arrays;

// public class Pmain{
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         int N = 5;
//         int arr[] = new int[N];
//         int sum = 0;

//         for(int i =0; i < arr.length; i++){
//             arr[i] = sc.nextInt();
//             sum += arr[i];
//         }

//         System.out.println(sum/N);


//         Arrays.sort(arr);
      
//         System.out.println(arr[N/2]);
//     }
// }


// 수 정렬하기

// import java.util.Scanner;

// public class Pmain{
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         int N = sc.nextInt();
//         int [] arr = new int[N];

//         for(int i=0; i< N; i++){
//             arr[i] =sc.nextInt();
//         }

//         // Selection sort
//         for(int i =0; i< N-1; i++){
//             for(int j = i+1; j < N ; j++ ){
//                 if(arr[i] > arr[j]){
//                     int temp = arr[j];
//                     arr[j] = arr[i];
//                     arr[i] = temp;
//                 }
//             }
//         }

//         for(int val : arr){
//             System.out.println(val);
//         }
//     }
// }

// 수정렬 하기 Arrays 사용

// import java.util.Scanner;
// import java.util.Arrays;

// public class Pmain{
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         int N = sc.nextInt();
//         int [] arr = new int[N];

//         for(int i =0; i < N; i++){
//             arr[i] = sc.nextInt();
//         }

//         //정렬 메소드
//         Arrays.sort(arr);

//         for(int val : arr){
//             System.out.println(val);
//         }
//     }
// }

// import java.util.Scanner;

// public class Pmain{
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         int N = sc.nextInt();

//         int [] arr = new int[N];

//         for(int i=0; i< N; i++){
//             arr[i] =sc.nextInt();
//         }

//         for(int i =0; i < arr.length; i++){
//             for(int j =i+1; j < arr.length; j++){
//                 if(arr[i] > arr[j]){
//                     int temp =arr[i];
//                     arr[i] = arr[j];
//                     arr[j] = temp;                }
//             }
//         }

//         for(int i=0; i< N; i++){
//             System.out.println(arr[i]);
//         }

//     }
// }

//브루스포스 
// 분해합

// import java.util.Scanner;

// public class Pmain{
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         int N = sc.nextInt();

//         int result =0;  // 생성자가 없는 경우에는  0 출력

//         for(int i =0; i < N; i++){    // 0부터 시작하여 N 직전 까지 더해 가며 생성자 찾지
//             int sum =0;
//             int number = i;

//             while (number >0){             // 합을 도출하는 과정
//                 sum += number % 10;
//                 number /= 10;
//             }

//             if(sum +i ==N){   //가장 작은 수부터 시작했으니 찾으면 바로 찾고 결과를 보여주면 됨.
//                 result =i;
//                 break;
//             }
//         }

//         System.out.println(result);

//         sc.close();


//     }
// }

// import java.util.Scanner;

// public class Pmain{
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);
//         //1 단계
//         String strN = sc.nextLine();
//         int lenN = strN.length();

//         int N = Integer.parseInt(strN);
//         // 2, 3 단계
//         int result =0;

//         for(int i = N -lenN * 9; i< N; i++){
//             int number = i;
//             int sum =0;

//             while(number >0){
//                 sum +=number %10 ;
//                 number /= 10;
//             }

//             if(sum + i == N){
//                 result = i;
//                 break;
//             }
//         }
//         //4 단계 
//         System.out.println(result);

//         sc.close();
//     }
// }


// import java.util.Scanner;

// public class Pmain{
//     public  static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         int N = sc.nextInt();
//         int M = sc.nextInt();

//         int [] arr = new int[N];

//         for(int i =0; i< N; i++){
//             arr[i]= sc.nextInt();
//         }
        
//         int res =0 ;

//         // 근데 왜 N-2 ,N-1 , N 까지 인건지???????? 이해 x
//         for(int i =0 ; i < N-2; i++){
//             for(int j =i+1; j< N-1; j++){
//                 for(int k= j +1; k < N; k++){

//                     int sum = arr[i] + arr[j] + arr[k];
//                     if(sum <=M && sum > res){
//                         res = sum;
//                     }
//                 }
//             }
//         }
//         System.out.println(res);
//         sc.close();

//     }
// }


//브루트포스
//블랙잭
// import java.util.Scanner;

// public class Pmain{
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         int N = sc.nextInt();
//         int M = sc.nextInt();

//         int [] arr = new int[N];
        
//         for(int i=0; i < N; i++){
//             arr[i] =sc.nextInt();
//         }

//         int res =0;

//         for(int i =0; i< N-2; i++){
//             for(int j = i+1; j< N-1; j++){
//                 for(int k =j+1; k < N; k++){

//                     int sum = arr[i] + arr[j] + arr[k];
//                     if(sum <=M && sum >res){   //  sum >res 왜 인지 이해 안됨
//                         res= sum;       // 왜 이렇게 하는지??
//                     }
//                 }
//             }
//         }
//         System.out.println(res);
//         sc.close();
//     }
// }

// 체스판 다시 칠하기  # 1018번

// import java.util.Scanner;

// public class Pmain{
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         int N = sc.nextInt();
//         int M = sc.nextInt();

//        // int []arr = new int [N];

//         String [] board = new String[N];

//         for(int i=0 ; i <N; i++){
//             board[i] = sc.next();
//         }

//         String black = "BWBWBWBW";
//         String white = "WBWBWBWB";

//         int min = 2500;
//         int result = 0;

//         for(int y =0; y <=N-8; y++){
//             for(int x =0; x <=M-8; x++){


//                 int pattern1 =0;
//                 int pattern2 =0;

//                 for(int j =0; j< 8; j++){
//                     for(int i =0; i<8; i++){
//                         if((j +y)%2 ==0){
//                             if(black.charAt(i) != board[j +y].charAt(i +x)){
//                                 pattern1++;
//                             }
//                             else if(white.charAt(i) != board[j +y].charAt(i+x)){
//                                 pattern2++;
//                             }

//                         }else{
//                             if(white.charAt(i) !=board[j +y].charAt(i+x)){
//                                 pattern1++;
//                             }
//                             else if(black.charAt(i) != board[j +y].charAt(i+x)){
//                                 pattern2++;
//                             }
//                         }
//                     }
//                 }

//                 result = Math.min(pattern1, pattern2);

//                 min = Math.min(result, min);
//             }
//         }
//         System.out.println(min);
//     }
// }


// 영화 감독 숌

// import java.util.Scanner;

// public class Pmain{
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         int N = sc.nextInt();

//         int num =666;
//         int count =1;

//         while(count !=N){
//             num++;

//             if(String.valueOf(num).contains("666")){    // 666 을 포함하는 수가 있으면 카운트 +1 해라
//                 count++;
//             }

//         }
//         System.out.println( num);
//     }
// }

// import java.util.Scanner;

// public class Pmain{
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         int N = sc.nextInt();

//         //int count =0;
//         //int res = -1;

//         if(N%5 ==0){
//             System.out.println(N/5);
//         }else if(N % 5==1 || N % 3==1){
//             System.out.println(N/5 +1);
//         }else if(N % 5 ==2 || N % 3 ==2){
//             System.out.println(N/5 +2);
//         }else{
//             System.out.println(-1);
//         }



//     }
// }

// //꼬마 정민 
// import java.util.Scanner;

// public class Pmain{
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         long A = sc.nextLong();   // long data type 10^18 까지 입력 받음 하지만 int 는 10 ^9 까지라서 입력값이 모잘랏음.
//         long B = sc.nextLong();
//         long C = sc.nextLong();

//         System.out.println(A + B + C);
//     }
// }

//A+B-3

// import java.util.Scanner;

// public class Pmain{
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         int T = sc.nextInt();

//         for(int i =0 ; i < T; i++){
//             int A = sc.nextInt();
//             int B = sc.nextInt();

//             System.out.println(A + B);

//         }

//     }
// }

//합

// import java.util.Scanner;

// public class Pmain{
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         int sum = 0;

//         for(int i=1; i <n+1; i++){
//             sum +=i;

//         }
//         System.out.println(sum);
//     }
// }

//영수증 

// import java.util.Scanner;

// public class Pmain{
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         int X = sc.nextInt();
//         int N = sc.nextInt();
//         int sum =0;

//         for(int i =0; i < N; i++){
//             int a = sc.nextInt();
//             int b = sc.nextInt();
//             sum += a*b;
//         }
//         if(X == sum){
//             System.out.println("Yes");
//         }else{
//             System.out.println("No");
//         }
//     }
// }

//코딩은 체육과목 입니다

// import java.util.Scanner;

// public class Pmain{
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         int N = sc.nextInt();
//         int S = N/4;
//         String str ="";

//         for(int i =0; i < S; i++){
//             str +="long ";

//         }
//         System.out.print(str+ "int");
//     }
// }


// import java.util.Scanner;

// public class Pmain{
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         int N = sc.nextInt();
//         int S = N/4 ;

//         String str ="";

//         for(int i=0; i<S; i++){
//             str += "long ";
//         }
//         System.out.println(str + "int");
//     }
// }

//빠른 A+B

// import java.util.Scanner;

// public class Pmain{
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         int T = sc.nextInt();

//         for(int i =0; i< T; i++){
//             int A = sc.nextInt();
//             int B = sc.nextInt();
//             System.out.println(A+ B);
//         }
//     }
// }

// A+B-7

// import java.util.Scanner;

// public class Pmain{
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         int T = sc.nextInt();

//         for(int i=1; i <= T; i++){

//             int A = sc.nextInt();
//             int B = sc.nextInt(); 

//             System.out.println("Case #"+ i+ ":" +" "+(A+B));
            
//         }
//     }
// }


// A+B-8

// import java.util.Scanner;

// public class Pmain{
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         int T = sc.nextInt();

//         for(int i =1; i <= T; i++){
//             int A = sc.nextInt();
//             int B = sc.nextInt();
//             // Case #1: 1 + 1 = 2
//             // Case #1: 1 + 1 =  2
//             System.out.println("Case #"+ i+ ":" +" "+A+ " "+ "+" +" " +B + " = " + (A+B));
//         }
//     }
// }

//별 찍기-1

// import java.util.Scanner;

// public class Pmain{
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         int N = sc.nextInt();

//         for(int i =1 ; i<= N; i++){
                
//             for(int j =1; j<= i; j++){

//                 System.out.print("*");
//             }
         
//             System.out.println();
//         }
        
//     }
// }

//별찍기 -2

// import java.util.Scanner;

// public class Pmain{
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         int N = sc.nextInt();

//         for(int i =0; i< N; i++){
//             for(int j =0; j< N- (i+1); j++){
//                 System.out.print(" ");
//             }

//             for(int j =1; j<= i+1; j++){
//                 System.out.print("*");
//             }
//                 System.out.println();
//         }
//     }
// }

// import java.util.Scanner;

// public class Pmain{
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         int N = sc.nextInt();

//         for(int i =0;i <N; i++){
//             for(int j =0; j< N-(i+1); j++){
//                 System.out.print(" ");
//             }

//             for(int j =1; j<= i+1;j++){
//                 System.out.print("*");
//             }

//             System.out.println();
//         }
//     }
// }

// A+B-5

// import java.util.Scanner;

// public class Pmain{
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);



//         while(true){
//             int A = sc.nextInt();
//             int B = sc.nextInt();

//             //System.out.println(A+B); 왜 여기는 안돼지???

//             if(A ==0 && B==0){
//                 break;
//             }
//             System.out.println(A+B);
//         }
//     }
// }


//A+B -4

// import java.util.Scanner;

// public class Pmain{
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         while(sc.nextInt()){

//             int A = sc.nextInt();
//             int B = sc.nextInt();

//             if(A <0 || B >=10){
//                 break;
//             }
//             System.out.println(A+B);

//         }
//     }
// }

//개수 세기

// import java.util.Scanner;

// public class Pmain{
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         int N = sc.nextInt();
//         int[] arr = new int[N];
//         int count =0;

//         for(int i=0; i<N; i++){
//             arr[i] = sc.nextInt();
//         }
//         int v = sc.nextInt();

//         for(int i =0; i< N; i++){
            
//             if(v == arr[i]){
//                 count++;
//             }
//         }
//         System.out.println(count);
//     }
// }

// import java.util.Scanner;

// public class Pmain{
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         int N = sc.nextInt();
//         int[] arr = new int[N];

//         int count =0;

//         for(int i =0; i<N; i++){
//             arr[i] = sc.nextInt();
//         }

//         int v = sc.nextInt();
//         for(int i =0; i<N ;i++){
//             if(arr[i] == v){
//                 count++;
//             }
//         }

//         System.out.println(count);
//     }
// }

// X 보다 작은 수

// import java.util.Scanner;

// public class Pmain{
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         int N = sc.nextInt();
//         int X = sc.nextInt();

//         int [] arr = new int[N];
        
//         for(int i =0; i< N; i++){
//             arr[i] = sc.nextInt();
//         }


//         for(int i =0; i <N; i++){
//             if(arr[i]<X){
//                 System.out.print(arr[i] +" ");
//             }
//         }
    
//     }
// }


// import java.util.Scanner;

// public class Pmain{
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         int N = sc.nextInt();
//         int X = sc.nextInt();

//         int[] arr = new int[N];

//         for(int i=0; i <N; i++){
//             arr[i]= sc.nextInt();
//         }

//         for(int i=0; i<N; i++){
//             if(arr[i] < X){
//                 System.out.print(arr[i] +" ");
//             }
//         }
//     }
// }

//최소,최대 

// import java.util.Scanner;

// public class Pmain{
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         int N = sc.nextInt();

//         int[] arr = new int[N];

//         for(int i=0; i <N; i++){
//             arr[i]= sc.nextInt();
//         }

//         int Min = arr[0];

//         for(int i=0; i<N; i++){
//             if(Min > arr[i]){
//                 Min = arr[i];
//             }
//         }
//         System.out.println(Min);
        
//         int Max = arr[0];

//         for(int i =0; i< N; i++){
//             if(Max <arr[i]){
//                 Max = arr[i];
//             }

//         }
//         System.out.println(Max);
//     }
// }

// import java.util.Scanner;

// public class Pmain{
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         int N = sc.nextInt();
//         int[] arr = new int[N];

//         for(int i =0; i<N; i++){
//             arr[i] = sc.nextInt();
//         }

//         int Min = arr[0];

//         for(int i =0; i < N; i++){
//             if(Min > arr[i]){
//                 Min = arr[i];
//             }
//         }
//         System.out.println(Min);

//         int Max =arr[0];

//         for(int i =0; i<N; i++){
//             if(Max < arr[i]){
//                 Max = arr[i];
//             }
//         }
//         System.out.println(Max);
//     }
// }

//최댓값

// import java.util.Scanner;

// public class Pmain{
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         int[] arr = new int[9];

//         for(int i=0; i<9; i++){
//             arr[i] = sc.nextInt();
//         }

//         int count =0;
//         int max = arr[0];
//         for(int i =0; i < 9; i++){   // i< arr.length 로 해두됨
//         // 89 15 13
//         // max = 89
//         // 89 < 13
//             if(max < arr[i]){
//                 max = arr[i];
//             }
//         }
//         System.out.println(max);
        
//         for(int i =0; i < 9; i++){
//             if(max !=arr[i]){
//                 count++;
//             }
//         }
//         System.out.println(count);
//     }
// }

// import java.util.Scanner;

// public class Pmain{
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         int [] arr = new int[9];

//         for(int i= 0; i < arr.length; i++){
//             arr[i] = sc.nextInt();
//         }

//         int Max = arr[0];
//         int count =0;

//         for(int i =0; i< arr.length; i++){
//             if(arr[i] > Max){
//                 Max = arr[i];
//             }
//         }
//         System.out.println(Max);

//         for(int i =0 ; i< arr.length; i++){
//             if(arr[i] != Max){
//                 count++;
//             }
//         }

//         System.out.println(count);

//     }
// }

//공 넣기 --------이해 x 10810번

// import java.util.Scanner;

// public class Pmain{
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         int N = sc.nextInt();
//         int M = sc.nextInt();


//     }
// }


// 공 바꾸기 
/*
N = 5    1  2  3  4  5
bucket= [1, 2, 3, 4, 5]
M = 4

1, 2
[2, 1, 3, 4, 5]

3, 4
[2, 1, 4, 3, 5]

1, 4
[3, 1, 4, 2, 5]

2, 2   숫자가 똑같기 때문에 바꿀 필요없음
[3, 1 ,4, 2, 5]


이해 완료!
 */

 //공 바꾸기 ! -------------다시 풀어 보기

// import java.util.Scanner;

// public class Pmain{
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         int N = sc.nextInt();
//         int M = sc.nextInt();
//         int [] bucket = new int[N];

//         for(int i =1; i< N+1; i++){
//             bucket[i-1] = i;
//         }
//         for(int i =0; i< M; i++){
//             int x = sc.nextInt();    //1
//             int y = sc.nextInt();    //2
//             //[1, 2, 3, 4, 5]
//             //temp =1

//             int temp = bucket[x - 1];
//             //[1, 2, 3, 4, 5]
//             //bucket[y - 1] =2
//             //bucket[x - 1] = 1
//             //[2, 2, 3, 4, 5]

//             bucket[x - 1] = bucket[y -1];
//             bucket[y -1] = temp;
//         }

//         //[2, 2, 3, 4, 5]
//         for(int value : bucket) {   // 여기 뜻이 이해안감!!! -------> for문에서 (int value : arr) 을 통해 arr 배열의 각 값을 순서대로 순회한다. 이 때 각 값은 value에 해당한다.
//             System.out.print(value + " ");   // value 값을 어디서 가지고 온건지??? 위에 value 가 없는데;;;;
//         }

//     }
// }

// import java.util.Scanner;

// public class Pmain{
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         int N = sc.nextInt();
//         int M = sc.nextInt();

//         int[] arr = new int[N];

//         for(int i =1; i < N+1; i++){
//             arr[i-1] = i;
//         }

//         for(int i =0; i < M; i++){
//             int a = sc.nextInt();
//             int b = sc.nextInt();

//             int temp = arr[a -1];
//             arr[a -1] = arr[b -1];
//             arr[b - 1] = temp;
//         }

//         for (int value : arr) {   // for문에서 (int value : arr) 을 통해 arr 배열의 각 값을 순서대로 순회한다. 이 때 각 값은 value에 해당한다
//             System.out.print(value + " ");
//         }
//     }
// }


//과제 안내신분???????--------------이해가 안감............. 
// import java.util.Scanner;

// public class Pmain{
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         int[] arr = new int[31];   //왜???????? 31 인지???? 근데 왜 30이 아닌지????????

//         for(int i =1; i<= 28; i++){   
//             int s = sc.nextInt();
//             arr[s] =1;    // 왜 1 인지??????  트루 개념???? 모든 숫자를 1 로  받고 1이 아닌 숫자를 출력 한다???
//         }

//         for(int i=1; i<= 30; i++){
//             if(arr[i] !=1){
//                 System.out.println(i);
//             }
//         }
//     }
// }



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


// import java.util.Scanner;

// public class Pmain{
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         while(sc.hasNextInt()){

//             int A = sc.nextInt();
//             int B = sc.nextInt();

//             if(A <0 || B >=10){
//                 break;
//             }
//             System.out.println(A+B);

//         }
//     }
// }


// import java.util.Scanner;

// public class Pmain{
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         int T = sc.nextInt();

//         for(int i =1; i <= T; i++){
//             int A = sc.nextInt();
//             int B = sc.nextInt();
//             // Case #1: 1 + 1 = 2
//             // Case #1: 1 + 1 =  2
//             System.out.println("Case #"+ i+ ":" +" "+A+ " "+ "+" +" " +B + " = " + (A+B));
//         }
//     }
// }

// import java.util.Scanner;

// public class Pmain {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         // total bucket N
//         int N = sc.nextInt();
//         int[] arr = new int[N];
//         int M = sc.nextInt();
//         // each bucket 1 ~ N

//         // bucket[0] = 0
//         // M = how many times

//         // int i, j, k 
//         /*
//             1 2 3 4 5 = 0 0 0 0 0 = 3 3 0 0 0 = 3 3 4 4 0 = 1 1 1 1 0 = 1 2 1 1 0
//             1 2 3 // i = 1 j = 2 k = 3
//             3 4 4 
//             1 4 1 
//          */ 
//         for (int i = 0; i < M; i++) {
//             int a = sc.nextInt();
//             int b = sc.nextInt();
//             int c = sc.nextInt();

//             for (int j = a - 1; j < b; j++) {
//                 arr[j] = c;
//             }
//         }

//         for (int k = 0; k < arr.length; k++) {
//             System.out.print(arr[k] + " ");
//         }
//     }
// }

import java.util.Scanner;

public class Pmain{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        boolean[] arr = new boolean[30];   //왜???????? 31 인지???? 근데 왜 30이 아닌지????????

        for(int i = 1; i <= 28; i++){   
            int s = sc.nextInt() - 1; 
            arr[s] = true;    // 왜 1 인지??????  트루 개념???? 모든 숫자를 1 로  받고 1이 아닌 숫자를 출력 한다???
        }

        for(int i = 0; i < 30; i++){
            if(arr[i] != true){
                System.out.println(i + 1);
            }
        }
    }
}
