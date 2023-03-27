import java.util.Scanner;
public class StringLengthCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String ArrOfString[] = new String[size];
        int totalLen =0;
        for(int i=0;i<size;i++){
            ArrOfString[i] =  sc.next();
            totalLen+= ArrOfString[i].length();
        }
        sc.close();
        
            System.out.println("Length of all string is: "+totalLen);
    }
}
