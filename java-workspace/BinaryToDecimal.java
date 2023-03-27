import java.util.*;

public class BinaryToDecimal {
    //Binary to decimal
    public static void BinaryToDecimalExample(){    
        String binaryString="1010110";  
        int decimal=Integer.parseInt(binaryString,2);  
        System.out.println(decimal);    
    }
    public static int BinaryToDecimalExample2(long num){    
        // num= 1010111; 
        int decimalNumber = 0, i = 1;
        long remainder;
        
        while (num != 0) {
          remainder = num % 10;
          num /= 10;
          decimalNumber += remainder * Math.pow(2, i);
          ++i;
        } 
        return decimalNumber;
    }
    public static long convertDecimalToBinary(int n) {
       //Decimal to Binary 
    long binaryNumber = 0;
    int remainder, i = 1, step = 1;

    while (n!=0) {
      remainder = n % 2;
        System.out.println("Step " + step++ + ": " + n + "/2");

        System.out.println("Quotient = " + n/2 + ", Remainder = " + remainder);
        n /= 2;

        binaryNumber += remainder * i;
        i *= 10;
    }
    
    return binaryNumber;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value in Binary");
        long decimalVal= sc.nextLong();
        // System.out.println("Enter the value in Decimal");
        // int binaryVal = sc.nextInt();
        BinaryToDecimalExample2(decimalVal);
        // convertDecimalToBinary(binaryVal);
        sc.close();
        // BinaryToDecimalExample();
    }
}
