import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;
// Attempt with IntStream - not working
public class SingleNumber {
    public static int singleNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int number = i;
            boolean contains = IntStream.of(nums).anyMatch(x -> x == nums[number]);
            if(contains) {
                return nums[number];
            }
        }
        return 0;
    }
// Successful attempt with HashMap
    public static int singleNumberMap(int[] nums) {
        int result = 0;
        HashMap<Integer, Integer> map = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            map.put(i, nums[i]);
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
                int key = entry.getKey();
                int value = entry.getValue();
                map.replace(key, 0);
                if(map.containsValue(value)) {
                    map.replace(key, value);
                }
                else {
                    result = value;
                }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {4,2,1,2,1};
        System.out.println(singleNumberMap(nums));
    }
}
