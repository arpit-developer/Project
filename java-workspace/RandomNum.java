import java.text.DecimalFormat;
import java.util.Random;

// import java.math.*;
public class RandomNum {
    public static void main(String[] args) {
        int min=100;
        int max = 200;
        Random random = new Random();
        DecimalFormat df = new DecimalFormat("#.##");
        double num = Math.random()*(max-min+1)+min;
        System.out.print(df.format(num));
        System.out.println("Print random number");
        int x = random.nextInt(50);
        System.out.println(x);
    }
}
