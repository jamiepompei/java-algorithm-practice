package OtherSources;

public class CaesarCipherEncyrptor {

    /**
     * Given a non-empty string of lowercase letters and a non-negative integer representing a key, write a function that
     * returns a new string obtained by shifting every letter in the input string by k positions in the alphabet, where k is the key.
     *
     * Note that letters should wrap arund the alpahbet, in other words, the letter z shifted by one returns the letter a.
     *
     */

    public String caesarCypherEncryptor1(String str, int key){
        int caesarShift = key;

        char[] textToChars = str.toCharArray();
        int index = 0;

        for( char c : textToChars){
            if(c >= 97 && c <= 122){
                c %= 97;
                c += caesarShift;
                c %= 26;
                c+= 97;
            }
            textToChars[index++] = c;
        }
        return new String(textToChars);
    }

    public String caesarCypherEncryptor2(String str, int key){
        char [] newLetters = new char[str.length()];
        //takes care of the edge case for a really large key
        int newKey = key % 26;

        for(int i = 0; i <str.length(); i++){
            newLetters[i] = getNewLetter(str.charAt(i), newKey);
        }
        return new String(newLetters);
    }

    public char getNewLetter(char letter, int key){
        int newLetterCode = letter + key;
        return newLetterCode <= 122 ? (char) newLetterCode : (char) (96 + newLetterCode % 122);
    }
}
