public class Engine {

    static boolean isArab = true;

    public static int calculate(String data) {
        int arg1 = 0;
        int arg2 = 0;
        String str1;
        String str2;
        int result = 101;
        int[] arab = {10, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        String[] rome = {"x","i","ii","iii","iv","v","vi","vii","viii","ix"};

        data = data.replaceAll(" ", "").toLowerCase();

        if (data.charAt(0) == 'i' || data.charAt(0) == 'v' || data.charAt(0) == 'x') {
            if (data.contains("+")) {
                str1 = data.substring(0, data.indexOf('+'));
                for (int i = 0; i < rome.length; i++) {
                    if (rome[i].equals(str1)) arg1 = arab[i];
                }
                str2 = data.substring(data.indexOf('+') + 1);
                for (int i = 0; i < rome.length; i++) {
                    if (rome[i].equals(str2)) arg2 = arab[i];
                }
                result = arg1 + arg2;
                isArab = false;
            } else if (data.contains("-")) {
                str1 = data.substring(0, data.indexOf('-'));
                for (int i = 0; i < rome.length; i++) {
                    if (rome[i].equals(str1)) arg1 = arab[i];
                }
                str2 = data.substring(data.indexOf('-') + 1);
                for (int i = 0; i < rome.length; i++) {
                    if (rome[i].equals(str2)) arg2 = arab[i];
                }
                result = arg1 - arg2;
                isArab = false;
            } else if (data.contains("*")) {
                str1 = data.substring(0, data.indexOf('*'));
                for (int i = 0; i < rome.length; i++) {
                    if (rome[i].equals(str1)) arg1 = arab[i];
                }
                str2 = data.substring(data.indexOf('*') + 1);
                for (int i = 0; i < rome.length; i++) {
                    if (rome[i].equals(str2)) arg2 = arab[i];
                }
                if (arg1 == 0 || arg2 == 0) return result;
                result = arg1 * arg2;
                isArab = false;
            } else {
                str1 = data.substring(0, data.indexOf('/'));
                for (int i = 0; i < rome.length; i++) {
                    if (rome[i].equals(str1)) arg1 = arab[i];
                }
                str2 = data.substring(data.indexOf('/') + 1);
                for (int i = 0; i < rome.length; i++) {
                    if (rome[i].equals(str2)) arg2 = arab[i];
                }
                result = arg1 / arg2;
                isArab = false;
            }
        } else {
            try {
                if (data.contains("+")) {
                    arg1 = Integer.parseInt(data.substring(0, data.indexOf('+')));
                    arg2 = Integer.parseInt(data.substring(data.indexOf('+') + 1));
                    if (arg1 == 0 || arg2 == 0) return result;
                    result = arg1 + arg2;
                } else if (data.contains("-")) {
                    arg1 = Integer.parseInt(data.substring(0, data.indexOf('-')));
                    arg2 = Integer.parseInt(data.substring(data.indexOf('-') + 1));
                    if (arg1 == 0 || arg2 == 0) return result;
                    result = arg1 - arg2;
                } else if (data.contains("*")) {
                    arg1 = Integer.parseInt(data.substring(0, data.indexOf('*')));
                    arg2 = Integer.parseInt(data.substring(data.indexOf('*') + 1));
                    if (arg1 == 0 || arg2 == 0) return result;
                    result = arg1 * arg2;
                } else {
                    arg1 = Integer.parseInt(data.substring(0, data.indexOf('/')));
                    arg2 = Integer.parseInt(data.substring(data.indexOf('/') + 1));
                    if (arg1 == 0 ||arg2 == 0) return result;
                    result = arg1 / arg2;
                }
            } catch (Exception e) {
                System.out.println("Неверное выражение");
            }
        }
        return result;
    }
}
