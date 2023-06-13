package task7;

import java.util.Arrays;
import java.util.Random;

public class DemoSort {
    public static void main(String[] args) {
        Random randomInt = new Random();
        int[] unsortedArray = new int[187];
        long before, after;
        //unsortedArray = new int[]{4, 1, 2, 6, 3, 9};
        for (int i = 0; i < unsortedArray.length; i++) {
            unsortedArray[i] = randomInt.nextInt(100);
        }

        System.out.println("Input array ↓ ↓ ↓ ↓ ↓");
        System.out.println(Arrays.toString(unsortedArray));
        System.out.println("--------------------------------------------");

        int[] bubbleSortedArray = Arrays.copyOf(unsortedArray, unsortedArray.length);
        before = System.nanoTime();
        Sort.bubbleSort(bubbleSortedArray);
        after = System.nanoTime();
        System.out.println("Bubble sorting completed by: " + (after - before) + " ns");
        System.out.println(Arrays.toString(bubbleSortedArray));
        System.out.println("--------------------------------------------");

        int[] insertionSortedArray = Arrays.copyOf(unsortedArray, unsortedArray.length);
        before = System.nanoTime();
        Sort.insertionSort(insertionSortedArray);
        after = System.nanoTime();
        System.out.println("Insertion sorting completed by: " + (after - before) + " ns");
        System.out.println(Arrays.toString(insertionSortedArray));
        System.out.println("--------------------------------------------");

        int[] mergeSortedArray = Arrays.copyOf(unsortedArray, unsortedArray.length);
        before = System.nanoTime();
        mergeSortedArray = Sort.mergeSort(mergeSortedArray);
        after = System.nanoTime();
        System.out.println("Merge sorting completed by: " + (after - before) + " ns");
        System.out.println(Arrays.toString(mergeSortedArray));
        System.out.println("--------------------------------------------");

        int[] selectionSortedArray = Arrays.copyOf(unsortedArray, unsortedArray.length);
        before = System.nanoTime();
        Sort.selectionSort(selectionSortedArray);
        after = System.nanoTime();
        System.out.println("Selection sorting completed by: " + (after - before) + " ns");
        System.out.println(Arrays.toString(selectionSortedArray));
        System.out.println("--------------------------------------------");

        int[] quickSortedArray = Arrays.copyOf(unsortedArray, unsortedArray.length);
        before = System.nanoTime();
        Sort.quickSort(quickSortedArray, 0, quickSortedArray.length - 1);
        after = System.nanoTime();
        System.out.println("Quick sorting completed by: " + (after - before) + " ns");
        System.out.println(Arrays.toString(quickSortedArray));
        System.out.println("--------------------------------------------");

        System.out.println("Input array ↓ ↓ ↓ ↓ ↓");
        System.out.println(Arrays.toString(unsortedArray));
        System.out.println("--------------------------------------------");
    }
}
