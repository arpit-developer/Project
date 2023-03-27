import java.util.Random;
import java.util.Scanner;   
public class FlipaCoin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();   
        boolean t = random.nextBoolean();
        boolean f = random.nextBoolean(); 
        System.out.println("Do you want to Flip a coin? press 0");
        int input = sc.nextInt();
        sc.close();
        if(input == 0 ){
            if(t == true)
            System.out.println("Heads");
            if(f == false)
            System.out.println("Tails");
        }
        else{
            System.out.println("OK bye");
        }
    }
}
