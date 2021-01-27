package OtherSources;

import java.util.HashMap;
import java.util.Map;

/**
 * print the duplicate ints of an array
 */
public class RepeatedNumbersInAnArrayOfDuplicates {
    public void printDuplicates(int[] array){
        Map<Integer, Integer> map = new HashMap<>();

        //fill hashmap with values in array
        for(int num : array){
            if(!map.containsKey(num)){
                map.put(num, 1);
            } else{
                int frequency = map.get(num);
                map.put(num, ++frequency);
            }
        }

        for(Map.Entry<Integer, Integer> entrySet : map.entrySet()){
            if(entrySet.getValue() > 1){
                System.out.println(entrySet.getKey());
            }
        }
    }
}
