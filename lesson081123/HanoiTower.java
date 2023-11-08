package lesson081123;

public class HanoiTower {
    public static void main(String[] args) {
        hanoiRecursive(3,'a','b', 'c');

    }
    private static void hanoiRecursive(int n, char start, char middle, char end) {
        if (n == 1) {
            System.out.println("Move disk" +n + " from " +start + "to" +end); //base condition
            return;
        }
        hanoiRecursive(n -1, start, end, middle); // n-1 eto seredenidu peremewaem
        System.out.println("Move disk" +n + " from " +start + "to" +end);
        hanoiRecursive(n-1, middle, start, end);
    }
}
