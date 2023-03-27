import java.util.Scanner;
public class GCD2
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		sc.close();
		while(x!=y){
		    if(x>y){
		        x=x-y;
		    }
		    else{
		        y=y-x;
		    }
		}
		System.out.println("GCD is: "+y);
	}
}
