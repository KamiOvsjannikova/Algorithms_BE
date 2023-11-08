package lesson081123;

public class RecursiveAlgExamples {
    public static void main(String[] args) {
        f(0);
    }
    private static void f(int n) {
        System.out.println(n);
        if (n == 100) return;
        f(n+1);
    }
}
