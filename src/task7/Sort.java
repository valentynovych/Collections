package task7;

public class Sort {

    /**
     * найбільший елемент в кінець
     * Алгоритмічна складність O(n^2).
     */

    public static int[] bubbleSort(int[] inputArray) {
        int size = inputArray.length;
        int tmp;
        for (int i = 0; i < size - 1; i++) {
            for (int j = 1; j < size - i; j++) {
                if (inputArray[j - 1] > inputArray[j]) {
                    tmp = inputArray[j];
                    inputArray[j] = inputArray[j - 1];
                    inputArray[j - 1] = tmp;
                }
            }
        }
        return inputArray;
    }

    /**
     * За ключ беремо 2-й елемент масиву, порівнюємо з попередній (1-м)
     * рухаємо ключ вліво поки потрібно, повертаємось до позиції ключа
     * Алгоритмічна складність O(n^2).
     */
    public static int[] insertionSort(int[] inputArray) {
        int i, key, j;
        for (i = 1; i < inputArray.length; ++i) {
            key = inputArray[i];
            j = i - 1;

            while (j >= 0 && inputArray[j] > key) {
                inputArray[j + 1] = inputArray[j];
                j = j - 1;
            }
            inputArray[j + 1] = key;
        }
        return inputArray;
    }

    /**
     * Ділимо масив на 2, доки не залишиться масив з розміром 1
     * Алгоритмічна складність O(n log n).
     */
    static int count = 0;

    public static int[] mergeSort(int[] inputArray) {

        int size = inputArray.length;
        if (size < 2) return inputArray;

        int mid = size / 2;
        int[] left = new int[mid];
        int[] right = new int[size - mid];

        for (int i = 0; i < mid; i++) {
            left[i] = inputArray[i];
        }

        for (int i = mid; i < size; i++) {
            right[i - mid] = inputArray[i];
        }
        return merge(mergeSort(left), mergeSort(right));
    }

    private static int[] merge(int[] leftArray, int[] rightArray) {

        int globalIndex = 0;
        int leftIndex = 0;
        int rightIndex = 0;
        int[] mergeArray = new int[leftArray.length + rightArray.length];

        while (leftIndex < leftArray.length && rightIndex < rightArray.length) {
            //порівнюємо елементи 2-х масивів, записуємо в mergeArray менший і інкрементуємо індекс
            if (leftArray[leftIndex] < rightArray[rightIndex]) {
                mergeArray[globalIndex++] = leftArray[leftIndex++];
            } else mergeArray[globalIndex++] = rightArray[rightIndex++];
        }

        while (globalIndex < mergeArray.length) {
            if (leftIndex != leftArray.length) {
                mergeArray[globalIndex++] = leftArray[leftIndex++];
            } else mergeArray[globalIndex++] = rightArray[rightIndex++];
        }
        return mergeArray;
    }

    /**
     * шукаємо мінімальний елемент, ставимо його в arr[i], шукаем інший мінімальний.
     * Алгоритмічна складність O(n^2).
     */
    public static void selectionSort(int[] inputArray) {

        int size = inputArray.length;

        for (int i = 0; i < size; i++) {

            int position = i;
            int minElem = inputArray[i];
            //loop for takes min element
            for (int j = i + 1; j < size; j++) {
                if (inputArray[j] < minElem) {
                    position = j;
                    minElem = inputArray[j];
                }
            }
            if (minElem < inputArray[i]) {
                inputArray[position] = inputArray[i];
                inputArray[i] = minElem;
            }
        }
    }

    /**
     * Алгоритмічна складність O(n log n) - залежить від вхідного масиву.
     */
    public static void quickSort(int[] inputArray, int firstIndex, int lastIndex) {

        if (inputArray.length == 0 || firstIndex >= lastIndex) {
            return;
        }

        int pivot = inputArray[((firstIndex + lastIndex) / 2)];
        //int pivot = inputArray[lastIndex];
        int leftMarker = firstIndex;
        int rightMarker = lastIndex;

        while (leftMarker <= rightMarker) {
            //шукаємо більший елемент за pivot в лівій частині
            while (inputArray[leftMarker] < pivot) leftMarker++;
            //шукаємо менший елемент за pivot в правій частині
            while (inputArray[rightMarker] > pivot) rightMarker--;
            //заніна елементів між собою та оновлення маркерів
            if (leftMarker <= rightMarker) {
                int tmp = inputArray[leftMarker];
                inputArray[leftMarker] = inputArray[rightMarker];
                inputArray[rightMarker] = tmp;
                leftMarker++;
                rightMarker--;
            }
        }
        //сортуємо ліву частину від 0 до rightMarker
        if (firstIndex < rightMarker) {
            quickSort(inputArray, firstIndex, rightMarker);
        }
        //сортуємо праву частину від leftMarker до rightMarker
        if (lastIndex > leftMarker) {
            quickSort(inputArray, leftMarker, lastIndex);
        }
    }
}
