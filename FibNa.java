public class FibNa {
    public static void main(String[] args) {
        int n = 5; // Example input
        int result = fib(n);
        System.out.println("Fibonacci of " + n + " is: " + result);
    }

    public static int fib(int n){
        if(n <= 1){
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }
}
