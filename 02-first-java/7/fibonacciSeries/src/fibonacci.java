class Fibonacci {
    // Non-static method to calculate Fibonacci numbers
    public int fibonacciCalculation(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacciCalculation(n - 1) + fibonacciCalculation(n - 2);
    }
}
