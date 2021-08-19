package Lesson3;

public class Main_HW2 {
    public static void main(String[] args) {
        int[] massiv1 = {2, 5, 8, 9, 7};
        int[] massiv2 = {1, 3, 4, 6, 0};

        for (int i = 0; i < massiv1.length; i++) {
            if (massiv1[i] % 2 == 0) {
                System.out.println(massiv1[i]);
            }

        }
        System.out.println(" ");
        for (int i = 0; i < massiv2.length; i++) {
            if (massiv2[i] % 2 == 0) {
                System.out.println(massiv2[i]);

            }
        }
    }
}