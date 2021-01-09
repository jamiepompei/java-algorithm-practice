package LeetCode;

public class MergeSortedArray {

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
}
