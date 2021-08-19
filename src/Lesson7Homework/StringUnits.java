package Lesson7Homework;

public class StringUnits {
    public static void reverse(String text) {
        String reverse = new StringBuffer(text).reverse().toString();
        System.out.println(text);
        System.out.println(reverse);

    }

    public static int countGlass(String text) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'а' || text.charAt(i) == 'А' || text.charAt(i) == 'e' || text.charAt(i) == 'E'
                    || text.charAt(i) == 'ё' || text.charAt(i) == 'Ё' || text.charAt(i) == 'и' || text.charAt(i) == 'И'
                    || text.charAt(i) == 'о' || text.charAt(i) == 'О' || text.charAt(i) == 'у' || text.charAt(i) == 'У'
                    || text.charAt(i) == 'э' || text.charAt(i) == 'Э' || text.charAt(i) == 'ы' || text.charAt(i) == 'Ы'
                    || text.charAt(i) == 'ю' || text.charAt(i) == 'Ю' || text.charAt(i) == 'я' || text.charAt(i) == 'Я') {
                count++;
            }
        }
        System.out.println("Количество гласных букв в строке " + count);
        return count;
    }

    public static int countSoglasnie(String text) {
        String textToLower = text.toLowerCase();
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (textToLower.charAt(i) =='б'|| textToLower.charAt(i) =='в'|| textToLower.charAt(i) =='г'
                    || textToLower.charAt(i) =='д'|| textToLower.charAt(i) =='ж'|| textToLower.charAt(i) =='з'
                    || textToLower.charAt(i) =='к'|| textToLower.charAt(i) =='л'|| textToLower.charAt(i) =='м'
                    || textToLower.charAt(i) =='н'|| textToLower.charAt(i) =='п'|| textToLower.charAt(i) =='р'
                    || textToLower.charAt(i) =='с'|| textToLower.charAt(i) =='т'|| textToLower.charAt(i) =='ф'
                    || textToLower.charAt(i) =='х'|| textToLower.charAt(i) =='ц'|| textToLower.charAt(i) =='ч'
                    || textToLower.charAt(i) =='ш'|| textToLower.charAt(i) =='щ'|| textToLower.charAt(i) =='ъ'
                    || textToLower.charAt(i) =='ь'|| textToLower.charAt(i) =='й'){
                count++;
            }
        }
        System.out.println("Количество cогласных букв в строке " + count);
        return count;
    }
}
