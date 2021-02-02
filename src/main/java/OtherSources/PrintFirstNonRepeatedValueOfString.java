package OtherSources;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * write a program to print the first non-repeated value of a string
 */
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

    public Character printFirstNonRepeatedValuePrac(String str){
        //verify that the string is not 0 in length or equal to null

        if(str.length() == 0 || str.equals(null)){
            System.out.println("String cannot have a repeating value");
        }
        //make string into a char array
        //add each char to a linked hashmap to maintain the insertion order
        //if char exists in map, increment the value
        //else add char + 1 to the map
        //iterate through map.entry obj and return the first value that is equal to 1

        char[] charArray = str.toCharArray();
        Map<Character, Integer> map = new LinkedHashMap<>();

        for(Character ch : charArray){
            if(map.containsKey(ch)){
                int frequency = map.get(ch);
                map.put(ch, ++frequency);
            } else{
                map.put(ch, 1);
            }
        }

        for(Map.Entry<Character, Integer> entrySet : map.entrySet()){
            if(entrySet.getValue() == 1){
                return entrySet.getKey();
            }
        }
        throw new RuntimeException("there are no repeated characters");
    }
}
