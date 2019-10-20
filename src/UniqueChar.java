import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class UniqueChar {
    public static int firstUniqChar(String s) {
        char[] chars = s.toCharArray();
        int result = -1;

        ArrayList<Character> list = new ArrayList<>();
        for(char c : chars) {
            list.add(c);
        }

        for(int i = 0; i < list.size(); i++ ) {
            char character = list.get(i);
            list.set(i, null);
            if(list.contains(character)) {
                list.set(i, character);
                continue;
            }
            else if(!list.contains(character)) {
                result = i;
                break;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(firstUniqChar("loveleetcode"));
    }
}

