import java.util.ArrayList;
//Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
//Output: [4,9]

public class ArrayIntersection {
    public static int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] result;

        for (int i = 0; i < nums1.length ; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if(nums1[i] == nums2[j]) {
                    list.add(nums1[i]);
                    nums1[i] = -90000;
                    nums2[j] = -90000;
                    continue;
                }
            }
        }
        list.removeIf(i -> i.equals(-90000));
        result = new int[list.size()];

        for (int i = 0; i < result.length ; i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        int[] result = intersect(nums1, nums2);
        for(int i : result) {
            System.out.println(i);
        }
    }
}
