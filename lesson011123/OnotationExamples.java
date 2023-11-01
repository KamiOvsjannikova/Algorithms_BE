package lesson011123;

public class OnotationExamples {
    public static void main(String[] args) {
        int[] data = new int[]{ 1,3,5,12};
        processData(data);
        System.out.println(sum(5, 6));
        System.out.println(sumArray(new int[] { 1, 4, 5}));
    }

    public static int sumArray (int[] ints) {
        int sum = 0; // 1 operacija
        for (int i = 0; i < ints.length; i ++) {
            sum = sum + ints[i];
        }
        return sum;
    }
    // 0(3) = 0 (1)
    public static int sum(int a, int b) {
        int result = a +b; //2
        return result; //1
    }
    public static void processData(int[] data) {
        for (int i =0; i < data.length; i++) {
            System.out.println("Processing data " + data[i]);
            int count = 0;
            for (int j = 0; j < data.length; j++){
                count = count + data[i];
            }
        }
    }

    public static void fork(int n) {
        if(n < 100) {
            System.out.println("number < 100");
        } else {
            for(int i = 0; i < n; i++) {
                System.out.println(i + " ");
            }
        }
    }


    public static void bubleFor(int n) {
        for (int i = 0; i <= n / 3; i++){
            for (int j = 1; j <= n; j = j + 4){
                System.out.println("I study Big O notation");
            }
        }
    }
}
