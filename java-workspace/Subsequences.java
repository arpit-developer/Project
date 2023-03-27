public class Subsequences {
    public static void subsequence(String str , int idx, String newString){
        if(idx== str.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        //to be
        subsequence(str, idx+1, newString+currChar);
        //to not to be
        subsequence(str, idx+1, newString);
    }
    public static void main(String[] args) {
        String str = "aabc";
        subsequence(str, 0, " ");
    }
}
