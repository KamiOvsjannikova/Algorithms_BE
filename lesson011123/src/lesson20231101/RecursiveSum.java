package lesson011123;

public class RecursiveSum {
    public static void main(String[] args) {
        int [] data = new int [] { 1,2,3,4,5};
        System.out.println(sumRecursive(data,0));
    }
    public static int sumRecursive(int[] data, int currentIndex){
        if (currentIndex == data.length) return 0;
        int result = data [currentIndex] + sumRecursive(data, currentIndex);
        return result;
    }
}
