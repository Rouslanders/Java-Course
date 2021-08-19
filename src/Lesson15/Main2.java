package Lesson15;
// ответ да!
//вывести надпись "пока", править нельзя, можно добавить код ниже
public class Main2 {
    public static void main(String[] args) {
        System.out.println("Привет");
        //выше нельзя править. ниже можно добавить
        try {
            System.out.println("Пока");
        }catch (Exception e){
            System.out.println("Гуд бай ");
        }
    }
}
