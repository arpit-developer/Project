public class BubbleSort {
    public static void main(String arges[]){
        int arr[] = {7,8,3,1,2};
        //BubbleSort
        //Time Complexity =  O(n^2)
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp=arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }
        BubbleSortPrint(arr);
    }
    public static void BubbleSortPrint( int arr[]) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
}
