package Lesson13_2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class CollectionsUtilImpl implements CollectionUtils {


    @Override
    //1234534567
    public Collection<Integer> union(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        ArrayList<Integer> union = new ArrayList<>();
        union.addAll(a);
        union.addAll(b);
        return union;

    }

    @Override
    //345345
    public Collection<Integer> intersection(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        ArrayList<Integer> intersection = new ArrayList<>();
        for (Integer num : a) {
            if (b.contains(num)) {
                intersection.add(num);
            }
        }
        for (Integer num : b) {
            if (a.contains(num)) {
                intersection.add(num);

            }
        }
        return intersection;
    }

    @Override
    //1234567
    public Set<Integer> unionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws
            NullPointerException {
        HashSet<Integer> unionWithoutDuplicate = new HashSet<>();
        unionWithoutDuplicate.addAll(a);
        unionWithoutDuplicate.addAll(b);
        for (Integer num : b) {
            if (a.contains(num)) {
                unionWithoutDuplicate .add(num);
            }
        }

        return unionWithoutDuplicate;

    }


    @Override
    //345
    public Set<Integer> intersectionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        HashSet<Integer> intersectionWithoutDuplicate = new HashSet<>();
        for (Integer num : a) {
            if (b.contains(num)) {
                intersectionWithoutDuplicate.add(num);
            }
        }
        for (Integer num : b) {
            if (a.contains(num)) {
                intersectionWithoutDuplicate.add(num);

            }
        }
        return intersectionWithoutDuplicate;

    }

    @Override
    //1267
    public Collection<Integer> difference(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        ArrayList<Integer> difference = new ArrayList<>();
        for (Integer num : a) {
            if (b.contains(num)) {
                difference.remove(num);
            } else {
                difference.add(num);
            }
        }
        for (Integer num : b) {
            if (a.contains(num)) {
                difference.remove(num);
            } else {
                difference.add(num);
            }
        }
        return difference;
    }
}