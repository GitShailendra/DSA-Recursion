public class PrintAllElements {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        printElem(arr, 0);
    }
    public static void printElem (int arr[],int idx){
        if(idx == arr.length){
            return;
        }
        System.out.println(arr[idx]);
        printElem(arr, idx+1);
    }
}
