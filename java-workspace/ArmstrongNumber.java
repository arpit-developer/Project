import java.util.Scanner;

public class ArmstrongNumber {
    public static boolean isArmstrong(int n){
        int temp,digits=0,last=0,sum=0;
        temp=n;
        while (temp>0) {
            temp/=10;
            digits++;
        }
        temp=n;
        while (temp>0) {
            last = temp%10;
            sum+=(Math.pow(last,digits));
            temp/=10;
        }
        if(n==sum){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number to check armstrong or not?");
        int num = sc.nextInt();
        if(isArmstrong(num)){
            System.out.println("Is armstrong");
        }
        else{
            System.out.println("Not armstrong");
        }
        sc.close();
    }
}
