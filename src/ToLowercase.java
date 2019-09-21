public class ToLowercase {
    public static void main(String[] args) {
        System.out.println(toLowerCase("Hello"));
    }
    public static String toLowerCase(String str) {
        char[] array = str.toCharArray();
        String result = "";

        for(int i = 0; i < array.length; i++) {
                char letter = Character.toLowerCase(array[i]);
                array[i] = letter;
        }

        for(char c : array) {
            result += c;
        }
        return result;
    }
}
