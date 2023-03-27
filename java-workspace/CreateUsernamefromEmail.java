import java.util.Scanner;

public class CreateUsernamefromEmail {
    public static void main(String[] args) {
        String email="";
        String userName = "";
        Scanner sc = new Scanner(System.in);
        email = sc.next();
        sc.close();
        userName = email.substring(0,email.length()-10);
        System.out.println("Your UserName is: " +userName);
    }
}
