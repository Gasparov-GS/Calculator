public class Validator {

    private static final String PATTERN_ARAB = "^[0-9+*/\\-]+$";
    private static final String PATTERN_RIM = "^[iIvVxX+*/\\-]+$";
    private static final String FIRST_LAST_SIMBOL = "^[0-9]$";

    public static boolean isValidate(String data) {

        data = data.replaceAll(" ", "").toLowerCase();

        char[] ch = data.toCharArray();
        int count = 0;

        for (char c : ch) {
            if (c == '+' || c == '-' || c == '*' || c == '/') count++;
        }

        return (data.matches(PATTERN_ARAB) || data.matches(PATTERN_RIM))
                && (("" + data.charAt(0)).matches(FIRST_LAST_SIMBOL) || data.charAt(0) == 'i' || data.charAt(0) == 'v' ||data.charAt(0) == 'x')
                && (("" + data.charAt(data.length() - 1)).matches(FIRST_LAST_SIMBOL) || data.charAt(data.length() - 1) == 'i' || data.charAt(data.length() - 1) == 'v' ||data.charAt(data.length() - 1) == 'x')
                && (count == 1);
    }
}
