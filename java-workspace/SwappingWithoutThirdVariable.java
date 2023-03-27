import java.util.Scanner;

public class SwappingWithoutThirdVariable {
    public static void main(String[] args) {
        System.out.println("Enter two Numbers for Swapping");
        Scanner sc= new Scanner(System.in);
        int val1= sc.nextInt();
        int val2 = sc.nextInt();
        sc.close();
        val1=val1+val2;
        val2=val1 - val2;
        val1 = val1-val2;
        System.out.println("After Swapping: "+ val1 + " " + val2);
    }
}
