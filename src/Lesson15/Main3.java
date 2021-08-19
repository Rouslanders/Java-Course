package Lesson15;

public class Main3 {
    public static void main(String[] args) {
        try {
            StringUtils.div("1","0");
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }catch (NumberFormatException e){
            System.out.println(e.getMessage());
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
    }
}
