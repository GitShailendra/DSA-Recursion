public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int idx = 0;
        int target = 3;
        System.out.println(linearSearch(arr,idx,target));

    }
    public static int linearSearch(int arr [], int idx, int target){
        if(idx==arr.length-1){
            return -1;
        }
        if(arr[idx]==target){
            return idx;
        }
        return linearSearch(arr, idx+1, target);
    }
}
