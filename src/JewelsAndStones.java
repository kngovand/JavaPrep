//Given N amount of stones, find which are jewels. Jewels and stones are distinct.

public class JewelsAndStones {

    public static void main(String[] args) {
        String jewel = "aA", stone = "aAbbbb";
        System.out.println(jewels(jewel, stone));
    }

    public static int jewels(String jewel, String stone) {
        int result = 0;
        char[] jArray = jewel.toCharArray();
        char[] sArray = stone.toCharArray();

        for (int i = 0; i < sArray.length; i++) {
            for (int j = 0; j < jArray.length ; j++) {
                if(jArray[j] == sArray[i]) {
                    result++;
                }
            }
        }
        return result;
    }
}
