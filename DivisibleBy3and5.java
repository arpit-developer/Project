package assignment2;

public class DivisibleBy3and5 {

	public static void main(String[] args) {
		int low=1,high=100;
		System.out.println("Number divisble by 3 is:");
		for(int i=low;i<high;i++) {
			if(i%3==0) {
				System.out.print(i +", ");
			}
		}
		System.out.println("\nNumber divisble by 5 is:");
		for(int i=low;i<high;i++) {
			if(i%5==0) {
				System.out.print(i +", ");
			}
		}
		System.out.println("\nNumber divisble by 3 & 5 is:");
		for(int i=low;i<high;i++) {
			if(i%3==0 && i%5==0) {
				System.out.print(i +", ");
			}
		}
	}
}
