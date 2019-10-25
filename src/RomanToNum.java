// Messing with switch cases - Todo: fix prefixes
public class RomanToNum {

    public static int romanToInt(String s) {
        int result = 0;

        for (int i = 0; i <s.length() ; i++) {
            char character = s.charAt(i);

            switch(character) {
                case 'I': result += 1;
                    break;
                case 'V': result += 5;
                    break;
                case 'X': result += 10;
                    break;
                case 'L': result += 50;
                    break;
                case 'C': result += 100;
                    break;
                case 'D': result += 500;
                    break;
                case 'M': result += 1000;
                    break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("IX"));
    }

}
