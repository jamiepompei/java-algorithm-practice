package SearchAlgorithms;

public class BinarySearch {

    /**
     * Write a function that takes in a sorted array of ints as well as a target integer. The fn should use
     * the binary search algo to determine if the target int is contained in the array and should return its
     * index if it is, otherwise -1. The array is sorted.
     *
     * Recursive Binary Search (if target is not found, return -1, but ask interviewer what
     * they would like to be returned)
     */

    public int binarySearchRecursive(int[] array, int target){
        return binarySearchHelperRecursive(array,target, 0, array.length - 1);
    }

    public int binarySearchHelperRecursive(int[] array, int target, int left, int right){
        //if the left pointer has passed the right pointer, the target does not exist in the array
        if( left > right){
            return -1;
        }
        //find the mid point of the array
        int middle = Math.round((left + right)/2);
        //the value at the mid point of the array
        int potentialMatch = array[middle];

        if(potentialMatch == target){
            return middle;
            //if the potential match is larger than the target, than the mid point needs to be moved one to the left of it's current position
        } else if(potentialMatch > target ){
            return binarySearchHelperRecursive(array, target, left, middle - 1);
        } else{
            //if the potential match is less than the target, than the mid point needs to be move one to the right of it's current position
            return binarySearchHelperRecursive(array, target, middle + 1, right);
        }
    }


    /**
     * Iterative Binary Search (helper fn not needed)
     */

    public int iterativeBinarySearch(int[] array, int target){
        int left = 0;
        int right = array.length -1;

        //if the left point becomes greater than the right point, the target value does not exist in the array
        while(left <= right){
            //find the mid point of the array
            int middle = Math.round((left + right) / 2);
            //value at the mid point of the array
            int potentalMatch = array[middle];

            if(potentalMatch == target){
                return middle;
                //if the potential match is larger than the target, than move the mid point one to the left
            } else if(potentalMatch > target){
                right = middle - 1;
            } else{
                //if the potential match is less than the target, than move the mid point one to the right
                left = middle + 1;
            }
        }
        return -1;
    }

}
