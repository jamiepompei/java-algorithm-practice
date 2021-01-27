package OtherSources;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Find the pairs of integers who sum is equal to a given number
 */
public class PairsOfIntegersWhoseSumEqualsAGivenNumber {
//internally uses a hash map, so not the most effeciant solution if there is a large array and
    //memory is a concern
    public int[] sumOfInts(int[] array, int sum){
        //x+y = sum
        //given y = sum - x
        Set<Integer> nums = new HashSet();

        for(int number : array){
            int potentialMatch = sum - number;
            if(nums.contains(potentialMatch)){
                return new int[] {potentialMatch, number};
            } else{
                nums.add(number);
            }
        }
        return new int[0];
    }

//two pointer approach is more effecient is memory is a concern
    public int[] sumOfNums(int[] array, int targetSum){
        int left = 0;
        int right = array.length - 1;

        Arrays.sort(array);

        while(left < right){
            int currentSum = array[left] + array[right];

            if(currentSum == targetSum){
                return new int[] {left, right};
            } else if(currentSum > targetSum){
                right -= 1;
            } else{
                left += 1;
            }
        }
        return new int[0];
    }
}
