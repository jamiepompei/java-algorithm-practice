package OtherSources;

public class MostCommonCharacterInAString {
    static final int alaphabet = 26;
    public char getMexOccurringChar(String str){
        //create an array to keep the count of individual characters
        int count [] = new int[alaphabet];

        //constrcut character count array from the input string
        int len = toString().length();
        for(int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }
            int max = -1; //initialize max count
            char result = ' '; //initialize result

            //traversing through the string and maintaining
            //the count of each character

            for(int i = 0; i < str.length(); i++){
                if(max < count[str.charAt(i)]){
                    max = count[str.charAt(i)];
                    result = str.charAt(i);
                }
            }
            return result;
        }


        public char mostCommonCharacterLexicographicallyFirst(char str[]){
            //used as a hash table
            int freq[] = new int[26];

            //maximum frequency
            int max = -1;

            //store max occurring character
            char result = 0;

            int len = str.length;

            //get frequency of each character of 'str'
            for(int i = 0; i < len; i++){
                if(str[i] != ' '){
                    freq[str[i] - 'a']++;
                }
            }

            //for each character where character is obtained by
            //(i + 'a') check whether it is the maximum character
            //so far and update result
            for(int i =0; i<26; i++){
                if(max < freq[i]){
                    max = freq[i];
                    result = (char) (i + 'a');
                }
            }
            return result;
        }



}
