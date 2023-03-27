
import java.util.*;
public class MaxMin
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the Array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		int max = arr[0];
		int min = arr[0];
		
		for(int i =0;i<size;i++){
		    System.out.println("Enter Array elements");
		    arr[i]= sc.nextInt();    
		}
		sc.close();
		for(int i=0;i<arr.length;i++){
		    if(arr[i]<min){
		        min= arr[i];
		    }
		    else if(arr[i]>max){
		       max = arr[i];
		    }
		    else{
		        System.out.println("error");
		    }
		}
		System.out.println("Max: "+max);
		System.out.println("Min: "+min);
	}
}
