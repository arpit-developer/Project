import java.util.Scanner;

public class ReverseNumber1 {
    public static void revereNum(int n,int rev){
        while(n!=0){
            int remainder = n%10;
            rev = rev*10+ remainder;
            n/=10;
        }
        System.out.println("The reverse of the given number is: "+rev);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int reverse=0;
        revereNum(n,reverse);
        sc.close();
    }
}
