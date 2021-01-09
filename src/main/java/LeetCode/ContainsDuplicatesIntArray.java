package LeetCode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ContainsDuplicatesIntArray {

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
}
