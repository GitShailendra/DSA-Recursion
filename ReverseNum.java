public class ReverseNum {
    public static void main(String[] args) {
        int num = 1234;
        
       revNum(num);
    }
    public static void revNum(int num){
        if(num == 0) return ;
        int result = 0;
        result = result+ (num%10);
        System.out.print(result);
        revNum(num/10);
        
        

    }
}
