import java.util.Scanner;

public class hello{
    public static void main(String[] args){
       System.out.println("hello bro!!") ;
       System.out.println("Enter the radius to find area of cirlce");
       float pie= 3.14f;
       Scanner sc = new Scanner(System.in);
       float rad = sc.nextFloat();
       sc.close();
       double area = pie*rad*rad;
       System.out.println("Area of Circle is "+ area);
    }
}