package ImmutableVsMutable;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMap {
    public static void main(String[] args) {
        Map<Integer, String> stringMap = new HashMap<>();
        stringMap.put(1, "One");
        stringMap.put(2, "Two");
        stringMap.put(3, "Three");
        stringMap = Collections.unmodifiableMap(stringMap);
        stringMap.put(4,"Four");

        Map<Integer, String> stringMap1 = Map.of(1, "One", 2, "Two");
        stringMap1.put(3, "Three");
    }
}
