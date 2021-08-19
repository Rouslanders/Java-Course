package Lesson3;

public class Main_HW4 {
    public static void main(String[] args) {
        int[] massiv1 = {2, 5, 8, 9, 7};
        int[] massiv2 = {1, 3, 4, 6, 0};

        if (massiv1.length > massiv2.length) {
            System.out.println("Массив 1 больше");
        } else if (massiv1.length < massiv2.length) {
            System.out.println("Массив 2 больше");
        } else {
            System.out.println("Массивы равны");
        }
    }
}
