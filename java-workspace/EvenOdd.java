
import java.util.*;
public class EvenOdd
{
    public static void evenOdd(int num){
        if(num%2==0){
            System.out.println(num+" is Even");
        }
        else{
            System.out.println(num+" is Odd");
        }
    }
	public static void main(String[] args) {
	    System.out.println("Enter the number to check Even/Odd");
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
        sc.close();
		evenOdd(n);
	}
}
