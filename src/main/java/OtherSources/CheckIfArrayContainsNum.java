package OtherSources;

/**
 * Check if the array contains the given value. Return a boolean.
 */

public class CheckIfArrayContainsNum {
    //iterative binary search
    public boolean containsElement(int[]array, int target){
        int left = 0;
        int right = array.length - 1;


        while(left <= right){

            int length = array.length -1;
            int middle = Math.round(length/2);
            int potentialMatch = array[middle];

            if(potentialMatch == target){
                return true;
            } else if(potentialMatch > target){
                right = middle - 1;
            } else{
                left = middle + 1;
            }
        }
        return false;
    }

}
