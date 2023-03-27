
public class RemoveDuplicates {
    public static boolean map[] = new boolean[26];
    public static void removeDup(String str, int idx, String newString){
        if(idx== str.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        if(map[currChar-'a']==true){
            removeDup(str, idx+1, newString);
        }
        else{
            newString+=currChar;
            map[currChar-'a']=true;
            removeDup(str, idx+1, newString);
        }
    }
    public static void main(String[] args) {
        String str = "abbccddaa";
        // boolean present[] = new boolean[str.length()];
        removeDup(str, 0," ");
    }
}
