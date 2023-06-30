public class Main {
    public static void main(String[] args) {
        var list = new LinkedList(1);
        list.append(2).append(3).append(4).append(5).append(6);
        System.out.println(list); // 1 -> 2 -> 3 -> 4 -> 5 -> 6
        list.prepend(-1).prepend(-2);
        System.out.println(list); // -2 -> -1 -> 1 -> 2 -> 3 -> 4 -> 5 -> 6
        try {
            list.insertAtPos(2, 0);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println(list); // -2 -> -1 -> 0 -> 1 -> 2 -> 3 -> 4 -> 5 -> 6
        }
    }
}