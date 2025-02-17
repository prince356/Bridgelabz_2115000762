public class FibonacciComparison {

    public static int fibonacciRecursive(int n) {
        if (n <= 1) return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    public static int fibonacciIterative(int n) {
        int a = 0, b = 1, sum;
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }

    public static long measureTime(Runnable method) {
        long start = System.nanoTime();
        method.run();
        return System.nanoTime() - start;
    }

    public static void main(String[] args) {
        int[] fibonacciNumbers = {10, 30, 50}; // Fibonacci numbers to test

        for (int n : fibonacciNumbers) {
            System.out.println("Fibonacci(" + n + "):");

            long recursiveTime = measureTime(() -> {
                fibonacciRecursive(n);
            });
            long iterativeTime = measureTime(() -> {
                fibonacciIterative(n);
            });

            System.out.printf("Recursive: %,d ns | Iterative: %,d ns%n", recursiveTime, iterativeTime);
        }
    }
}
