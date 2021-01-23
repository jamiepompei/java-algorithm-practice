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

        for(int i = 0; i< sb.length(); i++){
            if(s.charAt(i) == '-' || s.charAt(i) == '_'){
                sb.deleteCharAt(i);
                sb.replace(i, i+1, String.valueOf(Character.toUpperCase(sb.charAt(i))));
            }
        }

        return sb.toString();
    }

}
