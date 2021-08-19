package Lesson15;

public class StringUtils {


    public static double div(String num1, String num2) throws NullPointerException, ArithmeticException, NumberFormatException {
        if (num1 == null || num2 == null){
            throw new NullPointerException("num1 == null || num2 == null");
        }

        if (num1.equals(" ")|| num2.equals(" ")){       //можно метод isEmpty
            throw new NullPointerException("первое или второе число не установлено");
        }

        double number1 = Double.parseDouble(num1);
        double number2 = Double.parseDouble(num2);

        if (number2 == 0){
            throw new ArithmeticException("делить на 0 нельзя");
        }


        return number1/number2;
    }


}
