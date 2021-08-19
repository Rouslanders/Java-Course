package Lesson4;

public class Main_HW3 {
    public static void main(String[] args) {
        String text = "У меня все хорошо, замечательно, у меня все - получается!";
        String[] solution = text.split(" ");
        for(String divider : solution) {
            System.out.println(divider);
        }
    }
}
