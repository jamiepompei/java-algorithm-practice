package HackerRank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *  student is taking a cryptography class and has found anagrams to be very useful. Two strings
 *  are anagrams of each other if the first string's letters can be rearranged to form the second
 *  string. In other words, both strings must contain the same exact letters in the same exact
 *  frequency. For example, bacdc and dcbac are anagrams, but bacdc and dcbad are not.
 *
 * The student decides on an encryption scheme that involves two large strings. The encryption
 * is dependent on the minimum number of character deletions required to make the two strings
 * anagrams. Determine this number.
 *
 * Given two strings, a and , b that may or may not be of the same length, determine the minimum
 * number of character deletions required to make  and  anagrams. Any characters can be deleted
 * from either of the strings.
 */

public class MakingAnagrams {

    public int makeAnagram(String a, String b){
      //passes 2 of 3 initial test cases


        Map<Character, Integer> count = new HashMap<Character, Integer>();
        Integer total = 0;

        //fill count map with frequency of a chars
        for(char c : a.toCharArray()){
            if(count.containsKey(c)){
                count.put(c, count.get((c) + 1));
            } else
                count.put(c, 1);
        }

        //fill count map with frequency of b chars
        for(char c : b.toCharArray()){
            if(count.containsKey(c)){
                count.put(c, count.get((c) - 1));
            } else
                count.put(c,1);
        }
        List<Integer> values = new ArrayList<Integer>(count.values());
        for(Integer v : values){
            total += Math.abs(v);
        }
        return total;

    }
}
