
import java.util.*;
public class Voting
{
    public static void votingEligible(int age){
        if(age>=18){
            System.out.println("You are eligible to vote");
        }
        else{
            System.out.println("You are not eligible");
        }
    }
	public static void main(String[] args) {
	System.out.println("Please Enter your age to check eligibility criteria");
	Scanner sc = new Scanner(System.in);
    sc.close();
	int a= sc.nextInt();
	votingEligible(a);
	}
}
