package Lesson5;

public class Main1 {
    public static void main(String[] args) {
        int[][] nums = { {2, 5, 3, 6},
                         {5, 4, 8, 9},
                         {3, 5, 6, 7}};

        for(int i = 0; i < nums.length; i++){
            for (int j = 0; j < nums[i].length; j++){
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }
    }
}
