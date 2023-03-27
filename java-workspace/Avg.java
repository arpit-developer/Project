
import java.util.*;
public class Avg
{
	public static void average(int a, int b, int c){
	    int result = (a+b+c)/3;
    	System.out.println("Average of above number is:"+result);
	}
	public static void main(String[] args) {
	    System.out.println("Enter 3 numbers");
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		sc.close();
		average(n1,n2,n3);

	}
}
