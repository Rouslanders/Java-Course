package Lesson3;

public class Main_HW3 {
    public static void main(String[] args) {
        int[] massiv1 = {2, 5, 8, 9, 7};
        int[] massiv2 = {1, 3, 4, 6, 0};

        int summassiv1 = 0;
        int summassiv2 = 0;

        for (int i = 0; i < massiv1.length; i++){
            summassiv1 = summassiv1+massiv1[i];
        }

        for (int i = 0; i < massiv2.length;i++) {
            summassiv2 = summassiv2+massiv2[i];
        }

        int raznica = summassiv1-summassiv2;
        System.out.println(raznica);
    }
}