import java.util.*;
public class Fibonacci
{
	public static void fibonacci(int count){
	    int n1=0,n2=1,n3;
	    System.out.print(n1+" "+n2);
	    for(int i=2;i<count;i++){
	        n3=n1+n2;
	        System.out.print(" "+n3);
	        n1=n2;
	        n2=n3;
	    }
	}
	public static void main(String[] args) {
		System.out.println("Enter the number to which series you want");
		Scanner sc= new Scanner(System.in);
		int count = sc.nextInt();
		sc.close();
        fibonacci(count);
	}
}
