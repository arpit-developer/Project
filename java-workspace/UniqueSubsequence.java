import java.util.HashSet;
public class UniqueSubsequence {
        public static void uniquesubsequence(String str , int idx, String newString,HashSet<String> set){
            if(idx== str.length()){
                if(set.contains(newString)){
                    return;
                }
                else{
                    System.out.println(newString);
                    set.add(newString);
                    return;
            }
        }
            char currChar = str.charAt(idx);
            //to be
            uniquesubsequence(str, idx+1, newString+currChar,set);
            //to not to be
            uniquesubsequence(str, idx+1, newString,set);
        }
        public static void main(String[] args) {
            HashSet<String> set = new HashSet<>();
            String str = "aaaaaaa";
            uniquesubsequence(str, 0, " ",set);
        }
}
    
