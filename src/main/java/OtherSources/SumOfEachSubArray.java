package OtherSources;

public class SumOfEachSubArray {

    /**
     * Given an array of ints, find the sum of all possible subarrays
     *
     * Given: [1,2,3,4]
     *
     * Possible sums:
     * 1
     * 1+2
     * 1+2+3
     * 1+2+3+4
     * 2
     * 2+3
     * 2+3+4
     * 3
     * 3+4
     * 4
     */

    //A solution, that is not optimal
    public int sumOfSubArrays(int[] array){
        int sum = 0;
    //outer loop w/ i sets the start of the subarray
        for (int i = 0; i < array.length; i++) {
            //middle loop w/ j sets the end of the subarray
            for (int j = 0; j < array.length; j++) {
                //inner most loop w/ k traverses the subarray and sums the elements
                for (int k = i; k <= j ; k++) {
                    sum += array[k];
                }

            }

        }
        return sum;
    }

    //alternate solution that handles a data set with a large number of values
    public int subArray(int[] array){
        int sum = 0;

        for (int i = 0; i <array.length ; i++) {
            //array[i] represents current value in array
            //(array.length - i) # of times the element appears inside of first for loop (see above)
            //(i+1) # of loops the current element appears in
            sum = array[i] * (array.length - i) * (i + 1);
        }
        return sum;
    }
}
