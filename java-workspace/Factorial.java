import java.util.*;
public class Factorial {
	public static void factorial(int n){
	    int fact=1;
	    for(int i=n;i>=1;i--){
	        fact=fact*i;
	        System.out.println(fact +" "+" "+i);
	    }
	    System.out.println("factorial of"+n+"is"+fact);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		factorial(n);
	}
}
