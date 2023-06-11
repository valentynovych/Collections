package task5;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListTime implements SpeedTest {
    private static final int ARRAY_SIZE = 1_000_000;
    ArrayList<Integer> integerArrayList = new ArrayList<>(ARRAY_SIZE);

    public void fillArray() {
        Random randomInt = new Random(Integer.MAX_VALUE);
        for (int i = 0; i < ARRAY_SIZE; i++) {
            Integer newElem = randomInt.nextInt();
            integerArrayList.add(newElem);
        }
        System.out.println("ArrayList size() : " + integerArrayList.size());
    }

    @Override
    public void addLast() {
        Integer addedElem = 242424;
        long before = System.nanoTime();
        integerArrayList.add(addedElem);
        long after = System.nanoTime();
        long resultTime = (after - before);
        System.out.println("ArrayList - add last element: " + resultTime + " ns");

    }

    @Override
    public void addFirstPart() {
        Integer addedElem = 242424;
        long before = System.nanoTime();
        integerArrayList.add(242424, addedElem);
        long after = System.nanoTime();
        long resultTime = (after - before);
        System.out.println("ArrayList - add in first part element: " + resultTime + " ns");

    }

    @Override
    public void getLast() {
        long before = System.nanoTime();
        Integer lastElem = integerArrayList.get(ARRAY_SIZE - 1);
        long after = System.nanoTime();
        long resultTime = (after - before);
        System.out.println("ArrayList - get last element: " + resultTime + " ns");

    }

    @Override
    public void getFirstPart() {
        long before = System.nanoTime();
        Integer getElem = integerArrayList.get(242424);
        long after = System.nanoTime();
        long resultTime = (after - before);
        System.out.println("ArrayList - get with first part element: " + resultTime + " ns");
    }

    @Override
    public void removeLast() {
        long before = System.nanoTime();
        integerArrayList.remove(ARRAY_SIZE - 1);
        long after = System.nanoTime();
        long resultTime = (after - before);
        System.out.println("ArrayList - remove last element: " + resultTime + " ns");
    }

    @Override
    public void removeFirstPart() {
        long before = System.nanoTime();
        integerArrayList.remove(242424);
        long after = System.nanoTime();
        long resultTime = (after - before);
        System.out.println("ArrayList - remove with first part element: " + resultTime + " ns");
    }
}
