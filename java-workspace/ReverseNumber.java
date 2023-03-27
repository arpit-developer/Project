import java.util.Scanner;

public class ReverseNumber {
    public static void reverseNum(int n){
        if(n<10){
            System.out.println(n);
            return;
        }
        else{
            System.out.print(n%10);
            reverseNum(n/10);
            
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number to find the reverse");
        int num = sc.nextInt();
        System.out.print("Reverse of number is: ");
        reverseNum(num);
        sc.close();
    }
}
