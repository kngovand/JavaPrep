import java.util.Scanner;

public class IpDefanger {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = "";

        input = scan.nextLine();
        System.out.println(defang(input));
    }

    public static String defang(String input) {
        String output = "";
        char[] array = input.toCharArray();

        for(char c : array) {
            if(c=='.') {
                output += "[.]";
            }
            else {
                output += c;
            }
        }
        return output;
    }
}
