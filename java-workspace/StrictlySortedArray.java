public class StrictlySortedArray {
    public static boolean checkSortedorNot(int arr[],int idx){
        if(idx== arr.length-1){
            return true;
        }
        if(arr[idx] < arr[idx+1]){
            //array is sorted
            return checkSortedorNot(arr, idx+1);
        }
        else{
            return false;    
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,4,3};
        System.out.println(checkSortedorNot(arr, 0));
    }
}
