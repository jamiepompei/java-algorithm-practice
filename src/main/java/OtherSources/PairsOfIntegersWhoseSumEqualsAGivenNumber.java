package OtherSources;

import java.util.HashSet;
import java.util.Set;

/**
 * Find the pairs of integers who sum is equal to a given number
 */
public class PairsOfIntegersWhoseSumEqualsAGivenNumber {

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
}
