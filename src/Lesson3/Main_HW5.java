package Lesson3;

public class Main_HW5 {
    public static void main(String[] args) {
        int[] massiv1 = {2, 5, 8, 9, 7};
        int max = massiv1[0];

        for (int i = 0; i < massiv1.length; i++){
            if (max< massiv1[i]) {
                max = massiv1[i];
            }
        }
        System.out.println(max);
    }
}
