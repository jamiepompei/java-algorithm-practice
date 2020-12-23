package OtherSources;

public class IsIntegerPalindrome {

    /**
     * Is the integer a palindrome?
     */

    public boolean isPalindrome(int n) {
        // a negative number and a number divisible by 10 cannot be a palindrome. If the number ends in 0 the reverse of
        // that number will start with a 0
        if (n < 0 || (n % 10 == 0 && n != 0)) {
            return false;
        }

        int reversedNumber = 0;

        while (n > reversedNumber) {
            int pop = n % 10;
            reversedNumber = reversedNumber * 10 + pop;
            n = n / 10;
        }
        return n == reversedNumber || n == reversedNumber / 10;
    }
}

/**
 * The big O notation for this algorithm is O(n)
 */