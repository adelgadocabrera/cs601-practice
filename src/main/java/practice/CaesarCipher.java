package practice;

/**
 * Encrypt a message using the Caesar Cipher.
 * @author srollins
 *
 */
public class CaesarCipher {
    private final int MAX_SHIFT = 26;
    private final int LOWER_CASE_A = 97;
    private final int UPPER_CASE_A = 65;
    private final int LOWER_CASE_Z = 122;
    private final int UPPER_CASE_Z = 90;
    private final int NUMBER_OF_CHARS = 26;


    /**
     * Returns the message encrypted using the given shift
     * amount.
     *
     * If the shift is greater than 26 the method returns null.
     * If the message contains any characters that are not upper
     * or lower case letters the method returns null.
     *
     * Example: (abc, 2) -> cde
     *
     * @param message
     * @param shift
     * @return
     */
    public String encrypt(String message, int shift) {
        // REPLACE WITH YOUR SOLUTION
        if(shift > MAX_SHIFT) return null;
        String output = "";
        for(int i = 0; i < message.length(); i++){
            int ascii = (int) message.charAt(i);
            int newAsciiValue = ascii + shift;

            if(!isValidChar(ascii)) return null;

            if(isLowerCase(ascii)){
                if(newAsciiValue > LOWER_CASE_Z) newAsciiValue -= NUMBER_OF_CHARS;
            } else if(isUpperCase(ascii)){
               if(newAsciiValue > UPPER_CASE_Z) newAsciiValue -= NUMBER_OF_CHARS;
            }
            output += (char) newAsciiValue;
        }

        return output;
    }

    private boolean isValidChar(int ascii){
        return (ascii >= LOWER_CASE_A && ascii <= LOWER_CASE_Z)
                || (ascii >= UPPER_CASE_A && ascii <= UPPER_CASE_Z);
    }

    private boolean isLowerCase(int ascii){
        return ascii >= LOWER_CASE_A && ascii <= LOWER_CASE_Z;
    }

    private boolean isUpperCase(int ascii){
        return ascii >= UPPER_CASE_A && ascii <= UPPER_CASE_Z;
    }

}
