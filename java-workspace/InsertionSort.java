public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {7,8,3,1,2};
        for(int i=0;i<arr.length;i++){
            int current = arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>current){
                //keep swapping
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }
        InsertionSortPrint(arr);
    }
    public static void InsertionSortPrint(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
