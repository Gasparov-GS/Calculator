import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        int result;
        boolean valid;

        // чтение данных с консоли
        Scanner scanner = new Scanner(System.in);
        String data = scanner.nextLine();

        valid = Validator.isValidate(data);

        if (valid) {
            result = Engine.calculate(data);
            if (result <= 100) {
                if (Engine.isArab) {
                    System.out.println(result);
                } else {
                    String resultRome = ConverArabToRoma.convertIntegerToRoman(result);
                    System.out.println(resultRome);
                }
            } else System.out.println("Значение числа должно быть в пределах от 1 до 10");
        } else System.out.println("Неверное выражение");
    }
}
