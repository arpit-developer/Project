
import java.util.*;
public class CompareTwoNum
{
	public static void greaterNum(int a , int b){
	    if(a>b){
            System.out.println(a+" is greater than "+b);
	    }
	    else{
	        System.out.println(b+" is greater than "+a);
	    }
	}
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
		sc.close();
        greaterNum(a,b);
// 		System.out.println("Hello World");
	}
}
