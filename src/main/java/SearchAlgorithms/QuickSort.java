package SearchAlgorithms;

/**
 * Sort array in place via quicksort (iterative and Recursive)
 *
 * QuickSort is a divide and conquer algortihm, which means the original list is divided into
 * multiple lists, each of them sorted individually, and then sorted output is merged to produce
 * the sorted list.
 */
public class QuickSort {
    private int[] input;
    private int length;

    public void sort(int[] numbers){
        if(numbers.length == 0 || numbers == null){
            return;
        }

        this.input = numbers;
        length = numbers.length;
        quickSort(0, length - 1);
    }
    //in place quick sort algo recursively
    private void quickSort(int low, int high) {
        int i = low;
        int j = high;
        //pivot is the middle index
        int pivot = input[low + (high - low)/ 2];

        //divide into two arrays
        while(i <= j){
            /**
             * In each iteration, we will identify a number from left side which is greater then the
             * pivot value, and a number from right side which is less then the pivot value. Once
             * search is complete, we can swap both numbers.
             */
            while(input[i] < pivot){
                i++;
            }
            while(input[j] > pivot){
                j--;
            }
            if(i <= j){
                swap(i, j);
                //move index to next position in both sides
                i++;
                j--;
            }
        }
        //calls quiuck sort method recursively
        if(low < j){
            quickSort(low, j);
        }
        if(i < high){
            quickSort(i, high);
        }
    }

    public void swap(int low, int high){
        int temp = input[low];
        input[low] = input[high];
        input[high] = temp;
    }
}
