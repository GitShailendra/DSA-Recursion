public class CheckArraySorted {
    public static void main(String[] args) {
        int arr[] = {1,2,8,3,4,5};
        int idx = 0;
        System.out.println(checkArray(arr,idx));
    }
    public static boolean checkArray(int arr[], int idx){
        if(idx==arr.length-1){
            return true;
        }
        if(arr[idx] > arr[idx+1]){
            return false;
        }
        return checkArray(arr, idx+1);
        
        
    }
}
