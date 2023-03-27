import java.util.Scanner;

public class Recursion {
    public static void reverse(int n){
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        reverse(n-1);
    }
    public static void count(int n){
        if(n==10){
            return;
        }
        System.out.print(n + " ");
        count(n+1);
    }
    public static void sumofNaturalNum(int n, int sum){
        if(n==0){
            System.out.println(sum);
            return;
        }
        sum+=n;
        sumofNaturalNum(n-1, sum);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Reverse series of Entered Number");
        reverse(n);
        System.out.println("\nCount till Entered Number");
        count(n);        
        System.out.println("\nSum of Natural Number is");
        sumofNaturalNum(n,0);
        sc.close();

    }
}
