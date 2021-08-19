package Lesson5;

public class Main2 {
    public static void main(String[] args) {
        int[][] nums = new int[5][5];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if(i >= j ){
                    System.out.print(nums[i][j] + " ");
                }else{
                    System.out.print(" " + " ");
                }
                                            }
            System.out.println();
        }
    }
}