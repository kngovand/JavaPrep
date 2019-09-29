import java.util.*;
// Todo: integer overflows
public class ReverseInt {
    public static int reverse(int x) {
        char[] chars = ("" + x).toCharArray();
        char[] chars2 = new char[chars.length];
        int counter = chars2.length-1;

        for(int i = 0; i < chars.length; i++) {
            if(chars[i] == '-') {
                chars2[i] = chars[i];
                continue;
            }
            chars2[counter] = chars[i];
            counter--;
        }
        int result = Integer.parseInt(String.valueOf(chars2));
        return result;
    }

    public static void main(String[] args) {
        System.out.println(reverse(-123));
    }
}
