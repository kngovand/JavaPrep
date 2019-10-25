public class PowerOfThree {
    public static boolean isPowerOfThree(int n) {
        if(n < 1) {
            return false;
        }

        while(n%3 == 0) {
            n /= 3;
        }

        return n == 1;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfThree(27));
        System.out.println(isPowerOfThree(14));
    }
}
