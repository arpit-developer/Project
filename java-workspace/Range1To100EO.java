import java.util.Scanner;

public class Range1To100EO {
    public static void perfectSquare(int x){
        double d = Math.sqrt(x);
        if(d==(int)d){
            System.out.println(x+ " is a perfect square");
        }
        else{
            System.out.println(x+" is not perfect square");
        }
    }
    public static void printEven(){
        int low=1,high=100;
        for(int i=low;i<high;i++){
            if(i%2==0){
                System.out.println("Even Number between 1 to 100 is:"+ i);
            }
        }
    }
    public static void printOdd(){
        int low=1,high=100;
        for(int i=low;i<high;i++){
            if(i%2==1){
                System.out.println("Odd Number between 1 to 100 is:"+ i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x = sc.nextInt();
        sc.close();
        perfectSquare(x);
        printEven();
        printOdd();
    }
}
