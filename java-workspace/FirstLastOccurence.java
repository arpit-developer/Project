public class FirstLastOccurence {
    public static int f=-1;
    public static int l=-1;
    public static void checkOccurence(String str, int idx,char element){
        if(idx== str.length()){
            System.out.println(f);
            System.out.println(l);
            return;
        }
        // char currChar = str.charAt(idx);
        if(str.charAt(idx) == element){
            if(f ==-1){
                f =  idx;
            }
            else{
                l= idx;
            }
        }
        checkOccurence(str, idx+1, element);
    }
    public static void main(String[] args) {
        String str = "abaaddasegh";
        checkOccurence(str, 0, 'a');
    }
}
