public class CountVowels {
    public static void main(String[] args) {
        String str = "hello";
        int count =0;
        int idx = 0;
        countVow(str, count, idx);
    }
    public static void countVow(String str, int count , int idx){
        if(str.length()==idx){
            System.out.println("count of curent string is "+count);
            return;
        }
        if(str.charAt(idx)=='a'||str.charAt(idx)=='e'||str.charAt(idx)=='i'||str.charAt(idx)=='o'||str.charAt(idx)=='u'){
            count++;
        }
        countVow(str,count,idx+1);
        
    }
}
