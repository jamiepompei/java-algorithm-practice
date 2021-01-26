package OtherSources;


import java.util.Arrays;

/**
 * An array contains n numbers ranging from 0 to n-2. There is exactly one number is repeated in the array.
 * You need to write a program to find that duplicate number. For example, if an array with length 6
 * contains numbers {0, 3, 1, 2, 3}, then duplicated number is 3.
 *
 * Write a program to delete the duplicate.
 *
 */
public class FindDuplicateNumInArray {
    public int[] duplicateNum(int[] arrayWithDups){
       Arrays.sort(arrayWithDups);

       int[] result = new int[arrayWithDups.length];
       int previous = arrayWithDups[0];

       for(int i = 1; i < arrayWithDups.length; i++){
           int next = arrayWithDups[i];

           if(previous != next){
               result[i] = next;
           } else{
               previous = next;
           }
       }
        return result;
    }
}
