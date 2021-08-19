package Lesson3;

public class Main2 {
    public static void main(String[] args) {
        int[] num = {2,4,9,3,6,8,1,13};
        int summ = 0;
        for (int i = 0; i < 8; i++) {
            if(num[i]%2==0) {summ=summ+num[i];}

        }
        System.out.println(summ);
    }
}
