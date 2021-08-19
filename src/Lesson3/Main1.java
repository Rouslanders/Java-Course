package Lesson3;

public class Main1 {
    public static void main(String[] args) {
        int[] numbers = new int[6];
        numbers[0] = 5;
        numbers [1] =10;
        numbers[2] = 15;
        numbers [3] = 20;
        numbers [4] = 25;
        numbers [5] = 30;

        int value = 5;
        for(int i = 0; i <= 5;i ++) {
            numbers [i] = value;
            value = value + 5;
            System.out.println(numbers[i]);
        }
    }
}
