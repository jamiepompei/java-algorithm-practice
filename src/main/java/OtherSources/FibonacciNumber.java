package OtherSources;

public class FibonacciNumber {
    /**
     * The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,
     *
     * F(0) = 0, F(1) = 1
     * F(n) = F(n - 1) + F(n - 2), for n > 1.
     * Given n, calculate F(n).
     *
     *
     *
     * Example 1:
     *
     * Input: n = 2
     * Output: 1
     * Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.
     * Example 2:
     *
     * Input: n = 3
     * Output: 2
     * Explanation: F(3) = F(2) + F(1) = 1 + 1 = 2.
     * Example 3:
     *
     * Input: n = 4
     * Output: 3
     * Explanation: F(4) = F(3) + F(2) = 2 + 1 = 3.
     *
     * Write a function that takes in an integer n and returns the nth Fibonacci number.
     *
     * Important note: the fibonacci sequence is often defined with its first two numbers as F0 = 0 and F1=1
     * For the purposes of this question, the first Fibonacci number is F0, therefore getNthFib(1) is equal
     * to F0. getNthFib(2) is equal to F1, etc
     */
    public static int getNthFibRecur(int n){
        //recursive approach

        if(n == 2){
            return 1;
        } else if ( n == 1){
            return 0;
        } else{
            return getNthFibRecur(n-1) + getNthFibRecur(n-2);
        }
    }
}
