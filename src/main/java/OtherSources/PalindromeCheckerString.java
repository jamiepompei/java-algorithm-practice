package OtherSources;

public class PalindromeCheckerString {

  //  Write code to check if a String is palindrome or not. Return TRUE if yes, FALSE if not.

    public Boolean palindromeChecker(String string){
        Boolean isPalindrome = false;

        if(string.equalsIgnoreCase(reverse(string))){
            isPalindrome = true;
        }
         return isPalindrome;
    }

    //palindrome is equal to itself forwards and backwards

    public String reverse(String stringToRev){
        StringBuilder reverseStr = new StringBuilder();

        reverseStr.append(stringToRev);
        reverseStr.reverse();
        String result = reverseStr.toString();

        return result;
    }

    //alternate solution not using string builder or helper reverse method

    public Boolean palindrome(String str){
        int i = 0;
        int x = str.length() - 1;
        while(i < x){
            if(str.charAt(i) != str.charAt(x)){
                return false;
            }
            i++;
            x--;
        }
        return true;
    }

    //create an empty string
    //create a for loop that starts at the end of the passed in string, set up loop to iterate backwards
    //fill empty string in loop with values of the passed in string
    //use String.equals() method to compare the strings

    public boolean isPalindromeChekerAlt(String str){
        String revStr = "";

        for(int i = str.length() -1; i >= 0; i--){
            revStr += str;
        }
        return str.equals(revStr);
    }



}
