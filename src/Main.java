
public class Main {
    public static void main(String[] args) {
        var array = new int[10];
        for (var i = 0; i < array.length; i++) {
            array[i] = i;
        }

        var myIntArray = new MyIntegerArray(array);
        System.out.println("Initialized as");
        myIntArray.printElements();
        myIntArray.printEffectiveElements();

        System.out.println("Delete 9");
        myIntArray.delete(9);
        myIntArray.printElements(); // 0 1 2 3 4 5 6 7 8 9
        myIntArray.printEffectiveElements(); // 0 1 2 3 4 5 6 7 8

        System.out.println("Delete 3");
        myIntArray.delete(3);
        myIntArray.printElements(); // 0 1 2 4 5 6 7 8 8 9
        myIntArray.printEffectiveElements(); // 0 1 2 4 5 6 7 8

        System.out.println("At index 8 insert 10");
        myIntArray.insert(8, 10);
        myIntArray.printElements(); // 0 1 2 4 5 6 7 8 10 9
        myIntArray.printEffectiveElements(); // 0 1 2 4 5 6 7 8 10
    }
}