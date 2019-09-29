public class ReverseString {
    public static void reverseString(char[] s) {
        int counter = s.length-1;
        int temp;
        for(int i = 0; i < s.length/2; i++) {
                temp = s[counter];
                s[counter] = s[i];
                s[i] = (char) temp;
                counter--;
        }
    }
    public static void main(String[] args) {
        char[] hello = {'h','e','l','l','o'};
        reverseString(hello);

        for(char c : hello) {
            System.out.println(c);
        }
    }
}
