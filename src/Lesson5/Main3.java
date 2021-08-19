package Lesson5;

public class Main3 {
    public static void main(String[] args) {
        int[][] chess = new int[10][10];

        for (int i = 0; i < chess.length; i++) {
            for (int j = 0; j < chess[i].length; j++) {
                if(i % 2 == 0) { //строка четная
                    if (j % 2 == 0) {  //столбец четный
                        System.out.print("0" + " ");
                    } else { // столбец нечетный
                        System.out.print("1" + " ");
                    }
                }else { //строка нечетная
                    if (j % 2 != 0) { //столбец нечетный
                        System.out.print("0" + " ");
                    }else{ // столбец четный
                        System.out.print("1" + " ");
                    }
                }
            }
            System.out.println();
        }
    }
}