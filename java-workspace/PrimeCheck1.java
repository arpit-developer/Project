
import java.util.*;
public class PrimeCheck1
{
	public static void main(String[] args) {
	    int temp=0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		for(int i=2;i<n-1;i++){
		    if(n%i==0){
		        temp++;
		    }
		}
		if(temp>0){
		    System.out.println(n+" is not a prime");
		}
		else{
		    System.out.println(n+" is a prime number");
		}
	}
}
