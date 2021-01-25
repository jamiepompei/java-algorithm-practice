package OtherSources;

import java.util.regex.Pattern;

public class CheckIfStringContainsOnlyDigits {

        public void containsOnlyDigits(String[] inputs){
            Pattern pattern = Pattern.compile(".*[^0-9].*");

            for(String input : inputs){
                System.out.println("does " + input + " is number : " + !pattern.matcher(input).matches());
            }
        }
}
