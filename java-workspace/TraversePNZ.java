
import java.util.*;
public class TraversePNZ
{
	public static void main(String[] args) {
	    int p=0,n=0,zero=0,num;
	    char choice;
	    Scanner sc= new Scanner(System.in);
	   // System.out.println("Press 1 to Continue and 0 to Stop");
	   do{
	       System.out.println("Enter your number : ");
           num = sc.nextInt();
	         if(num>0){
	             p++;
	         }
	         else if(num<0){
	             n++;
	         }
	         else if(num==0){
                zero++;  
	         }
	         else{
	             break;
	         }
	    System.out.println("Please Choose one Y/N?");
	     choice = sc.next().charAt(0);
	   }while(choice == 'Y'|| choice == 'y');
	    sc.close();
	     System.out.println("Result is:");
	     System.out.println("Positive "+p);
	     System.out.println("Negative "+n);
	     System.out.println("Zero "+zero);
	}
}
