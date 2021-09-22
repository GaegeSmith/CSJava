public class StringLoops {
    public static void main(String[] args) {
        // System.out.println(howMany("", 'a'));

    }
    private static int howMany(String s, char chr) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == chr) {
                count++;
            }
        }
        return count;
    }
    private static String removeDoubleSpace(String text) {
        return "";
    }
}
