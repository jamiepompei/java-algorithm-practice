package Drills;

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

}
