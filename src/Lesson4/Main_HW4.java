package Lesson4;

public class Main_HW4 {
    public static void main(String[] args) {
        String text = "У меня все хорошо, замечательно, у меня все - получается!".replaceAll("[,!-]+"," ");
                System.out.println(text);
    }
}
