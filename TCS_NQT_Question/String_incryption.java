package TCS_NQT_Question;

public class String_incryption {

    public static String decodingString(String str) {

        String ans = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) <= 'u') {
                ans += (char) (str.charAt(i) + 5);
            } else {
                ans += (char) (str.charAt(i) - 'v' + 'a');

            }
        }
        return ans;
    }

    public static void main(String args[]) {
        // TODO code application logic here
        String str = "reply";
        System.out.println(" dicoding Strig " + decodingString(str));

    }
}
