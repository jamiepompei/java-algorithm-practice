package CodeWars;

/**
 * Complete the method/function so that it converts dash/underscore delimited words into camel casing. The first word within the output should be capitalized only if the original word was capitalized (known as Upper Camel Case, also often referred to as Pascal case).
 *
 * Examples
 * toCamelCase("the-stealth-warrior"); // returns "theStealthWarrior"
 *
 * toCamelCase("The_Stealth_Warrior"); // returns "TheStealthWarrior"
 */
public class ConvertStringToCamelCaseAndRemoveDelimiter {

    public String converCamelCase(String s){
        //if the length is 0, return empty string
        if(s.length() == 0){
            return s;
        }

        //iterate through the string and capitalize each letter after the symbol
        for(int i = 0; i< s.length(); i++){
            if(s.charAt(i) == '-' || s.charAt(i) == '_'){
                s.substring(i, i+1).toUpperCase();
            }
        }
        StringBuilder sb = new StringBuilder(s);
    //if the current value == '-' or '_' delete it
        for(int i = 0; i< sb.length(); i++){
            if(s.charAt(i) == '-' || s.charAt(i) == '_'){
                sb.deleteCharAt(i);
            //replace that previous symbols value with the srting value of the upper case version of the character
                sb.replace(i, i+1, String.valueOf(Character.toUpperCase(sb.charAt(i))));
            }
        }

        return sb.toString();
    }

    //alternate solution with char array
    //less efficient than using string builder as there is a new copy of the string per each addition
    public String convertCamelCaseCharArray(String s){
        String result = "";
        char[] sAsCharArray = s.toCharArray();

        for(int i = 0; i < s.length(); i++){
            //if the current value in the array equals one of the cymbals
            if((sAsCharArray[i] == '_') || (sAsCharArray[i] == '-')){
                //append the uppercase string value of the character to the empty string
                result += Character.toString(sAsCharArray[i+1]).toUpperCase();
            } else{
                //else append the char to the string
                result += sAsCharArray[i];
            }
        }
        //return the string
        return result;

    }

}
