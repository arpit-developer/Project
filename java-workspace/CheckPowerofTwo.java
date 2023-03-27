import java.util.Scanner;

public class CheckPowerofTwo{
    public static boolean isPowerOfTwo(int n){
        if(n ==0)
        return false;
        while(n!=1){
            if(n%2!=0){
                return false;
            }
            n=n/2;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("Enter value to check pow to 2 or not");
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        System.out.println(isPowerOfTwo(val));
        sc.close();
        
    }
}