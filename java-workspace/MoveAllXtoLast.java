public class MoveAllXtoLast {
    public static void moveAllX(String str , int idx, String newString,int count){
        if(idx == str.length()){
            for(int i=0;i<count;i++){
                newString+= 'x';
            }
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        if(currChar == 'x'){
            count++;
            moveAllX(str, idx+1, newString, count);
        }
        else{
            newString +=currChar;
            moveAllX(str, idx+1, newString, count);
        }
    }
    public static void main(String[] args) {
        String str= "axbxcxxdsxx";
        moveAllX(str, 0, " ", 0);
    }
}
