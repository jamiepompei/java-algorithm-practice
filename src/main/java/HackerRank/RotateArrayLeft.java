package HackerRank;


/**
 * A left rotation operation on an array shifts each of the array's elements  unit to the left. For example, if  left rotations are performed on array , then the array would become . Note that the lowest index item moves to the highest index in a rotation. This is called a circular array.
 *
 * Given an array  of  integers and a number, , perform  left rotations on the array. Return the updated array to be printed as a single line of space-separated integers.
 *
 * Function Description
 *
 * Complete the function rotLeft in the editor below.
 *
 * rotLeft has the following parameter(s):
 *
 * int a[n]: the array to rotate
 * int d: the number of rotations
 * Returns
 *
 * int a'[n]: the rotated array
 * Input Format
 *
 * The first line contains two space-separated integers  and , the size of  and the number of left rotations.
 * The second line contains  space-separated integers, each an .
 *
 * Constraints
 *
 * Sample Input
 *
 * 5 4
 * 1 2 3 4 5
 * Sample Output
 *
 * 5 1 2 3 4
 * Explanation
 *
 * When we perform  left rotations, the array undergoes the following sequence of changes:
 * [1,2,3,4,5] - > [2,3,4,5,1] -> [3,4,5,1,2] - > [4,5,1,2,3] -> [5,1,2,3,4]
 */

public class RotateArrayLeft {
     //Store the first d elements in a temp array
    // shift the rest of the arr[]
    //store back the D elements

    public int[] rotateLeft(int[] arr, int d){

    // create temp array of size d
    int[] temp = new int[d];

    // copy first d element in array temp
        for(int i = 0; i < d; i++){
            temp[i] = arr[i];
        }

    // move the rest element to index
    // zero to N-d
       for(int i = d; i < arr.length; i++){
           arr[i-d] = arr[i];
    }

    // copy the temp array element
    // in origninal array
        for(int i = 0; i < d; i++){
            arr[i + arr.length - d] = temp[i];
    }
        return arr;
}

}
