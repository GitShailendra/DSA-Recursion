public class PrintNNumbers {
    public static void main(String[] args) {
        int n = 10;
        printNumbers(n);
    }
    public static void printNumbers(int n){
        if(n==0) return;
        printNumbers(n - 1);
        System.out.println(n);
    }
}