
import java.util.*;
public class MarksMenu
{
	public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
	    int input;
	    do{
	        int marks = sc.nextInt();
	        if(marks >=90 && marks<=100){
	            System.out.println("This is Good");
	        }
	        else if(marks >=60 && marks<=89){
	            System.out.println("This is also Good");
	        }
	        else if(marks >=0 && marks<=69){
	            System.out.println("This is not Bad");
	        }
	        else{
	            System.out.println("Not valid");;
	        }
	        System.out.println("Want to continue yes(1) no (0)");
	        input= sc.nextInt();
			sc.close();
	    }while(input==1);
	    
	    
	}
}
