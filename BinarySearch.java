package SearchingnSorting;
import java.util.*;
public class BinarySearch {

	public static void main(String[] args) {
		int arr[]= {12,24,26,48,60,72,84};
		int first =0;
		int last= arr.length-1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value to search in array");
		int input = sc.nextInt();
		while(first<=1) {
			int mid = (first+last)/2;
			if(arr[mid]==input) {
				System.out.println("Number found at "+mid);
				break;
			}
			if(arr[mid]<input) {
				first = mid+1;
			}
			else {
				last = mid-1;
			}
		}
		sc.close();
	}
}
