package OtherSources;


/**
 * Given: an integer array which contains numbers from 1-100 but one number is missing. Write a program
 * to find the missing number in an array. You cannot use any open source library or Java API method which
 * solves this problem.
 */
public class MissingNumberArray {

    public int missingNumberArray(int[] array, int totalCount){
        //sum of the series (only works for 1 missing num) n(n+1)/2

        int expectedSum = totalCount * ((totalCount + 1)/2);
        int actualSum = 0;
        for( int num : array){
            actualSum += num;
        }
        return expectedSum - actualSum;
    }
}
