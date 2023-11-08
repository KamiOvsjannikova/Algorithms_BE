package lesson081123;

public class RecursiveAlgExamples {
    public static void main(String[] args) {
        System.out.println("Result" + f1(15));
    }
    private static int f1(int n) {
        System.out.println("f1 function"+ n);
        if (n >= 20) return 20;
        return f2(n+1);
    }
    private static int f2(int n){
        System.out.println("f2 function " +n);
        return f1(n+1);
    }
}
