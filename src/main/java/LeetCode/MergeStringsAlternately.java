package LeetCode;

/**
 * You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.
 *
 * Return the merged string.
 *
 *
 *
 * Example 1:
 *
 * Input: word1 = "abc", word2 = "pqr"
 * Output: "apbqcr"
 * Explanation: The merged string will be merged as so:
 * word1:  a   b   c
 * word2:    p   q   r
 * merged: a p b q c r
 * Example 2:
 *
 * Input: word1 = "ab", word2 = "pqrs"
 * Output: "apbqrs"
 * Explanation: Notice that as word2 is longer, "rs" is appended to the end.
 * word1:  a   b
 * word2:    p   q   r   s
 * merged: a p b q   r   s
 * Example 3:
 *
 * Input: word1 = "abcd", word2 = "pq"
 * Output: "apbqcd"
 * Explanation: Notice that as word1 is longer, "cd" is appended to the end.
 * word1:  a   b   c   d
 * word2:    p   q
 * merged: a p b q c   d
 *
 *
 * Constraints:
 *
 * 1 <= word1.length, word2.length <= 100
 * word1 and word2 consist of lowercase English letters.
 */
public class MergeStringsAlternately {

    public static class Solution1 {

        public String mergeAlternately(String word1, String word2) {
            int lengthWord1 = word1.length();
            int lengthWord2 = word2.length();
            int min = Math.min(lengthWord1, lengthWord2);
            StringBuilder result = new StringBuilder();

            for (int i = 0; i < min; i++){
                result.append(word1.charAt(i)).append(word2.charAt(i));
            }

            String resultString = result.toString();

            if (lengthWord1 == lengthWord2) {
                return resultString;
            } else if (lengthWord1 > lengthWord2) {
               return resultString + word1.substring(min);
            } else {
                return resultString + word2.substring(min);
            }
        }
    }

    public static class Solution2 {

        public String mergeAlternately(String word1, String word2) {
            int lengthWord1 = word1.length();
            int lengthWord2 = word2.length();
            StringBuilder result = new StringBuilder();

            char[] arrayW1 = word1.toCharArray();
            char[] arrayW2 = word2.toCharArray();

            int i = 0;
            while (i < lengthWord1 && i < lengthWord2) {
                result.append(arrayW1[i]).append(arrayW2[i++]);
            }
            if (lengthWord1 > lengthWord2) {
                return result.append(word1.substring(lengthWord2)).toString();
            } else if (lengthWord2 > lengthWord1) {
              return  result.append(word2.substring(lengthWord1)).toString();
            }
            return result.toString();
        }
    }

    public static void main(String[] args) {
        Solution1 solution = new Solution1();

        String word1 = "abc";
        String word2 = "def";
        String word3 = "ghijk";

        // equal strings
        //expected: adbecf
        System.out.println(solution.mergeAlternately(word1, word2));
        // string 1 longer
        //expected: gdheifjk
        System.out.println(solution.mergeAlternately(word3, word2));
        //string 2 longer
        //expected agbhcijk
        System.out.println( solution.mergeAlternately(word1, word3));
    }
}
