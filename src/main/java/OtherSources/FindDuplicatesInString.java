package OtherSources;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindDuplicatesInString {

    public void printAllDupsInString(String str){

        if(str.length() == 0 || str == null){
            System.out.println(0);
        }

        char[] charArray = str.toCharArray();
        Map<Character, Integer> map = new HashMap<Character, Integer>();

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
}
