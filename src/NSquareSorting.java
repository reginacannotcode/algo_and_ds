public class NSquareSorting {
    public static void insertionSort(int[] array) {
        int tmp;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    tmp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = tmp;
                } else {
                    break;
                }
            }
        }
    }

    public static void selectionSort(int[] array) {
        int tmp;
        for (int i = 0; i < array.length; i++) {
            int smallestPos = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[smallestPos]) {
                    smallestPos = j;
                }
            }
            tmp = array[i];
            array[i] = array[smallestPos];
            array[smallestPos] = tmp;
        }
    }

    public static void bubbleSort(int[] array) {
        int tmp;
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
    }
}
