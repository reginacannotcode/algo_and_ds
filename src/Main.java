public class Main {
    public static void main(String[] args) {
        var list = new LinkedList(1);
        list.append(2).append(3).append(4).append(5).append(6).append(3).append(3);
        System.out.println(list); // 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 3 -> 3
        System.out.println(list.getFirst(3) == list.getByPos(2)); // true
        System.out.println(list.getLast(3) == list.getByPos(7)); // true
        var all = list.getAll(3);
        System.out.println(list.getAll(3)); // [3, 3, 3]
        try {
            list.updateByPos(6, 7);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println(list); // 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 3
        }

        list.deleteHead();
        System.out.println(list); // 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 3
        list.deleteTail();
        System.out.println(list); // 2 -> 3 -> 4 -> 5 -> 6 -> 7
        list.deleteByPos(2);
        System.out.println(list); // 2 -> 3 -> 5 -> 6 -> 7
        try {
            list.insertAtPos(3, 3);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println(list); // 2 -> 3 -> 5 -> 3 -> 6 -> 7
        }
        list.deleteAll(3);
        System.out.println(list); // 2 -> 5 -> 6 -> 7
    }
}