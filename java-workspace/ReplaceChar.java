import java.util.Scanner;

public class ReplaceChar {
    public static void main(String[] args) {
        String result ="";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String data = sc.next();
        sc.close();
        for(int i=0;i<data.length();i++){
            if(data.charAt(i) == 'e'){
                result += 'i';
            }
            else{
                result += data.charAt(i);
            }
        }
        System.out.println("Formatted String is:"+result);
        // System.out.println(data.replace('a', 't'));
    }
}
