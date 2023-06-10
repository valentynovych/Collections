import Comparators.ComparatorExample;
import Comparators.Person;
import ImmutableVsMutable.ImmutableList;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        List<Integer> integerList1 = new LinkedList<>();

        Set<Integer> integerSet = new HashSet<>();
        Set<Integer> integerSet1 = new TreeSet<>();
        Set<Integer> integerSet2 = new LinkedHashSet<>();

        Map<Integer, String> integerStringMap = new HashMap<>();
        Map<Integer, String> integerStringMap1 = new TreeMap<>();
        Map<Integer, String> integerStringMap2 = new LinkedHashMap<>();

        Stack<Integer> stack = new Stack<>();

        Queue<Integer> queue = new PriorityQueue<>();
        Deque<Integer> deque = new ArrayDeque<>();


        Person person = new Person("Jon", 20);
        Person person1 = new Person("Weak", 30);

        ComparatorExample example = new ComparatorExample();
        int res = example.compare(person, person1);
        System.out.println(res);




    }
}