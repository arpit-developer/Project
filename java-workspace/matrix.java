/* Online Java Compiler and Editor */
import java.util.*;
public class matrix{
     public static void main(String []args){
        System.out.println("Enter the row and column");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int [][] arr = new int [row][col];
         for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j] = sc.nextInt();
            }
         }
         sc.close();
        //  System.out.println("Matrix is ");
         for(int i=0;i<row;i++){
             for(int j=0;j<col;j++){
                 System.out.print(arr[i][j]+" ");
             }
             System.out.println();
         }
     }
}