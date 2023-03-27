import java.util.Scanner;
public class UserInputWhileLoopEx{
    public static void main(String [] args){
        System.out.println("Which number table you want?");
        Scanner sc= new Scanner(System.in);
        int store = sc.nextInt();
        sc.close();
        int i=0;
        do{
            i++;
            System.out.println(store+ "x "+i+" = "+store*i);        
        }while(i<10);
        }
    }