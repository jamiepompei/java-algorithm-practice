package OtherSources;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * create a program to print the duplicates in a string
 */

public class FindDuplicatesInString {

    public void printAllDupsInString(String str){

        if(str.length() == 0 || str == null){
            System.out.println(0);
        }

        char[] charArray = str.toCharArray();
        Map<Character, Integer> map = new HashMap();

        for(Character ch : charArray){
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch) + 1);
            } else{
                map.put(ch, 1);
            }
        }

       //iterate through the map to print each character that occurs more than 1x
        Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();
        for(Map.Entry<Character, Integer> entry : entrySet){
            if(entry.getValue() > 1){
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }


    }

    public void printDuplicatesStringPrac(String str){

        Map<Character, Integer> map = new HashMap();

        char[] charArray = str.toCharArray();

        if(str.length() == 0 || str.equals(null)){
            System.out.println(0);
        }

        for(char letter : charArray){
            if(!map.containsKey(letter)){
                map.put(letter, 1);
            } else{
                int frequency = map.get(letter);
                map.put(letter, +frequency);
            }
        }

        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() >= 2){
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }


    }

    public void duplicateStringPrac(String str){
        Map<Character, Integer> map = new HashMap<>();
        //check to ensure the length of the string is greater than 0 or that it does not equal null
        if(str.length() == 0 || str.equals(null)){
            System.out.println(0);
        }

        //add all of the characters from the string to the map
        char[] charArray = str.toCharArray();
        for(Character ch : charArray){
            if(map.containsKey(ch)){
                int frequency = map.get(ch);
                map.put(ch, ++frequency);
            } else{
                map.put(ch, 1);
            }
        }

        for(Map.Entry<Character, Integer> entrySet : map.entrySet()){
            if(entrySet.getValue() > 1){
                System.out.println("Character: " + entrySet.getKey() + " occurs " + entrySet.getValue() + " times.");
            }
        }


    }
}
