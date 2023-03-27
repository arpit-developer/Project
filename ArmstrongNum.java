package assignment2;
import java.util.*;
public class ArmstrongNum {

	public static void main(String[] args) {
		int rem =0;
		int sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number to check ArmStrong Number");
		int input = sc.nextInt();
		int store = input;
		while(input!=0) {
			rem = input%10;
			sum+= Math.pow(rem, 3);
			input/=10;
		}	
		if(store == sum) { 
			//store got input value 
			//sum got math.pow value i.e sum of digits
			System.out.println("Is Armstrong");
		}
		else {
			System.out.println("Not Armstrong");
		}
		sc.close();
	}
}
