package ImmutableVsMutable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list = Collections.unmodifiableList(list);
        list.add(3);

        List<Integer> list1 = new ArrayList<>();
        list1 = List.of(1,2,3,4,5,6,7,8);
        list1.add(5);

    }
}
