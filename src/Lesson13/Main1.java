package Lesson13;

import java.util.ArrayList;
import java.util.Iterator;


public class Main1 {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(3);
        nums.add(7);
        nums.add(1);
        nums.add(5);
        nums.add(1);


        //for (доступен только там где есть индексы)
        for (int i = 0; i < nums.size(); i++) {
            System.out.println(nums.get(i));
        }

        //for each (доступно каждой коллекции)
        for (Integer num : nums) {
            System.out.println(num);
        }

        //с помощью итератора
        for (Iterator<Integer> iter = nums.iterator(); iter.hasNext(); ) {
            System.out.println(iter.next());
        }

    }
}