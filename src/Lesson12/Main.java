package Lesson12;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(7);
        numbers.add(5);
        numbers.add(4);
        numbers.add(6);
        numbers.add(3);
        numbers.remove(0);
        System.out.println(numbers);
    }
}
