package lesson081123;

public class SumSequence {
    public static void main(String[] args) {

        System.out.println(sumInLoop(5));
        System.out.println(sumRecursive(5));
    }
    public static  int sumRecursive(int n) {
        int result = n + sumRecursive(n-1);
        return  result;
    }
     public static int sumInLoop(int n) {
        int sum = 0;
        for (int i = 1; i <=n; i++) {
            sum = sum +1;
        }
        return sum;
     }
}
