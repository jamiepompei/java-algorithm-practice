package CodeWars;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Your task is to make a function that can take any non-negative integer as an argument and return it with its digits in descending order. Essentially, rearrange the digits to create the highest possible number.
 *
 * Examples:
 * Input: 42145 Output: 54421
 *
 * Input: 145263 Output: 654321
 *
 * Input: 123456789 Output: 987654321
 */

public class SortAnIntInDescendingOrder {
    public int reverseInt(int num) {
        List<String> numList = new ArrayList<>();
        String numAsStr = String.valueOf(num);

        for(int i = 0; i < numAsStr.length(); i++){
            numList.add(numAsStr.substring(i, i+1));
        }
        Collections.sort(numList, Collections.reverseOrder());

        String sortedNums = "";
        for(String digit : numList){
            sortedNums.concat(digit);
        }

        Integer result = Integer.parseInt(sortedNums);
        return result;
    }
}
