import java.util.Scanner;

public class FactorialUsingRecursion {
    public static void factorial(int n,int fact){
        if(n==0){
            System.out.println(fact);
            return;
        }
        fact =fact*n;
        factorial(n-1, fact);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = sc.nextInt();
        sc.close();
        factorial(num,1);
    }
}
