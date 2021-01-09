package Drills;

import java.util.Arrays;
import java.util.Locale;

public class StringUtils {

    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public String camelCase(String str) {

        str = str.substring(0,1).toUpperCase() + str.substring(1).toLowerCase();

        return str;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public String reverse(String str){
        StringBuilder sb = new StringBuilder();

        sb.append(str).reverse();

        String reversedStr = sb.toString();

        return reversedStr;
    }

    //revrese in place
    public String reverseAlt(String str){
        char[] characters = str.toCharArray();
        int left = 0;
        int right =  str.length();

        while(left <= right){
            swap(characters, left, right);
            left++;
            right--;
        }
        return new String(characters);
    }

    public void swap(char[] array, int left, int right){
        char temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }

    public String reverseAltSolutin(String string){
        String[] splitString = string.split("");
        String[] reversed = new String[string.length()];
        int j = 0;

        for(int i = splitString.length - 1; i >= 0; i--){
            reversed[j] = splitString[i];
            j++;
        }

        String reversedStr = Arrays.toString(reversed);
        return reversedStr;
    }

}
