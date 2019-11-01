public class ClimbingStairs {
    public static int climbStairs(int n) {
        return permutation(0, n);
    }

    public static int permutation(int i, int n) {
        if(i > n) {
            return 0;
        }
        if(i == n) {
            System.out.println("test");
            return 1;
        }
        return permutation(i + 1, n) + permutation(i + 2, n);
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(20));
    }
}
