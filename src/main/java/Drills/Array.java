package Drills;

public class Array {
    //write a method that will return the second largest num in an array of non-sorted unique positive ints.

    public int secondLargestNum(int[] array){
        //assume that the largest value is the first value in the array
        int max = array[0];
        int secondLargestNum = 0;

        //if the array is empty, return -1
        if(array.length == 0){
            return - 1;
        }

        for (int i = 1; i < array.length - 1 ; i++) {
        //if the value at index 1 (one to the right of the starting value, which is max, is greater than the mex value,
            if(array[i] > max){
                //assign max to a temporary value
                int temp = array[i];
                //assign max to the secondLargestNum, as the previous max is now the second largest
                secondLargestNum = max;
                //assign temp to max, as temp is handing off the maximum value
                max = temp;
            }
        }
        return secondLargestNum;
    }

    /**
     * ////////////////////////////////////////////////////  STRING ARRAY UTILS /////////////////////////////////////////
     */
    /**
     *
     *@param array an array of String objects
     * @return the first element in the array
     */
    public String getFirstElement(String[] array){
        String firstElement = array[0];
        return firstElement;
    }


}
