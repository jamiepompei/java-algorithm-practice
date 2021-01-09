package LeetCode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class LeetCode {

    /**
     * Reverse A String
     * Write a function that reverses a string. The input string is given as an array of characters char[].
     *
     * Do not allocate extra space for another array, you must do this by modifying the input array in-place with 0(1) extra memory
     *
     * You may assume all the characters consist of printable ascii characters.
     *
     * Example 1:
     * Input: ["h", "e", "l", "l", "o"]
     * Output: ["o", "l", "l", "e", "h"]
     *
     *
     * Example 2:
     * Input: ["H", "a", "n", "n", "a", "h"]
     * Output: ["h", "a", "n", "n", "a", "h"]
     *
     * Method with two pointers moving in different directions:
     */

    public void reverseString(char[] s){
        int start = 0;
        int end = s.length - 1;

        //start pointer moves forward in the array and the end pointer moves backwards,
        //uses a temp char placeholder to not write over anything
        //flips values until the start pointer and the end pointer converge, at which point the program ends
        while(start < end){
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
    }


    /**
     * Contains Duplicate
     *
     * Given an array of integers, find if the array contains any duplicates.
     *
     * Yur function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.
     *
     * Example 1
     * Input: [1,2,3,1]
     * Output: true
     *
     * Example 2
     * Input: [1,2,3,4]
     * Output: false
     *
     * Example 3
     * Input: [1,1,1,3,3,4,3,2,4,2]
     * Output: true
     */

    //Solution #1 with a stream
    public boolean containsDuplicateStream(int[] nums){

        if(nums.length <= 1){
            return false;
        }

        List<Integer> numList = Arrays.stream(nums)
                        .distinct()
                            .boxed()
                                .collect(Collectors.toList());

        return numList.size() != nums.length;
    }

    //Solution #2 Sorting
    public boolean containsDuplicateSort(int[] nums){
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i++) {
            if(nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;
    }

    //Solution #3 HashSet
    public boolean containsDuplicatesSet(int[] nums){
        Set<Integer> set = new HashSet<>();
        for(int element: nums){
            if(set.contains(element)) return true;
            set.add(element);
        }
        return false;
    }

    /**
     * Count primes
     *
     * Count the number ofprime numbers less thana non-negative number, n.
     *
     *
     * Example 1:
     *
     * Input: n = 10
     * Output: 4
     * Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
     * Example 2:
     *
     * Input: n = 0
     * Output: 0
     * Example 3:
     *
     * Input: n = 1
     * Output: 0
     *
     *The Sieve of Aratosthenes is one of the most efficient ways to find all prime numbers up to n.
     *
     */

    public int countPrime(int n){
        boolean [] isPrime = new boolean[n];

        for (int i = 2; i <n ; i++) {
            isPrime[i] = true;
        }

        //Loop's ending condition is i*i < n instead of i<sqrt(n)
        //to avoid repeatedly calling an expensive fn sqrt()
        for(int i =2; i * i < n; i++){
             if(!isPrime[i]) continue;
             for(int j = i* i; j < n; j+=i){
                 isPrime[j] = false;
             }
        }
        int count = 0;
        for (int i = 2; i < n; i++) {
            if(isPrime[i]) count++;
        }
        return count;
    }

    /**
     * Merge Sorted Array
     *
     * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
     *
     * The number of elements  initialized in nums1 and nums2 are m and n respectively. You may assume that nums1 has enough space (size that is equal to m + n) to hold additional elements from nums2.
     *
     *
     *
     * Example 1:
     *
     * Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
     * Output: [1,2,2,3,5,6]
     * Example 2:
     *
     * Input: nums1 = [1], m = 1, nums2 = [], n = 0
     * Output: [1]
     */

    public void merge(int[] nums1, int m, int[] nums2, int n){
        //since there is room at the end of the array, start at the end
        //three pointers are needed: one to start at the end of nums1, one to start at the end of nums2 and one to keep track of our current position

        m--;
        n--;
        int index = nums1.length -1;

        while(index >= 0){
            //check if one of the poiners reaches the end of the array

            if(m < 0){
                nums1[index] = nums2[n];
                n--;
            }else if(n < 0){
                nums1[index] = nums1[m];
                m--;
            }else{
                if(nums1[m] > nums2[n]){
                    nums1[index] = nums1[m];
                    m--;
                } else{
                    nums1[index] = nums2[n];
                    n--;
                }
            }
        }
    }


    /**
     * A message containing letters from A-Z can be encoded into numbers using the following mapping:
     *
     * 'A' -> "1"
     * 'B' -> "2"
     * ...
     * 'Z' -> "26"
     * To decode an encoded message, all the digits must be mapped back into letters using the reverse of the mapping above (there may be multiple ways). For example, "111" can have each of its "1"s be mapped into 'A's to make "AAA", or it could be mapped to "11" and "1" ('K' and 'A' respectively) to make "KA". Note that "06" cannot be mapped into 'F' since "6" is different from "06".
     *
     * Given a non-empty string num containing only digits, return the number of ways to decode it.
     *
     * The answer is guaranteed to fit in a 32-bit integer.
     *
     *
     *
     * Example 1:
     *
     * Input: s = "12"
     * Output: 2
     * Explanation: "12" could be decoded as "AB" (1 2) or "L" (12).
     * Example 2:
     *
     * Input: s = "226"
     * Output: 3
     * Explanation: "226" could be decoded as "BZ" (2 26), "VF" (22 6), or "BBF" (2 2 6).
     * Example 3:
     *
     * Input: s = "0"
     * Output: 0
     * Explanation: There is no character that is mapped to a number starting with 0. The only valid mappings with 0 are 'J' -> "10" and 'T' -> "20".
     * Since there is no character, there are no valid ways to decode this since all digits need to be mapped.
     * Example 4:
     *
     * Input: s = "1"
     * Output: 1
     *
     */

    public int numDecodings(String s){
        //dp array stores the maximum number of ways tod decode the string up to that index,
        //the index represents the number of characters we have
        int[] dp = new int[s.length() + 1];

        dp[0] = 1;
        dp[1] = s.charAt(1) == '0' ? 0 : 1;

        for (int i = 2; i < s.length() ; i++) {

            int oneDigit = Integer.valueOf(s.substring(i - 1, i));
            int twoDigits =  Integer.valueOf(s.substring(i - 2, i));

            if(oneDigit >= 1){
                dp[i] += dp[i - 1];
            }
            if(twoDigits >= 10 && twoDigits <= 26){
                dp[i] += dp[i - 2];
            }
        }
        return dp[s.length()];
    }


}
