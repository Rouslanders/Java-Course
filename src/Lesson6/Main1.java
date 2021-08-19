package Lesson6;

public class Main1 {
    public static void main(String[] args) {
        String email = "grap@rev";
        if(!email.contains("@")){
            System.out.println("Здесь нет @");
            return;
        }

        int index = email.indexOf("@");
        String domain =  email.substring(index+1);

        if(!domain.contains(".")){
            System.out.println("Здесь нет .");
            return;
        }
        if (domain.startsWith(".") || domain.endsWith(".")) {
            System.out.println("Домен не может начинаться и заканчиваться на .");
            return;
        }

        if (index == 0){
            System.out.println("Нет ничего до @");
            return;
        }

        String host = email.substring(0,index);
        if (host.endsWith(".")||host.startsWith(".")){
            System.out.println("Хост не может начинаться и заканчиваться на .");
            return;
            //проверка на спецсимволы
            //проверка на две собачки
        }

        System.out.println("Это валидный email");
    }
}
