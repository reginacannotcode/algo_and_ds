package algorithms;

public class MergeSort {
    public static void sort(int[] array) {
        sortSection(array, 0, array.length - 1);
    }
    private static void sortSection(int[] array, int start, int end) {
        if (start == end) {
            return;
        }
        int mid = (start + end) / 2;
        sortSection(array, start, mid);
        sortSection(array, mid + 1, end);
        merge(array, start, mid + 1, end);
    }
    private static void merge(int[] array, int start, int start2, int end) {
        int len1 = start2 - start;
        int[] tmp = new int[len1];
        System.arraycopy(array, start, tmp, 0, len1);

        int p1 = 0;
        int p2 = start2;
        for (int i = start; i <= end; i++) {
            if (tmp[p1] <= array[p2]) {
                array[i] = tmp[p1];
                p1++;
                if (p1 == len1) {
                    break;
                }
            } else {
                array[i] = array[p2];
                p2++;
                if (p2 > end) {
                    while (p1 < len1) {
                        i++;
                        array[i] = tmp[p1];
                        p1++;
                    }
                }
            }
        }
    }
}
