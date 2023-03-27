import java.util.Scanner;

public class StringReverseUsingRecursion {
    public static void ReverseString(String str,int idx){
        if(idx==0){
            System.out.print(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        ReverseString(str, idx-1);
    }
    public static void main(String[] args) {
        System.out.println("Enter the String to get the reverse");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        ReverseString(str,str.length()-1);
    }
}
