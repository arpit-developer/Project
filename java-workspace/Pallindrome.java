import java.util.Scanner;

public class Pallindrome {
    public static void pallindrome(int n){
        int rev=0;
        int OGnum = n;
        while(n!=0){
            int remainder = n%10;
            rev = rev*10+ remainder;
            n/=10;
        }
        if(OGnum == rev){
            System.out.println("Pallindrome");
        }
        else{
            System.out.println("Not pallindrome");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        pallindrome(num);
        sc.close();
    }
}
