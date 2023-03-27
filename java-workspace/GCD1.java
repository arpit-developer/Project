import java.util.*;
public class GCD1
{
	public static void gcd(int x,int y){
	    int temp=1;
	    for(int i=1;i<=x&& i<=y;i++){
	        if(x%i==0 && y%i==0){
	            temp=i;
	        }
	    }
	    System.out.println(+temp);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		gcd(a,b);
	}
}
