package Lesson13_2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);

        HashSet<Integer> b = new HashSet<>();
        b.add(3);
        b.add(4);
        b.add(5);
        b.add(6);
        b.add(7);

        CollectionsUtilImpl utils = new CollectionsUtilImpl();
        Collection<Integer> union = utils.union(a, b);
        System.out.println(union);

        Collection<Integer> intersection = utils.intersection(a, b);
        System.out.println(intersection);

        Collection<Integer> unionWithoutDuplicate = utils.unionWithoutDuplicate(a, b);
        System.out.println(unionWithoutDuplicate);

        Collection<Integer> intersectionWithoutDuplicate = utils.intersectionWithoutDuplicate(a, b);
        System.out.println(intersectionWithoutDuplicate);

        Collection<Integer> difference = utils.difference(a, b);
        System.out.println(difference);
    }

}

