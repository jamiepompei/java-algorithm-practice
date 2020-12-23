package SearchAlgorithms;

public class BubbleSort {

    /**
     * Prompt: Write a function that takes in an array of integers and returns a sorted
     * version of that array. Use Bubble Sort algo to sort that array.
     *
     * Bubble sort sorts in place so
     * abstract the 'swap' action into a helper method for cleaner code.
     */

    public int[] bubbleSort(int[] array){
        //if the array's length is 0, return a new empty array
        if(array.length == 0){
            return new int[]{};
        }

        //boolean flag to keep track of sorting and counter to point to
        //the remaining portion of array to sort
        int counter = 0;
        boolean isSorted = false;

        while(!isSorted){
            isSorted= true;
            //i < array.length - 1 - counter moves the pointer according to how many values
            // have been sorted, if it's already sorted it won't be sorted again (or traversed again)
            for (int i = 0; i < array.length -1 - counter; i++) {
            //if the current value in the array is larger than the value directly to the right of it
                if(array[i] > array[i+1]){
            //'triangle hat' swap, see helper method below for code
                    swap(array, i, i+1);
            //flip sorted flag to false
                    isSorted = false;
                }
            }
            //incremenet counter to track number of swaps to move the pointer of the array iterator
            counter++;
        }
        return array;
    }

    public void swap(int[] array, int i, int j){
        //int j represents array[i+1]
        //temp value to hold the value at position j to not overwrite it
        int temp = array[j];
        //assign the value at position i to position j
        array[j] = array[i];
        //assign the value in temp to position i
        array[i] = temp;
    }


}
