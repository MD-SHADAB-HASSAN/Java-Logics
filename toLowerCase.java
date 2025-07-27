public class toLowerCase {
    public static String toLowercase(String s) {
        String[] strarr = new String[s.length()];

        for (int i = 0; i < s.length(); i++) {
            strarr[i] = String.valueOf(s.charAt(i));
        }

        String str = String.join("", strarr);
        return str.toLowerCase();
    }

    public static void main(String[] args) {
        String s = "HeLLoWORLD";
        System.out.println(toLowercase(s));
    }
}
