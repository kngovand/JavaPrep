import java.util.Arrays;

public class MergeSortedArray {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i = 0; i < nums2.length; i++) {
            nums1[m] = nums2[i];
            m++;
        }
        Arrays.sort(nums1);

        for (int i = 0; i <nums1.length ; i++) {
            System.out.print(nums1[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] numsone = {1,2,3,0,0,0};
        int[] numstwo = {4,5,6};
        merge(numsone, 3, numstwo, 3);
    }

}
