public class BInarySearch {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int s=0;
        int e = arr.length-1;
        int target = 4;
        System.out.println(binarySearch(arr, s, e, target));
    }
    public static int binarySearch(int arr[], int s, int e, int target){
        if(s>e){
            return -1;
        }
        int mid = (s+e)/2;
        if(arr[mid]==target){
            return mid;
        }
        if (arr[mid] < target) {
            return binarySearch(arr, mid + 1, e, target);
        } else {
            return binarySearch(arr, s, mid - 1, target);
        }



    }
}
