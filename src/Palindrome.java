public class Palindrome {
    public boolean isPalindrome(String s) {
        boolean condition = false;

        if(s.equals("") || s.equals(" ") || s.length() == 1) return true;

        s = s.replaceAll("[^a-zA-Z]", "");
        s = s.toLowerCase();
        char[] c = s.toCharArray();

        if(c.length == 2) {
            if(c[0] != c[1]) {
                return false;
            }
        }

        for(int i = 0; i < c.length/2; i++) {
            int length = c.length-1;
            if(c[i] == c[length-i]) {
                condition = true;
                continue;
            }
            else if(c[i] != c[length-i]) {
                return false;
            }
        }
        return condition;
    }
}
