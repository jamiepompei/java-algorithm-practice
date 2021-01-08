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

    /**
     * @param stringArray an array of String objects
     * @return the second element in the array
     */
    public String getSecondElement(String[] stringArray){
        String secondToLastElement = stringArray[1];
        return secondToLastElement;
    }

    /**
     * @param stringArray an array of String objects
     * @return the last element in the array
     */
    public String getLastElement(String[] stringArray){
        String lastElement = stringArray[stringArray.length - 1];
        return lastElement;
    }

    /**
     * @param stringArray an array of String objects
     * @return the second to last element in the array
     */
    public String getSecondToLastElement(String[] stringArray){
        String secondToLastElement = stringArray[stringArray.length - 2];
        return secondToLastElement;
    }

    /**
     * ////////////////////////////////////////////////////     INTEGER ARRAY UTILS /////////////////////////////////////////
     *
     */

    /**
     * * @param intArray an array of integers
     *      * @return the sum of `intArray`
     */
    public Integer getSum(Integer[] intArray){
        Integer sum = 0;

        for (Integer element:intArray) {
            sum += element;
        }
        return sum;
    }

    /**
     * @param intArray an array of integers
     * @return the product of `intArray`
     */
    public Integer product(Integer[] intArray){
        Integer product = 1;

        for (Integer element: intArray) {
            product *= element;
        }
        return product;
    }


    /**
     * @param intArray an array of integers
     * @return the sum of `intArray` divided by number of elements in `intArray`
     */
    public Double sumAndDivide(Integer[] intArray){
        Integer sum = 0;
        Integer numOfElems = intArray.length;


        for (Integer element: intArray) {
            sum += element;
        }

        Double average = (double) sum / numOfElems;

        return average;
    }
}
