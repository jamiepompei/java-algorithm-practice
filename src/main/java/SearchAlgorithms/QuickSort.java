package SearchAlgorithms;

/**
 * Sort array in place via quicksort (Recursive)
 *
 * QuickSort is a divide and conquer algortihm, which means the original list is divided into
 * multiple lists, each of them sorted individually, and then sorted output is merged to produce
 * the sorted list.
 */
public class QuickSort {


    public static void quickSort(int[] array, int left, int right) {
        if (left >= right) {
            return;
        }
        //pick the mid-point pivot
        int pivot = array[left + (right - left) / 2];
        //partition these elements around the pivot
        int index = partition(array, left, right, pivot);
        //sort each side of the partition
        quickSort(array, left, index - 1);
        quickSort(array, index, right);

    }

    public static int partition(int[] array, int left, int right, int pivot) {
        while (left <= right) {
            //while these elements are in the right place, keep moving left. walk through until there
            //is an element bigger than the pivot, as this should be on the right side
            while (array[left] < pivot) {
                left++;
            }
            //while these elements are in the right place, keep moving inwards. walk through until there
            //is an element less than the pivot, as this should be on the left side
            while (array[right] > pivot) {
                right--;
            }
            //swap the values and move the indicies
            if (left <= right) {
                swap(array, left, right);
                left++;
                right--;
            }
        }
        //left is the partition point so return this
        return left;
    }

    public static void swap(int[] array, int left, int right){
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }
}

