public class LinkedList {
    public Node head;

    public LinkedList() {}
    public LinkedList(Node head) {
        this.head = head;
    }
    public LinkedList(int value) {
        this.head = new Node(value);
    }

    @Override
    public String toString() {
        if (head == null) {
            return "";
        }
        var strB = new StringBuilder();
        strB.append(head.value);
        var curr = head.next;
        while (curr != null) {
            strB.append(" -> ").append(curr.value);
            curr = curr.next;
        }
        return strB.toString();
    }
}


















