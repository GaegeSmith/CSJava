public class Smith922 {
    public static void main(String[] args) {
        System.out.println("Hello there");
        System.out.println(reverse("Hello there"));
    }
    private static String reverse(String reversee) {
        // init a result to add each letter to
        String result = "";
        // loop backwards through the string and concat the letter to result
        for (int i = reversee.length() - 1; i >= 0; i--) {
            result += reversee.substring(i, i+1);
        }
        // return result
        return result;
    }
}
