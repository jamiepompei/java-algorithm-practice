package LeetCode;

public class ReverseInteger {

    /**
     * Given a 32-bit signed integer, reverse digits of an integer.
     *
     * Note: Assume we are dealing with an environment that could only store integers within the 32-bit signed integer range: [−231,  231 − 1]. For this problem, assume that your function returns 0 when the reversed integer overflows.
     *
     * Example 1:
     *
     * Input: x = 123
     * Output: 321
     * Example 2:
     *
     * Input: x = -123
     * Output: -321
     * Example 3:
     *
     * Input: x = 120
     * Output: 21
     * Example 4:
     *
     * Input: x = 0
     * Output: 0
     */

    public int reverseInt(int x) {


        String temp = Integer.toString(x);

        if (x < 0) {
            temp = temp.substring(1, temp.length());
        }
        StringBuilder sb = new StringBuilder(temp);
        sb.reverse();
        if (x < 0) {
            sb.insert(0, "-");
        }
        try {
            Integer.parseInt(sb.toString());
        } catch (NumberFormatException e) {
            return 0;
        }
        return Integer.parseInt(sb.toString());
    }

}
