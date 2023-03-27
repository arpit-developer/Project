
import java.util.*;
public class MultipleNames
{
	public static void main(String[] args) {
	    System.out.println("Enter the number of names you want to enter");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		String arr[] = new String[size];
		for(int i=0;i<size;i++){
		    arr[i]= sc.next();
		}
		sc.close();
		for(int i=0;i<arr.length;i++){
		    System.out.println(" Names are: "+(i+1)+" "+arr[i]);    
		}
	}
}
