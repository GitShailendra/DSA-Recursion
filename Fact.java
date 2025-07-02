public class Fact{
    public static void main(String[] args) {
        int fact = 11;
        System.out.println(FactorialNumber(fact));
    }
    public static int FactorialNumber(int fact){
        // base case
        if(fact==0) {
            return 1;
        }
        return fact*FactorialNumber(fact-1);

    }
}