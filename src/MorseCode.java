// Now, given a list of words, each word can be written as a concatenation of the Morse code of each letter.
// For example, "cba" can be written as "-.-..--...", (which is the concatenation "-.-." + "-..." + ".-").
// We'll call such a concatenation, the transformation of a word.
// Return the number of different transformations among all words we have.

public class MorseCode {
    public static void main (String[] args) {
        String[] input = {"gin", "zen", "gig", "msg"};
        System.out.println(getMorse(input));
    }

    public static int getMorse(String[] words) {
        int count = 0;
        String[] output = new String[words.length];
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....",
                "..", ".---","-.-", ".-..","--","-.","---", ".--.","--.-",
                ".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        // To char array
        for (int i = 0; i < words.length ; i++) {
            String result = "";
            char[] charArray = words[i].toCharArray();
            // converting ASCII to morse code
            for (int j = 0; j < charArray.length ; j++) {
                Character c = charArray[j];
                int value = c.charValue() - 97;
                result += morse[value];
            }
            output[i] = result;
            System.out.println(result);
        }
        //Counter for matching morse codes
        for (int i = 0; i < output.length ; i++) {
            for (int j = 0; j < output.length; j++) {
                if(output[i] == (output[j])) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}
