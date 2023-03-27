import java.util.*;
import java.lang.Math;
public class ExpPower
{
	public static void exponential (double n , double x){
	    double result = Math.pow(n,x);
	    System.out.println("Results is:"+result);
	}
	public static void main(String[] args) {
	    System.out.println("Enter two number");
		Scanner sc = new Scanner(System.in);
		double num = sc.nextDouble();
		double x = sc.nextDouble();
		sc.close();
		exponential(num,x);
	}
}
