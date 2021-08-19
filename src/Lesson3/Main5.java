package Lesson3;

public class Main5 {
    public static void main(String[] args) {
        int[] massiv = {213,54,76,121,934,53};
        int chet = 0;
        int nechet = 0;
        for (int i = 0; i < massiv.length; i++){
            if (massiv[i]%2 == 0) {
                chet++;
            } else {
                nechet++;
            }
        }
        if (chet > nechet) {
            System.out.println("Четных больше");}
            else if (chet == nechet) {
            System.out.println("Одинаково");
        }else{
                System.out.println("нечетных больше");
            }
            }
        }


