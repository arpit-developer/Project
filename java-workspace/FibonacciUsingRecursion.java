import java.util.Scanner;

//Fibonacci Seies till nth term
public class FibonacciUsingRecursion {
    public static void fibo(int a, int b,int n){
        if(n==0){
            return;
        }
        System.out.println(a);
        fibo(b, a+b, n-1);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of elements of fibonacci series to print");
        int n = sc.nextInt();
        sc.close();
        fibo(0,1,n);
    }
}
