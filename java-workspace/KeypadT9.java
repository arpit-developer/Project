// import java.util.HashMap;
public class KeypadT9 {
    public static String keypad []={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void printCombination(String str,int idx,String combination){
        if(idx==str.length()){
            System.out.println(combination);
            return;
        }
        // char currChar= str.charAt(idx);
        for(int i=0;i<keypad[str.charAt(idx)-'0'].length();i++){
            char currChar = keypad[str.charAt(idx)-'0'].charAt(i);
            printCombination(str, idx+1, combination+currChar);
        }
    }
    public static void main(String[] args) {
        String str = "45";
        printCombination(str, 0, "");
    }
}
