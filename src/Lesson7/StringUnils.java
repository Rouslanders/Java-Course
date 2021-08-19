package Lesson7;

public class StringUnils {
    public static void printCountWords(String text) {
        String[] words = text.split(" ");
        System.out.println(words.length);

    }

    public static void coding(String text) {
        //text ="fortran!"
        String alphabet = "abcdefghijklmnopqrstuvwxyza";
        for (int i = 0; i < text.length(); i++) {
            char currentFromText = text.charAt(i);
            int indexFromAlphabet = alphabet.indexOf(currentFromText);
            if (indexFromAlphabet == -1) {
                System.out.print(currentFromText);
            } else {
                System.out.print(alphabet.charAt(indexFromAlphabet+1));
            }
        }
    }

    public static boolean isValidEmail (String email) {
        if (!email.contains("@")) {
            System.out.println("Здесь нет @");
            return false;
        }
        int index = email.indexOf("@");
        String domain = email.substring(index+1);

        if (!domain.contains(".")){
            System.out.println("В домене нет точки");
            return false;
        }
        if (domain.startsWith(".") || domain.endsWith(".")){
            System.out.println("Домен не может начинаться и заканчиваться на точку");
            return false;
        }
        if (index==0){
            System.out.println("Домен не может начинаться на @");
            return false;
        }

        String host  = email.substring(0,index);
        if (host.startsWith(".") || host.endsWith(".")){
            System.out.println("Хост не может начинаться и заканчиваться на точку");
            return false;
        }

        if (email.contains(" ")){
            System.out.println("email не может содержать пробел");
            return false;
        }

        String befoteDomain = email.substring(0,index);
        if (domain.contains("@")){
            System.out.println("email не может не может содержать два знака @");
            return false;
        }



        System.out.println("Это валидный имэйл");
        return true;
    }
}

