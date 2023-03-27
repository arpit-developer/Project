import java.util.Scanner;

public class SpyNumber {
    public static void main(String[] args) {
        int sum=0;
        int product =1;
        int lastDigit;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number to check");
        int num = sc.nextInt();
        sc.close();
        //executes until the condition  becommes false
        while(num>0){
            //find the last digit
            lastDigit = num%10;
            //add last digit to varibale sum
            sum = sum+lastDigit;
            //calcutes the product
            product = product*lastDigit;
            //remove the last digit from the given number
            num= num/10;
        }
        if(sum==product){
            System.out.println("Is a Spy number");
        }
        else{
            System.out.println("Not a Spy number");
        }
    }
}
