package OtherSources;

import Drills.ArrayList;
import com.sun.codemodel.internal.JForEach;

import java.util.*;

/**
 * Given a string, count the number of vowels
 */
public class FindAllVowelsInString {

    public int countVowels(String str){
        int counter = 0;

        if(str.length() == 0 || str == null){
            return 0;
        }

        str = str.toLowerCase();

        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));

        for(int i =0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(vowels.contains(ch)){
                counter++;
            }
        }
        return counter;
    }

    // With Streams
    public int countVowelsStream(String str){

        int numOfVowels = (int) str.toLowerCase().chars().mapToObj(i -> (char) i)
                            .filter(c -> "aeiou".contains(String.valueOf(c)))
                                .count();
    }




}

