package datastructures.list;

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

    public Node getByPos(int pos) {
        if (pos < 0) {
            return null;
        }
        var curr = head;
        var i = 0;
        while (i < pos) {
            if (curr == null) {
                return null;
            }
            curr = curr.next;
            i++;
        }
        return curr;
    }

    public Node getFirst(int value) {
        var curr = head;
        while (curr != null) {
            if(curr.value == value) {
                return curr;
            }
            curr = curr.next;
        }
        return null;
    }

    public Node getLast(int value) {
        var curr = head;
        Node result = null;
        while (curr != null) {
            if(curr.value == value) {
                result = curr;
            }
            curr = curr.next;
        }
        return result;
    }

    public ArrayList<Node> getAll(int value) {
        var curr = head;
        var result = new ArrayList<Node>();
        while (curr != null) {
            if(curr.value == value) {
                result.add(curr);
            }
            curr = curr.next;
        }
        return result;
    }

    public LinkedList updateByPos(int pos, int newValue) throws Exception {
        if (pos < 0) {
            throw new Exception("Update position out of range");
        }
        var curr = head;
        var i = 0;
        while (i < pos) {
            if (curr == null) {
                throw new Exception("Update position out of range");
            }
            curr = curr.next;
            i++;
        }
        if (curr == null) {
            throw new Exception("Update position out of range");
        }
        curr.value = newValue;
        return this;
    }

    public LinkedList deleteHead() {
        if (head == null) {
            return this;
        }
        head = head.next;
        return this;
    }

    public LinkedList deleteTail() {
        if (head == null) {
            return this;
        }
        if (head.next == null) {
            head = null;
            return this;
        }
        var prev = head;
        var curr = prev.next;
        while (curr.next != null) {
            prev = curr;
            curr = curr.next;
        }
        prev.next = null;
        return this;
    }

    public LinkedList deleteByPos(int pos) {
        if (pos < 0 || head == null) {
            return this;
        }
        if (pos == 0) {
            return deleteHead();
        }
        var prev = head;
        var curr = prev.next;
        var i = 1;
        while (i < pos) {
            if (curr == null) {
                return this;
            }
            prev = curr;
            curr = curr.next;
            i++;
        }
        if (curr == null) {
            return this;
        }
        prev.next = curr.next;
        curr.next = null;
        return this;
    }

    public LinkedList deleteFirst(int val) {
        if (head == null) {
            return this;
        }
        if (head.value == val) {
            return deleteHead();
        }
        var prev = head;
        var curr = prev.next;
        while (curr != null) {
            if (curr.value == val) {
                prev.next = curr.next;
                curr.next = null;
                return this;
            }
            prev = curr;
            curr = curr.next;
        }
        return this;
    }

    public LinkedList deleteLast(int val) {
        if (head == null) {
            return this;
        }
        Node lastPrev = null;
        Node last = null;
        if (head.value == val) {
            last = head;
        }
        var prev = head;
        var curr = prev.next;
        while (curr != null) {
            if (curr.value == val) {
                lastPrev = prev;
                last = curr;
            }
            prev = curr;
            curr = curr.next;
        }
        if (last == null) {
            return this;
        } else if (lastPrev == null) {
            return deleteHead();
        }
        lastPrev.next = last.next;
        last.next = null;
        return this;
    }

    public LinkedList deleteAll(int val) {
        if (head == null) {
            return this;
        }
        while (head.value == val) {
            deleteHead();
        }
        var prev = head;
        var curr = prev.next;
        while (curr != null) {
            if (curr.value == val) {
                prev.next = curr.next;
                curr = curr.next;
            } else {
                prev = curr;
                curr = curr.next;
            }
        }
        return this;
    }
}


















