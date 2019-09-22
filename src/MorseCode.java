// Now, given a list of words, each word can be written as a concatenation of the Morse code of each letter.
// For example, "cba" can be written as "-.-..--...", (which is the concatenation "-.-." + "-..." + ".-").
// We'll call such a concatenation, the transformation of a word.
// Return the number of different transformations among all words we have.

import java.util.HashSet;
import java.util.Set;

public class MorseCode {
    public static void main (String[] args) {
        String[] input = {"rwjje","aittjje","auyyn","lqtktn","lmjwn"};
        System.out.println(getMorse(input));
    }

    public static int getMorse(String[] words) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....",
                "..", ".---","-.-", ".-..","--","-.","---", ".--.","--.-",
                ".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

            Set<String> seen = new HashSet();
            for(String word: words) {
                StringBuilder code = new StringBuilder();
                for (char c : word.toCharArray()) {
                    code.append(morse[c - 'a']);
                }
                seen.add(code.toString());
            }
        return seen.size();
    }
}
