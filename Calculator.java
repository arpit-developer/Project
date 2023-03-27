import java.util.*;
public class Calculator
{
	public static void main(String[] args) {
		System.out.println("Enter Two numbers");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Enter 1 For addtion\n2 For Subtraction\n3 For Multiplication\n4 For Division\n5 For Remainder\n ");
		int op = sc.nextInt();
		sc.close();
		switch(op){
		    case 1: System.out.println(a+b);
		    break;
		    case 2: System.out.println(a-b);
		    break;
		    case 3: System.out.println(a*b);
		    break;
		    case 4: System.out.println(a/b);
		    break;
		    case 5: System.out.println(a%b);
		    break;
		    default: System.out.println("No operation Performed");
		}
	}
}
