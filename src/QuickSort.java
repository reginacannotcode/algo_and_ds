public class QuickSort {
    public static void sort(int[] array) {
        sortSection(array, 0, array.length - 1);
    }

    private static void sortSection(int[] array, int start, int end) {
        if (start >= end) {
            return;
        }
        int p = partition(array, start, end);
        sortSection(array, start, p - 1);
        sortSection(array, p + 1, end);
    }

    private static int partition(int[] array, int start, int end) {
        int pivot = array[start];
        int biggest_smallest = start;
        int tmp;
        for (int i = start + 1; i <= end; i++) {
            if (array[i] <= pivot) {
                biggest_smallest++;
                tmp = array[biggest_smallest];
                array[biggest_smallest] = array[i];
                array[i] = tmp;
            }
        }
        array[start] = array[biggest_smallest];
        array[biggest_smallest] = pivot;
        return biggest_smallest;
    }
}
