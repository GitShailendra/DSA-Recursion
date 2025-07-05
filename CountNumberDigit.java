public class CountNumberDigit {
    public static void main(String[] args) {
        int num = 1234;
        // System.out.println(14/10);
        int result = countNumDigit(num);
        System.out.println(result);
    }
    public static int countNumDigit(int num){
        if(num==0) return 0;
        return 1+countNumDigit(num/10);
    }
}
