package OtherSources;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CountVowelsAndConsosntantsString {

    //take string input and print out the number of vowels and consonants

    public void printVowelsAndConsonants(String str){
        int vowelCount = 0;
        int consonantCount = 0;
        Set<Character> vowels = new HashSet(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        Set<Character> consonants = new HashSet(Arrays.asList('b', 'c', 'd', 'f', 'g', 'h','j'
                                    ,'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z'));

        if(str.length() == 0 || str.equals(null)){
            vowelCount = 0;
            consonantCount = 0;
            System.out.println("there are " + vowelCount + " vowels and " + consonantCount + " consonants in this string");
        }

        for(int i = 0; i < str.length(); i++){
            if(vowels.contains(str)){
                vowelCount++;
            } else{
                consonantCount++;
            }
        }
        System.out.println("there are "+ vowelCount + " vowels and " + consonantCount + " consonants in the string");

    }
}
