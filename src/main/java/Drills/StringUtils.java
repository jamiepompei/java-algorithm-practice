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
}
