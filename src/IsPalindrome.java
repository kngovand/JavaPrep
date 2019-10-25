public class IsPalindrome {
    public static boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z]", "");
        s = s.toLowerCase();
        char[] c = s.toCharArray();

        for(int i = 0; i < c.length/2; i++) {
            int length = c.length-1;
            if(c[i] == c[length-i]) {
                continue;
            }
            else if(c[i] != c[length-i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
}
