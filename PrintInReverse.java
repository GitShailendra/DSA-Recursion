public class PrintInReverse {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        printInReverse(arr, 4);
    }
    public static void printInReverse(int arr[], int idx){
        if(idx<0){
            return;
        }
        System.out.println(arr[idx]);
        printInReverse(arr, idx-1);
    }
}
