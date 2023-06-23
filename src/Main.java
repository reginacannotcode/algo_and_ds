public class Main {
    public static void main(String[] args) {
        var node0 = new Node(1);
        var node1 = new Node(2);
        var node2 = new Node(3);
        var node3 = new Node(4);
        var node4 = new Node(5);

        node0.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        var list = new LinkedList(node0);
        System.out.println(list);
    }
}