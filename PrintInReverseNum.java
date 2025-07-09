public class PrintInReverseNum {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        printInReverse(arr, 0);
    }
    public static void printInReverse (int arr[], int idx){
        if(idx==arr.length){
            return;
        }
        printInReverse(arr, idx+1);
        System.out.println(arr[idx]);
    }
}
