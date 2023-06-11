package task5;

import java.util.LinkedList;
import java.util.Random;

public class LinkedListTime implements SpeedTest {
    private static final int ARRAY_SIZE = 1_000_000;
    LinkedList<Integer> integerLinkedList = new LinkedList<>();

    public void fillArray() {
        Random randomInt = new Random();
        for (int i = 0; i < ARRAY_SIZE; i++) {
            integerLinkedList.add(randomInt.nextInt(Integer.MAX_VALUE));
        }
        System.out.println("LinkedList size() : " + integerLinkedList.size());
    }

    @Override
    public void addLast() {
        Integer addedElem = 242424;
        long before = System.nanoTime();
        integerLinkedList.add(addedElem);
        long after = System.nanoTime();
        long resultTime = (after - before);
        System.out.println("LinkedList - add last element: " + resultTime + " ns");
    }

    @Override
    public void addFirstPart() {
        Integer addedElem = 242424;
        long before = System.nanoTime();
        integerLinkedList.add(242424, addedElem);
        long after = System.nanoTime();
        long resultTime = (after - before);
        System.out.println("LinkedList - add in first part element: " + resultTime + " ns");
    }

    @Override
    public void getLast() {
        long before = System.nanoTime();
        Integer lastElem = integerLinkedList.getLast();
        long after = System.nanoTime();
        long resultTime = (after - before);
        System.out.println("LinkedList - get last element: " + resultTime + " ns");

    }

    @Override
    public void getFirstPart() {
        long before = System.nanoTime();
        Integer getElem = integerLinkedList.get(242424);
        long after = System.nanoTime();
        long resultTime = (after - before);
        System.out.println("LinkedList - get with first part element: " + resultTime + " ns");

    }

    @Override
    public void removeLast() {
        long before = System.nanoTime();
        integerLinkedList.removeLast();
        long after = System.nanoTime();
        long resultTime = (after - before);
        System.out.println("LinkedList - remove last element: " + resultTime + " ns");
    }

    @Override
    public void removeFirstPart() {
        long before = System.nanoTime();
        integerLinkedList.remove(242424);
        long after = System.nanoTime();
        long resultTime = (after - before);
        System.out.println("LinkedList - remove with first part element: " + resultTime + " ns");
    }
}
