public class CheckIfANum {
    public static void main(String[] args) {
        int n=8;
        System.out.println(checkIfaNum(n));
    }
    public static boolean checkIfaNum(int n){
        if(n==1) return true;
        if(n==0 || n%2 !=0) return false;
        return checkIfaNum(n/2);
    }
}
