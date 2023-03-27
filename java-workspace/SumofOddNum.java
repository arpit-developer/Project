
import java.util.*;
public class SumofOddNum
{
    public static void sumOdd(int n){
        int sum=0;
        for(int i =0;i<=n;i++){
            if(i%2!=0){
                sum= sum+i;    
            }
        }
        System.out.println("Sum of odd number: "+sum);
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
        sc.close();
	    sumOdd(n);
	}
}
