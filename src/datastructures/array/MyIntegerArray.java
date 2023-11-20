package datastructures.array;

public class MyIntegerArray {
    private int[] array;
    private int effectiveLen;

    public MyIntegerArray(int[] array) {
        this.array = array;
        this.effectiveLen = array.length;
    }

    public void printElements() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public void printEffectiveElements() {
        for (int i = 0; i < effectiveLen; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public boolean delete(int index) {
        if (index >= effectiveLen) {
            return false; // throw exception
        }
        for (int i = index; i < effectiveLen - 1; i++) {
            array[i] = array[i + 1];
        }
        effectiveLen--;
        return true;
    }

    public boolean insert(int index, int value) {
        if (index > effectiveLen || effectiveLen == array.length) {
            return false;
        }

        for (int i = effectiveLen; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = value;
        effectiveLen++;
        return true;
    }
}
