public class ConverArabToRoma {

    static int[] numbers = {1, 4, 5, 9, 10, 50, 100};
    static String[] letters = { "I", "IV", "V", "IX", "X", "L", "C"};

    public static String convertIntegerToRoman(int number) {

        StringBuilder romanValue = new StringBuilder();
        int n = number;

        while (n > 0) {
            for (int i = 0; i < numbers.length; i++) {
                if (n < numbers[i]) {
                    n -= numbers[i-1];
                    romanValue.append(letters[i - 1]);
                    break;
                }
            }
        }
        return romanValue.toString();
    }
}
