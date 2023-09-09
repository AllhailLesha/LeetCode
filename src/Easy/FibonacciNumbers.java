package Easy;

import java.time.LocalDateTime;

public class FibonacciNumbers {
    public static void main(String[] args) {
        System.out.println(LocalDateTime.now());
        System.out.println(fib(10000000  ));
        System.out.println(LocalDateTime.now());

    }



    public static long fib(int n) {
        long last = 1;
        long predLast = 0;

        long counter = 1;
        long fib = 0;

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
