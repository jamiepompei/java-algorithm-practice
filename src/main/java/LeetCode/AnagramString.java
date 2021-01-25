package LeetCode;

import java.util.HashMap;
import java.util.Map;

/**
 * Two strings,  and , are called anagrams if they contain all the same characters in the same frequencies.
 * For example, the anagrams of CAT are CAT, ACT, TAC, TCA, ATC, and CTA.
 *
 * Complete the function in the editor. If  and  are case-insensitive anagrams, print "Anagrams";
 * otherwise, print "Not Anagrams" instead.
 */
public class AnagramString {


    public boolean anagramCheckerPrac(String stringA, String stringB){
        if(stringA.length() != stringB.length()){
            return false;
        }

        Map<Character, Integer> map = new HashMap<Character, Integer>();


        stringA.toLowerCase();
        stringB.toLowerCase();

      for(int i = 0; i < stringA.length(); i++){
          char letter = stringA.charAt(i);
          if(map.containsKey(letter)){
              int frequency = map.get(letter);
              map.put(letter, ++frequency);
          } else {
              map.put(letter, 1);
          }
      }

      for(int i = 0; i < stringB.length(); i++){
          char letter = stringB.charAt(i);
          if(map.containsKey(letter)){
              int frequency = map.get(letter);
              map.put(letter, ++frequency);
          } else {
              map.put(letter, 1);
          }
      }

      for(int i = 0; i < stringA.length(); i++){
          char letter = stringA.charAt(i);
          if(!map.containsKey(letter)){
              return false;
          } else{
              if(map.containsKey(letter)){
                  int frequency = map.get(letter);
                  map.put(letter, --frequency);
              }
          }
      }

      //if you make it all the way here, return true
        return true;

    }






    //put all of the letters of string b in a HashMap, with letters as key and num of occurences as value
    //(increment the frequency by 1 every time you put the same letter in the map)
    //iterate over the letters of String A and look each letter up in the hashmap
    //if it's not there or it's frequency is 0, it is not an anagram
    //if it's there, decrement the frequency by one
    public Boolean anagramChekcer(String a, String b){

        if(a.length() != b.length()){
            return false;
        }

        Map<Character, Integer> map = new HashMap<>();

        a = a.toLowerCase();
        b= b.toLowerCase();

        for(int i = 0; i < a.length(); i++){
            char letter = b.charAt(i);

            if(!map.containsKey(letter)){
                map.put(letter, 1);
            } else{
                Integer frequency = map.get(letter);
                map.put(letter, ++frequency);
            }
        }

        //test each letter in the string against the key in the map
        //return false if the letter is absent in map or freuency is 0 (not an anagram)
        //otherwise, decrease the frequency by 1

        for(int i =0; i < a.length(); i++){
            char letter = a.charAt(i);
            if(!map.containsKey(letter)){
                return false;
            } else{
                Integer frequency = map.get(letter);
                map.put(letter, --frequency);
            }
        }
        //if we make it all the way here, there is an anagram
        return true;
    }
}
