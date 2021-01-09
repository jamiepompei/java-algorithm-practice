package OtherSources;

import java.util.Collections;
import java.util.HashMap;

public class LongIncrConsequentSub {

    /**
     Given N elements, write a program that prints the length of the longest increasing subsequence whose adjacent element difference is one.
     Examples:

     Input : a[] = {3, 10, 3, 11, 4, 5, 6, 7, 8, 12}
     Output : 6
     Explanation: 3, 4, 5, 6, 7, 8 is the longest increasing subsequence whose adjacent element differs by one.
     Input : a[] = {6, 7, 8, 3, 4, 5, 9, 10}
     Output : 5
     Explanation: 6, 7, 8, 9, 10 is the longest increasing subsequence

     APPROACH: Iterate through every element and find out the longest increasing subsequence. For any particular element, find the length
     of the subsequence starting from that element. Print the longest length of the subsequence thus formed. The time complexity of this appraoch will be O(n^2)
     */

    public int LongIncrConseqSubseq(int array[]){
        //create a hashmap to save latest consequenct
        //number as key and its length as the value
        HashMap<Integer, Integer> map = new HashMap<>();

        //put first element as key and its length as value
        map.put(array[0], 1);

        for(int i = 1; i < array.length; i++){
            //check if last consequent of arr[i] exists or not
            if(map.containsKey(array[i-1])){
                //put the updated consequent number
                //and increment its value(length)
                map.put(array[i], map.get(array[i] - 1) + 1);

                //remove the last consequent number
                map.remove(array[i] - 1);
            }

            //if there is no last consequent of
            //array[i] then put array[i]
            else{
                map.put(array[i], 1);
            }
            return Collections.max(map.values());
        }
    }
}
