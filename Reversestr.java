public class Reversestr{

    public static void main(String[] args) {
        String str = "abc";
        int i = 0;
        
        reverseString(str,i);
    }
    public static void reverseString(String str, int i){
        if(i == str.length()){
            return;
        }
        int k =0;
        reverseString(str, i + 1);
        System.out.print(str.charAt(i));
       
    }
}