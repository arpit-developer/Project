public class xToPowerN {
    public static int xpowerN(int x,int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int xx= xpowerN(x, n-1);
        int xn = x*xx;
        return xn;
    }
    public static void main(String[] args) {
        int x=2;
        int n=5;
        System.out.println(xpowerN(x, n));
    }
}
