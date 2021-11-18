import java.util.Arrays;

public class AlphabetSoup {
    /**
     * Create a char array containing all the letters of the english alphabet
     *
     * @return alphabet
     */
    char[] getAlphabet() {
        char[] alphabet = new char[26];
        for (int i = 0; i < 26; i++) {
            alphabet[i] = (char)('a' + i);
        }
        return alphabet;
    }

    /**
     * Shifts each character in the alphabet by a shift given amount
     *
     * @param alphabet array with the alphabet
     * @param shift character shifting  value
     * @return shifted alphabet
     */
    char[] shiftAlphabet(char[] alphabet, int shift) {
        char[] shifted = Arrays.copyOf(alphabet,alphabet.length);
        for (int i = 0; i < alphabet.length; i++) {
//            int letterNum = (alphabet[i] + shift -  'a') % 26 + 'a';
            int letterNum = alphabet[i] + shift;
            while (letterNum > (int) 'z') {
                letterNum -= 26;
            }
            while (letterNum < (int) 'a') {
                letterNum+= 26;
            }
            shifted[i] = (char)(letterNum);
        }
        return shifted;
    }
}
