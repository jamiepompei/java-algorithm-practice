package OtherSources;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class PrintFirstNonRepeatedValueOfString {

    public char printNonRepeatedValue(String str){
        //use linked hash map since they maintain insertion order and order matters

        Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();

        char[] charArray = str.toCharArray();

        for(Character ch : charArray){
            if(!map.containsKey(ch)){
                map.put(ch, 1);
            } else{
                int frequency = map.get(ch);
                map.put(ch, ++frequency);
            }
        }

       for (Map.Entry<Character, Integer> entry: map.entrySet()){
           if(entry.getValue() == 1){
               return entry.getKey();
           }
       }
       throw new RuntimeException("there are no non-repeating characters");
    }
}
