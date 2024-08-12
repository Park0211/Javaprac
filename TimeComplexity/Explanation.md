``` 24262
MenOfPassion(A[], n) {
    i = ⌊n / 2⌋;
    return A[i]; # 코드1
} // O(1)
n = 1;

A = [1,2,3,4,5,6,7,8,9,10]
i = 5
A[i] = A[5] = 6
```

``` 24263
MenOfPassion(A[], n) {
    sum <- 0;
    for i <- 1 to n
        sum <- sum + A[i]; # 코드1
    return sum;
}
``` O(n)

``` 24264
MenOfPassion(A[], n) {
    sum <- 0;
    for i <- 1 to n
        for j <- 1 to n
            sum <- sum + A[i] × A[j]; # 코드1
    return sum;
}
``` O(n^2)

``` 24265
MenOfPassion(A[], n) {
    sum <- 0;
    for i <- 1 to n - 1     //n
        for j <- i + 1 to n    //n
            sum <- sum + A[i] × A[j]; # 코드1
    return sum;
}
``` O(n^2)

``` 24266
MenOfPassion(A[], n) {
    sum <- 0;
    for i <- 1 to n
        for j <- 1 to n
            for k <- 1 to n
                sum <- sum + A[i] × A[j] × A[k]; # 코드1
    return sum;
}
```  O(n^3)

``` 24267
MenOfPassion(A[], n) {
    sum <- 0;
    for i <- 1 to n - 2
        for j <- i + 1 to n - 1
            for k <- j + 1 to n
                sum <- sum + A[i] × A[j] × A[k]; # 코드1
    return sum;
}
```

