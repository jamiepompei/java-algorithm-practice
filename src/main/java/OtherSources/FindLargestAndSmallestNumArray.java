package OtherSources;

/**
 * Find the largest and smallest number in an array
 */
public class FindLargestAndSmallestNumArray {

    public int[] largestAndSmallestNum(int[] array){
        if(array.length == 0){
            return new int[]{};
        }

        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;


        for(int num : array){
            if(num > largest){
                largest = num;
            } else if( num < smallest){
                smallest = num;
            }
        }

        return new int[]{smallest, largest};

    }

}
