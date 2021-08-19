package Lesson4;

public class Main {
    public static void main(String[] args) {
        String password = "daakj2h565jhg";
        // слабый, средний или сильный пароль
        // слабый < 8 символов
        // средний > 8  символов и содержит цифру
        // сложный > 8  символов, содержит цифру и есть хоть одна большая буква

       if (password.length() < 8) {
           System.out.println(" Это слабый пароль, он меньше 8 символов ");
           return;
       }

      String[] numbers = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9",};
        int countNums = 0;
        for(int i = 0; i < numbers.length; i++) {
           if (password.contains(numbers[i])){
               countNums++;
           }
        }

        if (countNums ==0) {
            System.out.println("Пароль слабый, он не содержит чисел");
            return;
        }

        String alphabet = "abcdefghijklmnopqrstuvwxyz".toUpperCase();
        int countUppers = 0;
        for (int i =0; i < alphabet.length(); i++) {
            if(password.contains(alphabet.charAt(i)+"")){
                countUppers++;
            }
        }

        if(countUppers > 0 && countNums > 0) {
            System.out.println( "Пароль сильный");
        } else {
            System.out.println(" Пароль средней сложности");
        }

        }


        }





