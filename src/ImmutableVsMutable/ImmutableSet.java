package ImmutableVsMutable;

import java.util.*;

public class ImmutableSet {
    public static void main(String[] args) {
        Set<Integer> list = new HashSet<>();
        list.add(2);
        list.add(3);
        list.add(4);
        list = Collections.unmodifiableSet(list);
        list.add(3);

        Set<Integer> list1 = Set.of(1,2,3);
        list1.add(5);

    }
}
