public class BreaknContinue {
    public static void main(String[] args) {
        int count=10,i=0;
        while(i<count){
            // System.out.println(i);
            if(i==7){
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
        for(i=0;i<count;i++){
            if(i==4){
                continue;
            }
            System.out.println(i);
        }
        double STATIC = 2.5;
        System.out.println(STATIC);
    }
}
