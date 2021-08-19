package Lesson4;

public class Main_HW1 {
    public static void main(String[] args) {
        String text = "У меня все хорошо, замечательно, у меня все - получается!";
        String reverse = new StringBuffer(text).reverse().toString();
        System.out.println(text);
        System.out.println(reverse);

    }
}
