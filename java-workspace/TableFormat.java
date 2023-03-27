
import java.util.*;
public class TableFormat
{
	public static void table(int num){
	    for(int i=1;i<=10;i++){
	        int store= num*i;
	        System.out.println(num+"x"+i+"="+store);
	    }
	}
	public static void main(String[] args) {
	    System.out.println("Enter the number for which table you want to see");
	   Scanner sc = new Scanner(System.in);
	   int n = sc.nextInt();
	   sc.close();
	   table(n);
	}
}
