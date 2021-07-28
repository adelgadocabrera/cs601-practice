package practice;

import java.util.ArrayList;
import java.util.Locale;

/**
 * A class to help translate an alphanumeric
 * "phone number" to the appropriate digits.
 *
 *  Example:
 *   - input: CSROCKS
 *   - output: 2776257
 *
 * @author srollins
 *
 */

/**
 * Translates the String alpha to a String
 * containing the digit representation of
 * each character in alpha.
 *
 * alpha must contain exactly seven characters. The
 * method returns null if alpha is of incorrect length.
 *
 * Letters may be upper or lower case.
 * A digit in alpha will be translated to the
 * same digit in the result.
 *
 * The translation is as follows.
 * 1 -> 1
 * 'ABC' -> 2
 * 'DEF' -> 3
 * 'GHI' -> 4
 * 'JKL' -> 5
 * 'MNO' -> 6
 * 'PQRS' -> 7
 * 'TUV' -> 8
 * 'WXYZ' -> 9
 * 0 -> 0
 *
 * Any other characters in alpha are considered invalid
 * and will cause the method to return null.
 *
 * @param alpha
 * @return
 */

public class PhoneNumberTranslation {
    private static final ArrayList<String> TRANSLATIONS = new ArrayList<>();
    private static final int maxPhoneNumberLength = 7;

    static {
                TRANSLATIONS.add("0");
                TRANSLATIONS.add("1");
                TRANSLATIONS.add("ABC");
                TRANSLATIONS.add("DEF");
                TRANSLATIONS.add("GHI");
                TRANSLATIONS.add("JKL");
                TRANSLATIONS.add("'MNO");
                TRANSLATIONS.add("PQRS");
                TRANSLATIONS.add("TUV");
                TRANSLATIONS.add("WXYZ");
    }
    public String alphaToNumber(String alpha) {
        //REPLACE WITH YOUR SOLUTION
        if(!isCorrectLength(alpha)) return null;
        if(!hasCorrectChars(alpha)) return null;

        String alphaLowerCased = alpha.toLowerCase();
        String output = "";
        int len = alphaLowerCased.length();

        for (int i = 0; i < len; i++ ){
            char ch = alphaLowerCased.charAt(i);

            if(Character.isDigit(ch)){
                output += ch;
                continue;
            }

            for(int j = 0; j < TRANSLATIONS.size(); j++){
                String translationElem = TRANSLATIONS.get(j).toLowerCase();
                if(translationElem.indexOf(ch) >= 0) {
                   output = output + j;
                   break;
                }
            }
        }
        return output;
    }

    private boolean isCorrectLength(String alpha){
        return alpha.length() == maxPhoneNumberLength;
    }

    private boolean hasCorrectChars(String alpha){
        for(int i = 0; i < alpha.length(); i++){
           char ch = alpha.charAt(i);
           boolean isDigit = Character.isDigit(ch);
           boolean isString = Character.isAlphabetic(ch);
           if(!isDigit && !isString){
               return false;
           }
        }
        return true;
    }

}
