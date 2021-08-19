package Lesson3;

public class Main4 {

    public static void main(String[] args) {
        int[] massiv = {7,3,1,8,1,8,0};
        int[] inverted = new int [massiv.length];
        inverted[0] = massiv[6];
        inverted[1] = massiv[0];
        inverted[2] = massiv[1];
        inverted[3] = massiv[2];
        inverted[4] = massiv[3];
        inverted[5] = massiv[4];
        inverted[6] = massiv[5];

        for(int i =0; i < inverted.length; i++){
            if(i==0){  inverted[0] = massiv[6];
                 }else{
                inverted[i] = massiv[i-1];

            }
            System.out.println(inverted[i]);
        }

    }
}
