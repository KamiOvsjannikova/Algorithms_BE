package lesson151123;
/*Решить задачи через рекурсию, и далее оптимизовать алгоритм одним из методов динамического программирования:

        1. Вычислить n-й член последовательности, заданной формулами:
        a(2n) = a(n) + a(n-1),
        a(2n+1) = a(n) — a(n-1),
        a(0) = a(1) = 1.

        1 1 2 0 3 1

        n = 0  ---> 1 1
        n = 1 a(2) = a(1) + a(0) = 1 + 1 = 2
        a(3) = a(1) - a(0) = 1 - 1 = 0
        n = 2 a(4) = a(2) + a(1) = 2 + 1 = 3
        a(5) = a(2) - a(1) = 2 - 1 = 1

        sequence(m) = ?
 */

public class TaskPractice {
    /* public static int sequenceRecursive(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else if (n % 2 == 0) {
            return sequenceRecursive(n / 2) + sequenceRecursive(n / 2 - 1);
        } else {
            return sequenceRecursive(n / 2) - sequenceRecursive(n / 2 - 1);
        }
    }
}

*/
    public static int sequence(int m) {
        if (m == 0 || m == 1) return 1;
        if (m % 2 == 0) return sequence(m / 2) + sequence(m / 2 - 1);
        else return sequence(m / 2) - sequence(m / 2 - 1);
    }
}
