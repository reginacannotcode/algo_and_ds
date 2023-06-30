import java.util.ArrayList;

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

    public LinkedList append(int value) {
        if (head == null) {
            head = new Node(value);
            return this;
        }
        var curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = new Node(value);
        return this;
    }

    public LinkedList prepend(int value) {
        var newHead = new Node(value);
        newHead.next = head;
        head = newHead;
        return this;
    }

    public LinkedList insertAtPos(int pos, int value) throws Exception {
        if (pos < 0) {
            throw new Exception("Insert position out of range");
        }
        if (pos == 0) {
            prepend(value);
        }
        if (head == null) {
            throw new Exception("Insert position out of range");
        }
        var prev = head;
        var curr = head.next;
        var i = 1;
        while (i < pos) {
            if (curr == null) {
                throw new Exception("Insert position out of range");
            }
            prev = curr;
            curr = curr.next;
            i++;
        }
        var newNode = new Node(value);
        newNode.next = curr;
        prev.next = newNode;
        return this;
    }
}


















