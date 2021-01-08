package OtherSources;

import java.util.HashSet;
import java.util.Set;

public class FindLengthOfLongestConsecutiveSubsequence {
    //create an empty hash

    //insert all array elements to hash

    //do the following for every element arr[i]:
    //check if this element is the starting point of a subsequence:
    //to check this, look for arr[i]-1 in the hash, if not found then this is the start of the subsequence
    //if this element is the first element, then count the number of elements in the consecutive sequence starting with this element.
    //iterate from arr[i] + 1 til the last element that can be found

    //if the count is more than the previous longest subsequence found, then update this

    public int findLengthLongestSubsequence(Integer[] array){
        //create variable for answer
        int answer = Integer.MIN_VALUE;

        //create an empty hashset
        Set<Integer> set = new HashSet<>();

        //insert all array elements to hashset
        for (int i = 0; i < array.length; i++)
            set.add((array[i]));

        //check each possible sequence from the start
        //then update optimal length
        for (int i = 0; i < array.length; i++) {

            //if the current element is the starting
            //element of a sequence
            if(!set.contains(array[i] - 1)){

                //then check for next elements
                //in the sequence
                int j = array[i];
                while(set.contains(j)){
                    j++;

                //update optimal length if this
                //length is more
                if( answer < j - array[i])
                    answer = j - array[i];
                }
            }

        }
        return answer;
    }






}
