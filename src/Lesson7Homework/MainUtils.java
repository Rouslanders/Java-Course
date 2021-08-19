package Lesson7Homework;

public class MainUtils {
    public static void printsarea(int a, int b, int c) {
        int perimetr = a + b + c;
        int p = perimetr / 2;
        int s = p * (p - a) * (p - b) * (p - c);
        System.out.println(Math.sqrt(s));
    }

    public static void printChet(int i0, int i1, int i2, int i3, int i4) {
        int[] massiv = {i0, i1, i2, i3, i4};
        for (int i = 0; i < massiv.length; i++) {
            if (massiv[i] % 2 == 0) {
                System.out.println(massiv[i]);
            }
        }
    }

    public static void summ(float numerator1, float numerator2, float denominator1, float denominator2) {
        float summa = (numerator1 / denominator1) + (numerator2 / denominator2);
        System.out.println(summa);
        return;
    }

}