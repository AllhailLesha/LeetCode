package Easy;

public class FibonacciNumbers {
    public static void main(String[] args) {
        System.out.println(fib(4));
    }

    public int fib(int n) {
        int last = 1;
        int predLast = 0;

        int counter = 1;
        int fib = 0;

        if (n > 1) {
            while (counter < n) {
                fib = last + predLast;
                predLast = last;
                last = fib;
                counter++;
            }
        } else if (n < 1) {
            fib = 0;
        } else {
            fib = 1;
        }
        return fib;
    }
}
