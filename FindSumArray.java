public class FindSumArray{
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int sum = 0;
        int idx = 0;
        System.out.println(findSum(arr,idx,sum));

    }
    public static int findSum(int arr[],int idx,int sum){
        if(idx==arr.length-1){
            return arr[idx];
        }
        int totalSum = findSum(arr, idx+1, sum);
        return totalSum+arr[idx];
    }
}