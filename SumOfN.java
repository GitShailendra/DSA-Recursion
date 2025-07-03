public class SumOfN {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(sumOfNNatural(n));
    }

    public static int sumOfNNatural(int n) {
        if (n == 0) {
            return 0;
        }
        int result = n + sumOfNNatural(n - 1);
        return result;
    }
}
