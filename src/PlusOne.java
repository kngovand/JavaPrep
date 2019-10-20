
// Input: [1,2,3]
//Output: [1,2,4]
//Explanation: The array represents the integer 123.

public class PlusOne {
    public int[] plusOne(int[] digits) {
        int[] result = digits;
        if(digits.length == 1) {
            if(digits[digits.length-1] == 9) {
                result = new int[2];
                result[1] = 0;
                result[0] = 1;
            }

            else if(digits[digits.length - 1] == 9) {
                digits[digits.length - 1] = 0;
                digits[digits.length - 2] += 1;
            }

            else {
                digits[digits.length-1] += 1;
                result = digits.clone();
            }
        }
        return result;
    }

}
