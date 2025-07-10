public class CheckPalindrome {
    public static void main(String[] args) {
        String str = "dalda"; 
        int s = 0;
        int e = str.length()-1;
        System.out.println(checkPalindrome(str, s, e));
    }
    public static boolean checkPalindrome(String str , int s,int e){
        if(s>=e){
            return true;
        }
        if(str.charAt(s)!=str.charAt(e)){
            return false;
        }
        return checkPalindrome(str, s+1, e-1);
    }
}