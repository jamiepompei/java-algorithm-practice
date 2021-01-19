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

    public int makeAnagramArray(String a, String b){
        //stores counters for each char in the string
        int[] a_frequencies = new int[26];
        int[] b_frequencies = new int[26];

        int min_deletions = 0;

        //loop through each string and count the char occurences, add to array
        for(int i = 0; i < a.length(); i++){
            char current_char = a.charAt(i);
            //int representation of that char, or ASCII value
            int char_to_int = (int) current_char;
            //to get position in alphabet of that current letter, subtract the ASCII value of A
            int position = char_to_int - (int)'a';
            //increment the counter of that current letter
            a_frequencies[position]++;
        }

        //same approach for string b
        for(int i = 0; i < b.length(); i++){
            char current_char = b.charAt(i);
            int char_to_int = (int) current_char;
            int position = char_to_int - (int)'a';
            b_frequencies[position]++;
        }

        //each array contains the num of occurrences of each letter in the respective string
        for(int i = 0; i < 26; i++){
            //find the abs value of the differences of the occurences at each index
            int difference = Math.abs(a_frequencies[i] - b_frequencies[i]);
            min_deletions += difference;
        }

        return min_deletions;
    }






    //solution NOT quite right, does not account for counting duplicated values
    public int makeAnagramMap(String a, String b){
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
