package HackerRank;

import java.util.Arrays;

public class MinimumSwapsArrays {

    /**
     * You are given an unordered array consisting of consecutive integers  [1, 2, 3, ..., n] without any duplicates. You are allowed to swap any two elements. You need to find the minimum number of swaps required to sort the array in ascending order.
     *
     * For example, given the array  we perform the following steps:
     *
     * i   arr                         swap (indices)
     * 0   [7, 1, 3, 2, 4, 5, 6]   swap (0,3)
     * 1   [2, 1, 3, 7, 4, 5, 6]   swap (0,1)
     * 2   [1, 2, 3, 7, 4, 5, 6]   swap (3,4)
     * 3   [1, 2, 3, 4, 7, 5, 6]   swap (4,5)
     * 4   [1, 2, 3, 4, 5, 7, 6]   swap (5,6)
     * 5   [1, 2, 3, 4, 5, 6, 7]
     *
     * It took  5 swaps to sort the array.
     * Complete the function minimumSwaps in the editor below. It must return an integer representing the minimum number of swaps to sort the array.
     */

    public int minimumSwaps(int[] array){
        int numOfSwaps = 0;
        int length = array.length;

        int[] temp = Arrays.copyOfRange(array, 0, length);

        Arrays.sort(temp);

        for (int i = 0; i < length; i++) {
            //checks to see if the element is at the right place or not
            if(array[i] != temp[i]){
                numOfSwaps++;

                //swap the current element with the right index
                //so that arr[0] to arr[i] is sorted
                swap(array, i, indexOf(array, temp[i]));
            }

        }
    return numOfSwaps;
    }


    public void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public int indexOf(int[] array, int element){
        for (int i = 0; i < array.length; i++) {
            if(array[i] == element){
                return i;
            }
        }
        return -1;
    }
}
