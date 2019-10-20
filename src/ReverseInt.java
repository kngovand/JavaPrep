import java.util.*;
// Todo: integer overflows - COMPLETE
public class ReverseInt {
    public static int reverse(int x) {
        if(x > 2147483647 || x < -2147483647) return 0;

        char[] chars = ("" + x).toCharArray();
        char[] chars2 = new char[chars.length];
        int counter = chars2.length-1;
        int result = 0;

        for(int i = 0; i < chars.length; i++) {
            if(chars[i] == '-') {
                chars2[i] = chars[i];
                continue;
            }
            chars2[counter] = chars[i];
            counter--;
        }
        try {
            result = Integer.parseInt(String.valueOf(chars2));
        }
        catch(Exception e) {
            System.out.println(e);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(reverse(-123));
    }
}
